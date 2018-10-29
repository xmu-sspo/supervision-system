<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/common/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>news</title>
	<link rel="stylesheet" type="text/css" href="${ctx}/css/news.css">
</head>
<body>
  <div class="keys">
  	
  </div>
  <div class="box">
	<table class="table">
		<thead>
			<tr>
				<th>序号</th>
				<th>数据来源</th>
				<th>标题</th>
				<th>内容</th>
				<th>发表时间</th>
				<th>点击率</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${news}" var="newsItem">
				<tr>
					<td>${newsItem.id}</td>					
					<td>${newsItem.dataFrom}</td>
					<td>${newsItem.title}</td>
					<td>${newsItem.content}</td>
					<td>${newsItem.time}</td>
					<td>${newsItem.clickRate}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
  </div>
</body>
</html>