<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/common/taglibs.jsp"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>舆情监督系统</title>
		<link rel="stylesheet" href="/css/amazeui.css" />
		<link rel="stylesheet" href="/css/font-awesome.min.css">
		<link rel="stylesheet" href="/css/core.css" />
		<link rel="stylesheet" href="/css/menu.css" />
		<link rel="stylesheet" href="/css/admin.css" />
		<link rel="stylesheet" href="/css/page/typography.css" />
		<link rel="stylesheet" href="/css/page/form.css" />

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
				<!-- row start -->
				<div class="am-g">					
					<!-- col start -->
					<div class="am-u-md-11">
						<div class="card-box">
							<table class="am-table  am-table-striped" id="topic_list">
								    <thead>
								        <tr>
								            <th>话题序号</th>
								            <th>标题</th>
								            <th>数据库索引</th>
								        </tr>
								    </thead>
								    <tbody id="table_tbody">
								      <c:forEach items="${topic_list}" var="topicItem">
										<tr>
											<td>${topicItem.id}</td>
											<td><a style='cursor:pointer' onclick="moredetails('${topicItem.news_list}')">${topicItem.title}</a></td>					
											<td>${topicItem.center_index}</td>
										</tr>
									</c:forEach>  
								    </tbody>
								</table>
						</div>
					</div>
					<!-- col end -->
				</div>
				<!-- row end -->

				
			</div>
		</div>
		<!-- end right Content here -->
		<!--</div>-->
		</div>
		</div>
		
		<!-- navbar -->
		<a href="admin-offcanvas" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu" data-am-offcanvas="{target: '#admin-offcanvas'}"><!--<i class="fa fa-bars" aria-hidden="true"></i>--></a>
		
		<script type="text/javascript" src="/js/jquery-2.1.0.js" ></script>
		<script type="text/javascript" src="/js/topic_list.js" ></script>
		<script type="text/javascript" src="/js/amazeui.min.js"></script>
		<script type="text/javascript" src="/js/app.js" ></script>
		<script type="text/javascript" src="/js/blockUI.js" ></script>



	</body>
	
</html>
