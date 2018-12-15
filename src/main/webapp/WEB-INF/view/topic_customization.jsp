<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/common/taglibs.jsp"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>舆情监督系统-话题定制</title>
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
		<div class="content-page">
			<!-- Start content -->
			<div class="content">
				<div class="am-g">
				<div class="am-u-md-10">
					<!-- row start -->
					<div class="card-box">
						<h4 class="header-title m-t-0 m-b-30">添加感兴趣的话题</h4>
						<div class="am-form">
						    <div class="am-form-group">
						      <label for="doc-ipt-email-2">话题名称</label>
						      <input id="topic_name" type="text" class="am-radius" id="doc-ipt-email-2" placeholder="请输入话题名称" value="贸易战">
						    </div>
						
						    <div class="am-form-group">
						      <label for="doc-ipt-pwd-2">关键词列表（以全角“，”隔开）</label>
						      <input id="keywords" type="text" class="am-radius" id="doc-ipt-pwd-2" placeholder="请输入该话题可能包含的关键词" value="美国，总统">
						    </div>
							
						    <button type="button" onclick="add_new_topic()" class="am-btn am-btn-primary">创建新话题</button>
						</div>
					</div>
				</div>
				</div>
			</div>
		</div>
		</div>
		
		<!-- navbar -->
		<a href="admin-offcanvas" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu" data-am-offcanvas="{target: '#admin-offcanvas'}"><!--<i class="fa fa-bars" aria-hidden="true"></i>--></a>
		
		<script type="text/javascript" src="/js/jquery-2.1.0.js" ></script>
		<script type="text/javascript" src="/js/amazeui.min.js"></script>
		<script type="text/javascript" src="/js/app.js" ></script>
		<script type="text/javascript" src="/js/blockUI.js" ></script>
		<script type="text/javascript" src="/js/topic_customization.js" ></script>
		<script type="text/javascript" src="/js/search_header.js"></script>
		<%}%>
	</body>
	
</html>
