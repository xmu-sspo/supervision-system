<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/common/taglibs.jsp"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
    <title>关键词搜索</title>
    <link rel="stylesheet" href="/css/amazeui.css" />
    <link rel="stylesheet" href="/css/font-awesome.min.css">
    <link rel="stylesheet" href="/css/core.css" />
    <link rel="stylesheet" href="/css/menu.css" />
    <link rel="stylesheet" href="/css/admin.css" />
    <link rel="stylesheet" href="/css/page/typography.css" />

</head>
<body>
	<!-- Begin page -->
	<jsp:include page="header.jsp" flush="true"/>
	<!-- end page -->
	
	
	<div class="admin">
	    <!-- sidebar start -->
	    <jsp:include page="side_menu_bar.jsp" flush="true"/>	
	    <!-- sidebar end -->
	    
	    <!-- Start right Content here -->
		<div class="content-page">
			<!-- Start content -->
			<div class="content">
			<div class="card-box">
				<div id="pie" style="width: 100%;height:400px;"></div>
			</div>
			</div>
		</div>
		<!-- end right Content here -->
	</div>
	
	<script type="text/javascript" src="/js/jquery-2.1.0.js" ></script>
		<script type="text/javascript" src="/js/amazeui.min.js"></script>
		<script type="text/javascript" src="/js/app.js" ></script>
		<script type="text/javascript" src="/js/blockUI.js" ></script>
		<script type="text/javascript" src="/js/charts/echarts.js" ></script>
		<script type="text/javascript" src="/js/charts/pieCharts.js" ></script>
	</body>
	
</html>

</body>
</html>