<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/common/taglibs.jsp"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>舆情监督系统</title>
		<link rel="stylesheet" href="/css/amazeui.css" />
		<link rel="stylesheet" href="/css/amazeui.datatables.css"/>
		<link rel="stylesheet" href="/css/font-awesome.min.css">
		<link rel="stylesheet" href="/css/core.css" />
		<link rel="stylesheet" href="/css/menu.css" />
		<link rel="stylesheet" href="/css/admin.css" />
		<link rel="stylesheet" href="/css/page/typography.css" />
		<link rel="stylesheet" href="/css/page/form.css" />
		<style>
			#tabs{
				width:500px;
				height:40px;
				margin:0;
				padding:0;
				margin-left: 1.5rem;
				margin-top: 15px;
				margin-bottom: 20px;
			}
			#tabs li{
				list-style:none;
				width:100px;
				height:40px;
				line-height:40px;
				float:left;
				background:#fff;
				margin-right:20px;
				text-align:center;
				border-radius: 40px;
				color: slategray;
			}
			#tabs li:hover{
				cursor: pointer;
				font-weight: bold;
			}
			#tabs .on{
				font-weight: bold;
			}
			thead th,
			td{
				text-align: center;
				vertical-align: middle;
			}
			th.title,
			tbody tr td:nth-child(2){
				text-align: left;
			}
			th.no,
			th.num{
				width: 130px;
				min-width: 120px;
			}
			th#hot,
			th#platform{
				width: 130px;
			}
			.title{
				min-width: 250px;
			}
			.no::after,
			.num::after{
   				font-family: FontAwesome;
			}
			.am-u-md-11 {
    			width: 100%;
    		}
    		#topic_list .sorting_asc::after {
    			content:"\f0de";
    		}
    		#topic_list .sorting_desc::after {
    			content:"\f0dd";
    		}
		</style>
	</head>
	<body>
	<% String username = (String)session.getAttribute("username");
		if(username == null){
			response.sendRedirect("login");
		%>
		<%}else{ %>
	  <jsp:include page="header.jsp" flush="true"/>		
		<div class="admin">
		  <jsp:include page="side_menu_bar.jsp" flush="true"/>			
		  <div class="content-page">
			<div class="content">
			    <ul id="tabs">
			    	<li class="topic_this_day on">当天热点</li>
			    	<li class="topic_three_days">三天内热点</li>
			    	<li class="topic_this_week">一周内热点</li>
			    	<li class="topic_this_month">一个月热点</li>
			    </ul>
				<!-- row start -->
				<div class="am-u-md-11">					
					<!-- col start -->
					<div class="card-box">
						<div class="am-g">
							<table class="am-table am-table-striped am-table-bordered am-table-compact" id="topic_list">
								    <thead>
								        <tr>
								            <th class="no">话题序号</th>
								            <th class="title">标题</th>
								            <th class="num">相关新闻数</th>
								            <th id="hot">话题热度分析</th>
								            <th id="platform">话题发布平台分析</th>
								        </tr>
								    </thead>
								    <tbody id="table_tbody"></tbody>
								</table>
						</div> 
					</div>
				</div>	
			</div>
		</div>
		<!--</div>-->
		</div>
		</div>
		
		<!-- navbar -->
		<a href="admin-offcanvas" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu" data-am-offcanvas="{target: '#admin-offcanvas'}"></a>
		
		<script type="text/javascript" src="/js/jquery-2.1.0.js" ></script>
		<script type="text/javascript" src="/js/topic_list.js" ></script>
		<script type="text/javascript" src="/js/amazeui.min.js"></script>
		<script type="text/javascript" src="/js/amazeui.datatables.min.js"></script>
		<script type="text/javascript" src="/js/app.js" ></script>
		<script type="text/javascript" src="/js/blockUI.js" ></script>
		<%}%>
	</body>
</html>



