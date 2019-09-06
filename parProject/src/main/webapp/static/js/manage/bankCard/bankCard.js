var BankCardEditCls = {

		init : function(){
			this.initNode();
			this.bindEvent();
		}, 
		initNode : function(){
			this.$but = $(".layui-layer-btn0");
		},
		initData : function(){
			debugger;
			this.$data ={
					bankId : $("[name='bankId']").val(""),
					bankCard : $("[name='bankCard']").val(""),
					bankName : $("[name='bankName']").val(""),
					cardholder : $("[name='cardholder']").val(""),
					treasurer : $("[name='treasurer']").val(""),
					liabilities : $("[name='liabilities']").val(""),
					bankCard : $("[name='bankCard']").val(""),
					
					 
			}
		},
		bindEvent : function(){
			this.$but.on("click",this.userEdit)
		},
		userEdit : function(){
			UserEditCls.initData();
			CommonUtil.ObjextAjax($(this).attr("url"),BankCardEditCls.$data,BankCardAddCls.AjaxSucFn,true,"暂无权限","post")
		}
}

var BankCardAddCls = {
		init : function(){
			this.initNode();
			this.bindEvent();
			this.initData();
		},
		initNode: function(){
			this.$accountAjaxSucFn = this.SucFn;
			this.$AjaxErrFn = "暂无权限";
			this.$addBankCardAjaxSucFn = this.AjaxSucFn;
			this.$BankCardNo = $("[name = bankId]");
			this.$unselect = $(".layui-unselect");
			this.$requestType = "post";//请求方式
			this.$but = $("#Account");
			this.$enter = $(".layui-layer-btn0");
			
		},
		initData : function(){
			this.$BankCard = $("#BankCardForm").serialize();
		},
		bindEvent : function(){
			this.$but.on("click",this.account);
			this.$enter.on("click",this.addBankCard)
		},
		addBankCard : function(){
			BankCardAddCls.initData();
			if(BankCardAddCls.checkParam()){
				 $("[name='bankId']").val("");
				 $("[name='bankCard']").val("");
				 $("[name='bankName']").val("");
				 $("[name='cardholder']").val("");
				 $("[name='treasurer']").val("");
				 $("[name='liabilities']").val("");
				 $("[name='bankCard']").val("");
				 return;
			};
			CommonUtil.ObjextAjax($(this).attr("url"),BankCardAddCls.$BankCard,BankCardAddCls.$addBankCardAjaxSucFn,true,BankCardAddCls.$AjaxErrFn,BankCardAddCls.$requestType)
		},
		account : function(){
			/**
	         * ajax封装
	         * @param url	JS连接
	         * @param data	数据对象
	         * @param sucFn	成功的方法
	         * @param isAsync	是否数据同步 true  or false    默认为true
	         * @param errFn	错误的方法
	         * @param requestType	请求类型    get post  delete put ...
	         */
  			CommonUtil.ObjextAjax($(this).attr("url"),"account",BankCardAddCls.$accountAjaxSucFn,true,BankCardAddCls.$accountAjaxErrFn,BankCardAddCls.$requestType)
		},
		SucFn :function(data){
			if(data && data.success){
				BankCardAddCls.$BankCardNo.val(data.result)
				return;
			}else if(data && !data.success){
				layer.msg(data.message)
				return;
			}
		},
		checkParam : function(){
			debugger;
			$pass1 = $("[name='bankId']").val();
			$pass2 = $("[name='bankCard']").val();
			$pass3 = $("[name='bankName']").val();
			$pass4 = $("[name='cardholder']").val();
			$pass5 = $("[name='treasurer']").val();
			$pass6 = $("[name='liabilities']").val();
			$pass7 = $("[name='bankPhone']").val();
			$pass8 = $("[name='cardholderId']").val();
			if(!$pass1 ||!$pass2 ||!$pass3 ||!$pass4||!$pass5||!$pass6||!$pass7||!$pass8){
				layer.msg("参数为空");
				return true;
			}
			return false;
			
		},
		AjaxSucFn : function(data){
			if(data && data.success){
				layer.msg(data.message)
				parent.layer.closeAll();
				return;
			}else if(data && !data.success){
				layer.msg(data.message)
				return;
			}
		}
}
var BankCardClas = {
		init : function(){
			this.initNode();
			this.bindEvent()
			this.bankCardShowInit();
			this.query();
		},
		initNode : function(){
			this.$BankCardAdd = $("[data-type='add']");
			this.$table = $("#LAY-user-back-manage");
		},
		bindEvent : function() {
			this.$BankCardAdd.on("click",this.BankCardAdd);
		},
		BankCardAdd : function(){
			$url = $(this).attr("addUrl");
			$width = '630px';
			$higth = '500px';
			$title = '添加银行卡';
			BankCardClas.layuiOpen($url,$width,$higth,$title)
		},
		layuiOpen : function(url,width,higth,title){
		var lock  = true;//防止重复弹出,加锁
			if(lock){
				layer.open({
					type: 2,
					title:title,
					shadeClose: true,
					shade: false,
					maxmin: true, //开启最大化最小化按钮
					area: [width,higth],
					content: url,
					success: function(){
						lock  = false;
						  },
					end : function(){
						lock = true
						BankCardClas.reload({"":""});
					}
				});
			}
		},
		bankCardShowInit : function(){
			layui.use('table', function(){
				BankCardClas.$ObjectTable = layui.table;
				BankCardClas.$ObjectTable.render({
				    elem: BankCardClas.$table
				    ,url:BankCardClas.$table.attr('url')
				    ,cols: [[
				    	 {field: 'id', title: 'ID', hide :true, width:150,   fixed: 'left'}
					      ,{field: 'bankId', title: '银行本地编号', width:100}
					      ,{field: 'bankType', title: '银行类别', width:100}
					      ,{field: 'bankCard', title: '银行卡号', width: 160}
					      ,{field: 'bankName', title: '银行名称', width: 160}
					      ,{field: 'cardholder', title: '持卡人', width: 115}
					      ,{field: 'cardholderId', title: '持卡人身份证', width: 115}
					      ,{field: 'treasurer', title: '财务主管', width: 115}
					      ,{field: 'liabilities', title: '银行卡负责人', width: 115}
					      ,{field: 'bankAmount', title: '卡上余额', width: 135, sort: true}
					      ,{field: 'createTime', title: '创建时间', width: 135, sort: true}
					      ,{field: 'bankNote', title: '银行卡备注', width: 135}
					      ,{fixed: 'right', title:'操作', toolbar: '#operation', width:150}
				    ]]
				    , id: 'mytable'
				    ,page: true
				  });
				  //监听行工具事件
				BankCardClas.$ObjectTable.on('tool(LAY-user-back-manage)', function(obj){
				    var data = obj.data;
				    if(obj.event === 'del'){
				      layer.confirm('真的删除行么', function(index){
				    	var url = $("[lay-event='del']").attr("url");
				    	 var deta =  {bankCard : obj.data.bankCard};
				    	CommonUtil.ObjextAjax(url,deta,BankCardClas.AjaxSucFn,true,'无权限或网络错误，请联系开发人员处理','post');
				      });
				    } else if(obj.event === 'edit'){
				    	$url = $("[lay-event='edit']").attr("url");
				    	$url = $url + '?' + 'bankCard='+ obj.data.bankCard
						$width = '630px';
						$higth = '500px';
						$title = '修改用户信息';
						BankCardClas.layuiOpen($url,$width,$higth,$title);
				    }  
				  });
				});
		},
		query : function(){
			$("[lay-filter='LAY-user-back-search']").on("click",function(){
				 var bankCard = $('[name="bankCard"]').val();//获取输入框的值
				 var liabilities = $('[name="liabilities"]').val();//获取输入框的值
				 var bankId = $('[name="bankId"]').val();//获取输入框的值
				BankCardClas.reload({bankCard:bankCard,liabilities:liabilities,bankId:bankId})
			})
		},
		AjaxSucFn : function(data){
			if(data && data.success){
				layer.msg(data.message);
				BankCardClas.reload({"":""})
			}else if(data && !data.success){
				layer.msg(data.message)
			}
		},
		 reload:function(param){
			BankCardClas.$ObjectTable.reload('mytable',{ page:{  curr: 1} //重新从第 1 页开始
				                        , where: param//这里传参  向后台
				                        , url: 'bankCardList'//后台做模糊搜索接口路径
				                        , method: 'post'
				                          });
		} 
		
}
