<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/common/taglibs.jsp"%>
		<div class="admin-sidebar am-offcanvas  am-padding-10" id="admin-offcanvas">
	        <div class="am-offcanvas-bar admin-offcanvas-bar">
	            <!-- User -->
	            <div class="user-box am-hide-sm-only">
	                <div class="user-img">
	                    <img src="/images/avatar-1.jpg" id="user_img" alt="user-img" title="1111" class="img-circle img-thumbnail img-responsive">
	                    <div class="user-status offline"><i class="am-icon-dot-circle-o" aria-hidden="true"></i></div>
	                </div>
	                <h5><a href="#" id="user_name_a">zhy</a> </h5>
	                <ul class="list-inline">
	                    <li>
	                        <a href="#">
	                            <i class="fa fa-cog" aria-hidden="true"></i>
	                        </a>
	                    </li>
	
	                    <li>
	                        <a href="#" class="text-custom">
	                            <i class="fa fa-cog" aria-hidden="true"></i>
	                        </a>
	                    </li>
	                </ul>
	            </div>
	            <!-- End User -->
	
	            <!-- ========== 左侧菜单栏 ========== -->
	            
	            <ul class="am-list admin-sidebar-list">
	                <li><a href="/home"><span class="am-icon-home"></span> 舆情检索</a></li>
	                <li class="admin-parent">
	                    <a class="am-cf" data-am-collapse="{target: '#collapse-nav1'}"><span class="am-icon-table"></span> 话题列表 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
	                    <ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav1">
	                        <li><a href="/topic_list" class="am-cf"> 热门话题</a></li>
	                        <li><a href="/search_result">新闻列表</a></li>
	                    </ul>
	                </li>
	                <li class="admin-parent">
	                    <a class="am-cf" data-am-collapse="{target: '#collapse-nav2'}"><i class="am-icon-line-chart" aria-hidden="true"></i>话题分析 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
	                    <ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav2">
	                        <li><a href="/chart_line" class="am-cf"> 热度变化趋势图</a></li>
	                        <li><a href="/chart_pie" class="am-cf"> 发布平台分析图</a></li>
	                        <!--  <li><a href="/chart_columnar" class="am-cf"> 柱状图</a></li>
	                        <li><a href="/chart_pie" class="am-cf"> 饼状图</a></li>-->
	                    </ul>
	                </li>
	                <li class="admin-parent">
	                    <a class="am-cf" data-am-collapse="{target: '#collapse-nav5'}"><span class="am-icon-file"></span> 话题管理 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
	                    <ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav5">
	                        <li><a href="/form_basic" class="am-cf"> 已关注话题</a></li>
	                        <li><a href="/form_validate">话题定制</a></li>
	                    </ul>
	                </li>
	                <li class="admin-parent">
	                    <a class="am-cf" data-am-collapse="{target: '#collapse-nav5'}"></a>
	                    <ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav5">
	                        
	                    </ul>
	                </li>
	            </ul>
	        </div>
	    </div>