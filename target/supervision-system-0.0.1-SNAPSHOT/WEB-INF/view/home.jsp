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

</head>
<body>
	<div id="logo">
		<img id="logo_img" src="/images/logo.png">
	</div>

	<div class="col-lg-6" style="margin-top:20px;">
		<div class="input-group">
			<input type="text" class="form-control" id="keywords" value="美国总统和上海政府官员会面"> <!--  placeholder="请输入要查询的关键字">-->
			<span class="input-group-btn">
				<a href="table_complete">
				<button class="btn btn-default" id="search" type="button">搜索</button></a>
			</span>
		</div><!-- /input-group -->
	</div><!-- /.col-lg-6 -->


	<br><br>

	<div id="deal_history">
		<button id="search_histroy" class="btn btn-default">搜索历史</button>
		<button class="btn btn-default" id="empty">清除历史</button>
	</div>


	<div style="margin:20px;" id="history">

	</div>


	<script src="/js/jquery.min.js"></script>
    <script src="/js/home.js"></script>

</body>
</html>