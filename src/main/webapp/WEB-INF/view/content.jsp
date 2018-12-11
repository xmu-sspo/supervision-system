<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/common/taglibs.jsp"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>新闻详情</title>
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
                <!-- Row start -->
                <div class="am-u-sm-12">
                    <div class="card-box">
                        <ul class="am-nav am-fr">
                            <li class="am-dropdown" data-am-dropdown>
                                <a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;">
                                    <span class="am-icon-caret-down"></span>
                                </a>
                                <ul class="am-dropdown-content">
                                    <li>1231234</li>
                                    <li>1231234</li>
                                    <li>1231234</li>
                                    <li>1231234</li>
                                </ul>
                            </li>
                        </ul>

                        <form action="" class="am-form" data-am-validator>
                            <fieldset>
                                <legend id="title"></legend>

                                <div class="am-form-group" id="data_from">
                                    <label >来源：</label>
                                </div>
                                
                                 <div class="am-form-group" id="url">
                                    <label >原网址：</label>
                                </div>

                                <div class="am-form-group" id="time">
                                    <label >发表时间：</label>
                                </div>
                                
                                 <!-- <div class="am-form-group" id="author">
                                    <label >作者：</label>
                                </div>
                                
                                <div class="am-form-group" id="browse">
                                    <label >浏览量：</label>
                                </div>
                                
                                 <div class="am-form-group" id="comment">
                                    <label >评论数：</label>
                                </div>
                                
                                <div class="am-form-group" id="clickRate">
                                    <label >点击量：</label>
                                </div> -->
                                
                                <div class="am-form-group" id="content">
                                    <label >内容：</label>
                                    
                                </div>

                            </fieldset>
                        </form>


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

<script type="text/javascript" src="/js/jquery-2.1.0.js" ></script>
<script type="text/javascript" src="/js/content.js"></script>
<script type="text/javascript" src="/js/amazeui.min.js"></script>
<script type="text/javascript" src="/js/app.js" ></script>
<script type="text/javascript" src="/js/blockUI.js" ></script>
<%}%>
</body>

</html>
