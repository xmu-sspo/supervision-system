<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/common/taglibs.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>舆情监督系统-已关注话题</title>
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
		
		
		
	<!--	<div class="am-g">-->
		<!-- ============================================================== -->
		<!-- Start right Content here -->
		<div class="content-page">
			<!-- Start content -->
			<div class="content">
				<div class="card-box">
					  <!-- Row start -->
					  	<div class="am-g">
					        <div class="am-u-sm-12">
					            <table class="am-table am-table-striped am-table-hover table-main">
					              <thead>
					              <tr>
					                <th class="table-id">ID</th>
					                <th class="am-hide-sm-only">话题名称</th>
					                <th class="am-hide-sm-only">关键词列表</th>
					                <th class= "am-hide-sm-only">包含新闻</th>
					                <th class="table-set">操作</th>
					              </tr>
					              </thead>
					              <tbody id="table_tbody">
					              	<c:forEach items="${userTopiclist}" var="userTopicItem">
										 <tr>
											<td>${userTopicItem.id}</td>
											<td class='am-hide-sm-only'>${userTopicItem.topic_name}</td>					
											<td class='am-hide-sm-only'>${userTopicItem.keywords}</td>
											<td class='am-hide-sm-only'>${userTopicItem.news_list}</td>									
											<td>
							                  <div class="am-btn-toolbar">
							                    <div class="am-btn-group am-btn-group-xs">
							                      <button class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only" onclick="delete_click(${userTopicItem.id})">
							                      <span class="am-icon-trash-o"></span> 删除</button>
							                    </div>
							                  </div>
							                </td>
										</tr>
									</c:forEach>
					              </tbody>
					            </table>
					            <div class="am-cf" id="total_records">共 ${fn:length(userTopiclist)}条记录</div>
					        </div>
					      </div>
					  <!-- Row end -->				  
					</div>
				</div>
			</div>
		</div>
		<!-- end right Content here -->

		
		<!-- navbar -->
		<a href="admin-offcanvas" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu" data-am-offcanvas="{target: '#admin-offcanvas'}"><!--<i class="fa fa-bars" aria-hidden="true"></i>--></a>
		
		<script type="text/javascript" src="/js/jquery-2.1.0.js" ></script>
		<script type="text/javascript" src="/js/amazeui.min.js"></script>
		<script type="text/javascript" src="/js/app.js" ></script>
		<script type="text/javascript" src="/js/blockUI.js" ></script>
		<script type="text/javascript" src="/js/topic_of_concern.js" ></script>
		<script type="text/javascript" src="/js/search_header.js"></script>
		<%}%>
	</body>
	
</html>
