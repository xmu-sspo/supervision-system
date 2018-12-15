<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>舆情监督系统-检索结果列表</title>
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
				<div class="card-box">
					  <!-- Row start -->
					  	<div class="am-g">			  	
        <div class="am-u-sm-12">
        
          <form class="am-form">
            <table class="am-table am-table-striped am-table-hover table-main">
              <thead>
              <tr>
                <th class="table-id">序号</th>
                <th class="table-title">标题</th>
                <th class="table-type">数据来源</th>
                <th class="table-author am-hide-sm-only">内容</th>
                <th class="table-date am-hide-sm-only">发表时间</th>
                <th class="table-date am-hide-sm-only">点击率</th>
                <th class="table-date am-hide-sm-only">查看原网址</th>
              </tr>
              </thead>
              <tbody id="table_tbody">
              	<c:forEach items="${news.newsList}" var="newsItem">
					 <tr>
						<td>${newsItem.id}</td>
						<td><a onclick='oneNews(${newsItem.id})'>${newsItem.title}</a></td>					
						<td>${newsItem.data_from}</td>
						<td class='am-hide-sm-only'>${fn:substring(newsItem.content,0,50)}...</td>									
						<td class='am-hide-sm-only'><fmt:formatDate value="${newsItem.time}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
						<td class='am-hide-sm-only'>${newsItem.click}</td>
						<td class='am-hide-sm-only'><a href="${newsItem.url}">...</a></td>
					</tr>
				</c:forEach>
              </tbody>
            </table>
            <div class="am-cf" >
              <div id='total_records'>共 ${news.total}条记录</div>
              <div class="am-fr" id="show_list">
                <ul class="am-pagination">
                  
                </ul>
              </div>
            </div>
          </form>
        </div>

      </div>
					  <!-- Row end -->					  
					</div>				
				</div>
			</div>
		</div>
		<!-- end right Content here -->
		<!--</div>-->
		</div>
		</div>
		
		<!-- navbar -->
		<a href="admin-offcanvas" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu" data-am-offcanvas="{target: '#admin-offcanvas'}"><!--<i class="fa fa-bars" aria-hidden="true"></i>--></a>
		
		<script type="text/javascript" src="/js/jquery-2.1.0.js" ></script>
		<script type="text/javascript" src="/js/search_result.js"></script>
		<script type="text/javascript" src="/js/amazeui.min.js"></script>
		<script type="text/javascript" src="/js/app.js" ></script>
		<script type="text/javascript" src="/js/blockUI.js" ></script>
		<script type="text/javascript" src="/js/search_header.js"></script>
		<%}%>
	</body>
	
</html>
