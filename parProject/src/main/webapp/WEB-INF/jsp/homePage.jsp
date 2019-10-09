<!DOCTYPE html>
<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<html><head>
  <meta charset="utf-8">
  <title>交易情况可视化</title>
   <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
<%@include file="common/common.jsp"%>
<%@include file="common/highcharts.jsp"%>
<body layadmin-themealias="default">
  <div class="layui-fluid">
    <div class="layui-row layui-col-space15">
      <div class="layui-col-md6" style="margin-top: 31px;">
        <div class="layui-card">
          <div class="layui-card-header">月交易流量图</div>
          <div class="layui-card-body">
            <div style="min-width:400px;height:400px" class="layui-carousel layadmin-carousel layadmin-dataview" data-anim="fade" lay-filter="LAY-index-normline" lay-anim="fade" style="width: 100%; height: 280px;">
            <div id="container2" style="min-width:400px;height:400px"></div>
            </div>
          </div>
        </div>
        <div class="layui-card" style=" height: 475px; ">
          <div class="layui-card-header">交易金额关系图</div>
          <div class="layui-card-body">
            <div class="layui-carousel layadmin-carousel layadmin-dataview" data-anim="fade" lay-filter="LAY-index-heapline" lay-anim="fade" style="width: 100%; height: 280px;">
             <div id="container1" style="min-width:400px;height:400px"></div>
            </div>
          </div>
        </div>
      </div> 
      <div class="layui-col-md6" style="margin-top: 31px;">
        <div class="layui-card">
          <div class="layui-card-header">交易比率</div>
          <div class="layui-card-body">
            <div style="min-width:400px;height:400px" class="layui-carousel layadmin-carousel layadmin-dataview" data-anim="fade" lay-filter="LAY-index-normline" lay-anim="fade" style="width: 100%; height: 280px;">
          <div id="container3" style="min-width:400px;height:400px"></div>
            </div>
          </div>
        </div>
        <div class="layui-card" style=" height: 475px; ">
          <div class="layui-card-header">月交易流量图</div>
          <div class="layui-card-body">
            <div class="layui-carousel layadmin-carousel layadmin-dataview" data-anim="fade" lay-filter="LAY-index-heapline" lay-anim="fade" style="width: 100%; height: 280px;">
           <div id="container" style="min-width:400px;height:400px"></div>
            </div>
          </div>
        </div>
      </div> 
     <!--  <div class="layui-col-md6" style="height: 800px;background-color: #a58f8f30;margin-top: 31px;">
        <div class="layui-card">
          <div class="layui-card-header"> 交易情况汇总 </div>
          <div class="layui-card-body">
           		
				<div class="layui-card-header"></div>
           		<div class="layui-carousel layadmin-carousel layadmin-dataview" data-anim="fade" lay-filter="LAY-index-heapline" lay-anim="fade" style="width: 100%; height: 280px;">
            	 
            	</div>
				<div class="layui-card-header"></div>
           		<div class="layui-carousel layadmin-carousel layadmin-dataview" data-anim="fade" lay-filter="LAY-index-heapline" lay-anim="fade" style="width: 100%; height: 280px;">
            	 
            	</div>
          </div>
        </div>
      </div>  -->
      </div> 
    </div>
</body>
</html>
<script type="text/javascript">
layui.use('element', function(){
  var element = layui.element;
});
var timeList = ${timeList};
var sum = ${sum};
var dealDaySuList = ${dealDaySuList};
var dealDayMoneySuList = ${dealDayMoneySuList};
var dealDayList = ${dealDayList};
var dealDayMoneyList = ${dealDayMoneyList};
</script>
  <script type="text/javascript" src="${ctx}/static/js/manage/account/highchartsUserShow.js">
  </script>
