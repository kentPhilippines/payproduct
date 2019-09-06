
var AccountFeeEditCls = {
		init : function(){
			this.initNode();
			this.bindEvent();
		}, 
		initNode : function(){
			this.$but = $(".layui-layer-btn0");
		},
		initData : function(){
			this.$data ={
					accountId:$("[name=accountId]").val(),
					id:$("[name=id]").val(),
					accountChannel:$("[name=accountChannel]").val(),
					channelProduct:$("[name=channelProduct]").val(),
					accountFee:$("[name=accountFee]").val(),
					accountCost:$("[name=accountCost]").val(),
					withdrawal:$("[name=withdrawal]").val(),
					withdrawalCost:$("[name=withdrawalCost]").val(),
					feeStautus:$("[name=feeStautus]").val(),
			}
		},
		bindEvent : function(){
			this.$but.on("click",this.AccountFeeEdit)
		},
		AccountFeeEdit : function(){
			AccountFeeEditCls.initData();
			CommonUtil.ObjextAjax($(this).attr("url"),
					AccountFeeEditCls.$data,
					AccountFeeEditCls.AjaxSucFn,true,"暂无权限","post")
		},
		AjaxSucFn : function(data){
			if(data && data.success){
				layer.msg(""+data.message);
				parent.layer.closeAll();
			}else if(data && !data.success){
				layer.msg(""+data.message)
			}
		}
}

var AccountFeeAddCls = {
		init : function(){
			this.initNode();
			this.bindEvent();
			this.initData();
		},
		initNode: function(){
			this.$AjaxErrFn = "暂无权限";
			this.$addAccountFeeAjaxSucFn = this.AjaxSucFn;
			this.$unselect = $(".layui-unselect");
			this.$requestType = "post";//请求方式
			this.$enter = $(".layui-layer-btn0");
		},
		initData : function(){
			this.$AccountFeeForm = $("#AccountFeeForm").serialize();
		},
		bindEvent : function(){
			this.$enter.on("click",this.addAccountFee)
		},
		addAccountFee : function(){
			AccountFeeAddCls.initData();
			if(AccountFeeAddCls.checkParam()){
				 $("[name='accountId']").val("");
				 $("[name='accountChannel']").val("");
				 $("[name='channelProduct']").val("");
				 return;
			};
			debugger;
			CommonUtil.ObjextAjax($(this).attr("url"),
					AccountFeeAddCls.$AccountFeeForm,
					AccountFeeAddCls.$addAccountFeeAjaxSucFn, true,
					AccountFeeAddCls.$AjaxErrFn,
					AccountFeeAddCls.$requestType)
		},
		checkParam : function(){
			debugger;
			$pass1 = $("[name='accountId']").val();
			$pass2 = $("[name='accountChannel']").val();
			$pass3 = $("[name='channelProduct']").val();
			$pass4 = $("[name='accountFee']").val();
			$pass5 = $("[name='accountCost']").val();
			$pass6 = $("[name='withdrawal']").val();
			$pass7 = $("[name='withdrawalCost']").val();
			$pass8 = $("[name='feeStautus']").val();
			if(!$pass1 ||!$pass2 ||!$pass3 ||!$pass4 ||!$pass5 ||!$pass3 ||!$pass2 ||!$pass3){
				layer.msg("参数为空");
				return true;
			}
			return false;
			
		},
		AjaxSucFn : function(data){
			if(data && data.success){
				layer.msg(""+data.message)
				parent.layer.closeAll();
				return;
			}else if(data && !data.success){
				layer.msg(""+data.message)
				return;
			}
		}
}

var AccountFeeClas = {
		init : function(){
			this.initNode();
			this.bindEvent()
			this. accountFeeShowInit();
			this.query();
		},
		initNode : function(){
			this.$AccountFeeAdd = $("[data-type='add']");
			this.$table = $("#LAY-user-back-manage");
		},
		bindEvent : function() {
			this.$AccountFeeAdd.on("click",this.AccountFeeAdd);
		},
		AccountFeeAdd : function(){
			$url = $(this).attr("addUrl");
			$width = '630px';
			$higth = '800px';
			$title = '添加用户';
			AccountFeeClas.layuiOpen($url,$width,$higth,$title)
		},
		layuiOpen : function(url,width,higth,title){
			layer.open({
				type: 2,
				title:title,
				shadeClose: true,
				shade: false,
				maxmin: true, //开启最大化最小化按钮
				area: [width,higth],
				content: url,
				success: function(){
				},
				end : function(){
					lock = true
					AccountFeeClas.reload({"":""});
				}
			});
		},
		accountFeeShowInit : function(){
			layui.use('table', function(){
				AccountFeeClas.$ObjectTable = layui.table;
				AccountFeeClas.$ObjectTable.render({
					elem: AccountFeeClas.$table
					,url:AccountFeeClas.$table.attr('url')
					,cols: [[
						{field: 'id', title: 'ID', hide :true, width:150,   fixed: 'left'}
						,{field: 'accountId', title: '商户编号', width:160}
						,{field: 'accountChannel', title: '账户渠道', width:160}
						,{field: 'channelProduct', title: '产品类型', width: 160}
						,{field: 'accountFee', title: '费率', width: 160}
						,{field: 'accountCost', title: '费率成本', width: 160}
						,{field: 'withdrawal', title: '取款手续费', width: 160}
						,{field: 'withdrawalCost', title: '取款手续费成本', width: 160}
						,{field: 'feeStautus', title: '费率状态', width: 160}
						,{field: 'createTime', title: '创建时间', width: 135, sort: true}
						,{fixed: 'right', title:'操作', toolbar: '#operation', width:150}
						]]
				, id: 'mytable'
					,page: true
				});
				//监听行工具事件
				AccountFeeClas.$ObjectTable.on('tool(LAY-user-back-manage)', function(obj){
					var data = obj.data;
					if(obj.event === 'del'){
						layer.confirm('真的删除行么', function(index){
							var url = $("[lay-event='del']").attr("url");
							var deta =  {
									id:obj.data.id,
							};
							CommonUtil.ObjextAjax(
									url,deta,AccountFeeClas.AjaxSucFn,
									true,'无权限或网络错误，请联系开发人员处理','post');
						});
					} else if(obj.event === 'edit'){
						var url = $("[lay-event='edit']").attr("url");
						url = url +   '?id='+ obj.data.id 
						$width = '630px';
						$higth = '500px';
						$title = '商户费率修改';
						AccountFeeClas.layuiOpen(url,$width,$higth,$title);
					}  
				});
			});
		},
		query : function(){
			$("[lay-filter='LAY-user-back-search']").on("click",function(){
				 var accountId = $('[name="accountId"]').val();//获取输入框的值
				 var accountChannel = $('[name="accountChannel"]').val();//获取输入框的值
				 var channelProduct = $('[name="channelProduct"]').val();//获取输入框的值
				AccountFeeClas.reload({
					accountId:accountId,
					accountChannel:accountChannel,
					channelProduct:channelProduct
				})
			})
		},
		AjaxSucFn : function(data){
			if(data && data.success){
				layer.msg(""+data.message);
				AccountClas.reload({"":""})
			}else if(data && !data.success){
				layer.msg(""+data.message)
			}
		},
		 reload:function(param){
			AccountFeeClas.$ObjectTable.reload('mytable',{ page:{  curr: 1} //重新从第 1 页开始
				                        , where: param//这里传参  向后台
				                        , url: 'accountFeeList'//后台做模糊搜索接口路径
				                        , method: 'post'
				                          });
		} 
		
}





var AccountClas = {
		init : function(){
			this.initNode();
			this.bindEvent()
			this. AccountShowInit();
			this.query();
		},
		initNode : function(){
			this.$AccountAdd = $("[data-type='add']");
			this.$table = $("#LAY-user-back-manage");
		},
		bindEvent : function() {
			this.$AccountAdd.on("click",this.AccountAdd);
		},
		AccountAdd : function(){
			var deta = {};
			var url = $(this).attr("addUrl")
			CommonUtil.ObjextAjax(url,deta,AccountClas.AjaxSucFn,true,'无权限或网络错误，请联系开发人员处理','post');
		},
		layuiOpen : function(url,width,higth,title){
				layer.open({
					type: 2,
					title:title,
					shadeClose: true,
					shade: false,
					maxmin: true, //开启最大化最小化按钮
					area: [width,higth],
					content: url,
					success: function(){
						  },
					end : function(){
						lock = true
						AccountClas.reload({"":""});
					}
				});
		},
		AccountShowInit : function(){
			layui.use('table', function(){
				AccountClas.$ObjectTable = layui.table;
				AccountClas.$ObjectTable.render({
				    elem: AccountClas.$table
				    ,url:AccountClas.$table.attr('url')
				    ,cols: [[
				    	   {field: 'id', title: 'ID', hide :true, width:150,   fixed: 'left'}
					      ,{field: 'accountId', title: '商户编号', width:160}
					      ,{field: 'accountName', title: '商户名称', width:160}
					      ,{field: 'cashBalance', title: '可提现余额', width: 160}
					      ,{field: 'freezeBalance', title: '冻结资金', width: 160}
					      ,{field: 'accountBalance', title: '可提现余额', width: 160}
					      ,{field: 'dayDealAmountMax', title: '商户日交易额度', width: 160}
					      ,{field: 'dayDealAmountMin', title: '交易最低限额', width: 160}
					      ,{field: 'sumDealAmount', title: '累计交易额', width: 160}
					      ,{field: 'sumDealToDayAmount', title: '当天累计交易额', width: 160}
					      ,{field: 'createTime', title: '创建时间', width: 135, sort: true}
					      ,{fixed: 'right', title:'操作', toolbar: '#operation', width:150}
				    ]]
				    , id: 'mytable'
				    ,page: true
				  });
				  //监听行工具事件
				AccountClas.$ObjectTable.on('tool(LAY-user-back-manage)', function(obj){
				    var data = obj.data;
				    if(obj.event === 'del'){
				      layer.confirm('真的删除行么', function(index){
				    	var url = $("[lay-event='del']").attr("url");
				    	 var deta =  {accountId : obj.data.accountId};
				    	CommonUtil.ObjextAjax(url,deta,AccountClas.AjaxSucFn,true,'无权限或网络错误，请联系开发人员处理','post');
				      });
				    } else if(obj.event === 'edit'){
				    	var url = $("[lay-event='edit']").attr("url");
				    	url = url +   '?accountId='+obj.data.accountId
				    	window.location.href=url;
				    }  
				  });
				});
		},
		query : function(){
			$("[lay-filter='LAY-user-back-search']").on("click",function(){
				 var accountId = $('[name="accountId"]').val();//获取输入框的值
				 var accountName = $('[name="accountName"]').val();//获取输入框的值
				AccountClas.reload({accountId:accountId,accountName:accountName})
			})
		},
		AjaxSucFn : function(data){
			if(data && data.success){
				layer.msg(""+data.message);
				AccountClas.reload({"":""})
			}else if(data && !data.success){
				layer.msg(""+data.message)
			}
		},
		 reload:function(param){
			AccountClas.$ObjectTable.reload('mytable',{ page:{  curr: 1} //重新从第 1 页开始
				                        , where: param//这里传参  向后台
				                        , url: 'accountList'//后台做模糊搜索接口路径
				                        , method: 'post'
				                          });
		} 
		
}
