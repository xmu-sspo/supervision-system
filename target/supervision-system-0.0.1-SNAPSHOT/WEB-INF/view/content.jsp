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
    <link rel="stylesheet" href="/css/index.css" />
    <link rel="stylesheet" href="/css/admin.css" />
    <link rel="stylesheet" href="/css/page/typography.css" />
    <link rel="stylesheet" href="/css/page/form.css" />
</head>
<body>
<!-- Begin page -->
<header class="am-topbar am-topbar-fixed-top">
    <div class="am-topbar-left am-hide-sm-only">
        <a href="/home" class="logo"><span style="color: #d8d8d8">舆情监督系统</span><i class="zmdi zmdi-layers"></i></a>
    </div>

    <div class="contain">
        <ul class="am-nav am-navbar-nav am-navbar-left">

            <li><h4 class="page-title">新闻详情</h4></li>
        </ul>

        <ul class="am-nav am-navbar-nav am-navbar-right">
            <li class="inform"><i class="am-icon-bell-o" aria-hidden="true"></i></li>
            <li class="hidden-xs am-hide-sm-only">
                <form role="search" class="app-search">
                    <input type="text" placeholder="Search..." class="form-control">
                    <a href=""><img src="/images/search.png"></a>
                </form>
            </li>
        </ul>
    </div>
</header>
<!-- end page -->


<div class="admin">
    <!--<div class="am-g">-->
    <!-- ========== Left Sidebar Start ========== -->
    <!--<div class="left side-menu am-hide-sm-only am-u-md-1 am-padding-0">
        <div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto; height: 548px;">
            <div class="sidebar-inner slimscrollleft" style="overflow: hidden; width: auto; height: 548px;">-->
    <!-- sidebar start -->
    <div class="admin-sidebar am-offcanvas  am-padding-0" id="admin-offcanvas">
        <div class="am-offcanvas-bar admin-offcanvas-bar">


            <ul class="am-list admin-sidebar-list">
                <li><a href="../views/home.html"><span class="am-icon-home"></span> 首页</a></li>
                <li class="admin-parent">
                    <a class="am-cf" data-am-collapse="{target: '#collapse-nav1'}"><span class="am-icon-table"></span> 列表 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
                    <ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav1">
                        <li><a href="/table_basic" class="am-cf"> 话题列表</span></a></li>
                        <li><a href="/table_complete">检索结果列表</a></li>
                    </ul>
                </li>
                <li class="admin-parent">
                    <a class="am-cf" data-am-collapse="{target: '#collapse-nav2'}"><i class="am-icon-line-chart" aria-hidden="true"></i> 统计图表 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
                    <ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav2">
                        <li><a href="/chart_line" class="am-cf"> 折线图</span></a></li>
                        <li><a href="/chart_columnar" class="am-cf"> 柱状图</span></a></li>
                        <li><a href="/chart_pie" class="am-cf"> 饼状图</span></a></li>
                    </ul>
                </li>
                <li class="admin-parent">
                    <a class="am-cf" data-am-collapse="{target: '#collapse-nav5'}"><span class="am-icon-file"></span> 表单 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
                    <ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav5">
                        <li><a href="/form_basic" class="am-cf"> 基本表单</a></li>
                        <li><a href="/form_validate">表单验证</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
    <!-- sidebar end -->

    <!--</div>
</div>
</div>-->
    <!-- ========== Left Sidebar end ========== -->



    <!--	<div class="am-g">-->
    <!-- ============================================================== -->
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
                                <legend>特朗普再发推文:再就贸易问题“羞辱”加拿大</legend>

                                <div class="am-form-group">
                                    <label >来源：</label>凤凰新闻
                                </div>

                                <div class="am-form-group">
                                    <label >发表时间：</label>2018-06-11
                                </div>

                                <div class="am-form-group">
                                    <label >点击量：</label>2139834
                                </div>

                                <div class="am-form-group">
                                    <label >内容：</label>
                                    <br/>&emsp;&emsp;梁子就这样结下了？6月11日，美国总统特朗普在推特上再一次“羞辱”了加拿大。
                                    <br/>&emsp;&emsp;他说：“如果不是互惠的，那么现在公平贸易就变成了愚蠢贸易。根据加拿大公开的数据，他们与美国的贸易额将近1000亿美元（猜猜他们是怎么吹牛的，然后还被抓包了）。最少也是170亿，每天向我们征收270%的税。当贾斯廷（特鲁多）这样做的时候就已经伤害我们了”
                                    <br/>&emsp;&emsp;此前9日，加拿大总理特鲁多在G7峰会上发表联合公报称将共同致力于打击贸易保护主义，并在新闻发布会上称美国征税行为是在羞辱加拿大，并称“加拿大人彬彬有礼，通情达理，但我们也不会被人摆布”。
                                    <br/>&emsp;&emsp;特朗普随后发推指其发表了“虚假言论”，并指示美方代表不要在联合公报上签字。特朗普还称特鲁多“软弱和虚伪”。法新社称，这是一种强烈地侮辱。
                                    <br/>&emsp;&emsp;多位美国高官来声援特朗普，白宫国家贸易委员会主任彼得•纳瓦罗表示，所有与美国总统特朗普进行不诚实外交的政客都会下地狱。在回应特鲁多对美国的指责时回应称：“每一个与特朗普进行不诚实外交，最后还试图背后捅刀子的外国领导人都会下地狱。”
                                    <br/>&emsp;&emsp;此前，美国白宫国家经济委员会主任劳伦斯也称加拿大总理特鲁多的话是“背后捅刀子”。
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
<script type="text/javascript" src="/js/amazeui.min.js"></script>
<script type="text/javascript" src="/js/app.js" ></script>
<script type="text/javascript" src="/js/blockUI.js" ></script>
</body>

</html>
