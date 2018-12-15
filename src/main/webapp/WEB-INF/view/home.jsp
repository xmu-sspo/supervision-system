<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/common/taglibs.jsp"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
    <title>关键词搜索</title>

    <link rel="stylesheet" type="text/css" href="/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="/css/home.css">
    <link rel="stylesheet" href="/css/amazeui.css" />
    <link rel="stylesheet" href="/css/font-awesome.min.css">
    <link rel="stylesheet" href="/css/core.css" />
    <link rel="stylesheet" href="/css/menu.css" />
    <link rel="stylesheet" href="/css/admin.css" />
    <link rel="stylesheet" href="/css/page/typography.css" />
    <link rel="stylesheet" href="/css/page/form.css" />

</head>
<body>
<% String username = (String)session.getAttribute("username");
		if(username == null){
			response.sendRedirect("login");
		%>
		<%}else{ %>
	<!-- Begin page -->
	<jsp:include page="header.jsp" flush="true"/>
	<!-- end page -->
	
	
	<div class="admin">
	    <!-- sidebar start -->
	    <jsp:include page="side_menu_bar.jsp" flush="true"/>	
	    <!-- sidebar end -->
	
	    <!-- Start right Content here -->
	    <div class="content-page" id="content">
	        <!-- Start content -->
	        <div id="content">
	            <div class="am-g" >
	                <!-- Row start -->
	                <div class="am-u-sm-12">
	                    <div id="son_div" >
	                        <div id="logo">
	                            <img id="logo_img" src="/images/logo.png">
	                        </div>
	
	                        <div class="col-lg-6" style="margin-top:20px;">
	                            <div class="input-group">
	                                <input type="text" class="form-control" id="keywords" placeholder="请输入关键词"> <!--  placeholder="请输入要查询的关键字">-->
									<span class="input-group-btn">
										<button class="btn btn-default" id="search">检索</button>
									</span>
	                            </div><!-- /input-group -->
	                        </div><!-- /.col-lg-6 -->
	
	
	                        <br><br>
	
	                        <div id="deal_history">
	                            <button id="search_histroy" class="btn btn-default">检索历史</button>
	                            <button class="btn btn-default" id="empty">清除历史</button>
	                        </div>
	
	
	                        <div style="margin:20px;" id="history">
	
	                        </div>
	
	
	                    </div>
	                </div>
	                <!-- Row end -->
	            </div>
	
	
	
	
	        </div>
	    </div>
	    <!-- end right Content here -->
	    <!--</div>-->
	</div>
	</div>
	
	<!-- navbar -->
	<a href="admin-offcanvas" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu" data-am-offcanvas="{target: '#admin-offcanvas'}"><!--<i class="fa fa-bars" aria-hidden="true"></i>--></a>
	
	<script type="text/javascript" src="/js/jquery.min.js"></script>
	<script type="text/javascript" src="/js/home.js"></script>
	<script type="text/javascript" src="/js/amazeui.min.js"></script>
	<script type="text/javascript" src="/js/app.js" ></script>
	<script type="text/javascript" src="/js/blockUI.js" ></script>
<%}%>
</body>
</html>