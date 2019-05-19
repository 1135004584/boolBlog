<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>bool's blog</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="<%=request.getContextPath()%>/plug-in/blog/css/bootstrap.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/plug-in/blog/css/bootstrap-theme.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/plug-in/blog/css/dater.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/plug-in/blog/css/new.css" rel="stylesheet">

</head>
<body>
<div class="container-fluid" style="display: inline-block;">
    <div style="float: left">
        <h3>道，可道，非常道。</h3>
        <p class="text-muted" align="right">——道德经</p>
    </div>
    <div class="dater" style="float: left">
        <div class="clock">

            <div id="Date">2019 二月 19 星期二</div>

            <ul>
                <li id="hours">17</li>
                <li id="point">:</li>
                <li id="min">10</li>
                <li id="point">:</li>
                <li id="sec">28</li>
            </ul>

        </div>
    </div>

</div>
<nav class="navbar navbar-inverse" style="border-radius: 0;">
    <div class="container-fluid">
        <div class="navbar-header" >
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a href="#" class="navbar-brand">Bool的博客</a>
        </div>

        <div id="navbar" class="navbar-collapse collapse in">

            <ul class="nav navbar-nav">
                <li class="active"><a href="#">首页</a></li>
                <li><a href="#about">文章列表</a></li>
                <li><a href="#coder">开源项目</a></li>
                <li><a href="#contact">关于作者</a></li>
            </ul>
            <ul class="nav navbar-nav pull-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                        <span class="glyphicon glyphicon-user"></span>登陆<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">后台管理</a></li>
                        <li role="separator" class="divider"></li>

                        <li><a href="#">Log Out</a></li>
                    </ul>
                </li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-1" style="display: inline;">

        </div>
        <div class="col-sm-7">
            <div class="container-fluid article-row">
                <h2>
                    标题
                </h2>
                <p>
                    本可视化布局程序在HTML5浏览器上运行更加完美, 能实现自动本地化保存, 即使关闭了网页, 下一次打开仍然能恢复上一次的操作.
                </p>
                <p>
                    <span class="text-muted">Wed Feb 20 11:22:32 HKT 2019
    </span>
                    <span class="text-muted"><span class="glyphicon glyphicon-eye-open "></span>50</span>
                    <span class="pull-right label label-success">原创</span>
                </p>
            </div>
            <hr/>

            <div class="container-fluid article-row">
                <h2>
                    标题
                </h2>
                <p>
                    本可视化布局程序在HTML5浏览器上运行更加完美, 能实现自动本地化保存, 即使关闭了网页, 下一次打开仍然能恢复上一次的操作.
                </p>
                <p>
                    <span class="text-muted">Wed Feb 20 11:22:32 HKT 2019
    </span>
                    <span class="text-muted"><span class="glyphicon glyphicon-eye-open "></span>50</span>
                    <span class="pull-right label label-success">原创</span>
                </p>
            </div>
            <hr/>

            <div class="container-fluid article-row">
                <h2>
                    标题
                </h2>
                <p>
                    本可视化布局程序在HTML5浏览器上运行更加完美, 能实现自动本地化保存, 即使关闭了网页, 下一次打开仍然能恢复上一次的操作.
                </p>
                <p>
                    <span class="text-muted">Wed Feb 20 11:22:32 HKT 2019
    </span>
                    <span class="text-muted"><span class="glyphicon glyphicon-eye-open "></span>50</span>
                    <span class="pull-right label label-success">原创</span>
                </p>
            </div>
            <hr/>

            <div class="container-fluid article-row">
                <h2>
                    标题
                </h2>
                <p>
                    本可视化布局程序在HTML5浏览器上运行更加完美, 能实现自动本地化保存, 即使关闭了网页, 下一次打开仍然能恢复上一次的操作.
                </p>
                <p>
                    <span class="text-muted">Wed Feb 20 11:22:32 HKT 2019
    </span>
                    <span class="text-muted"><span class="glyphicon glyphicon-eye-open "></span>50</span>
                    <span class="pull-right label label-success">原创</span>
                </p>
            </div>
            <hr/>

            <ul class="pagination">
                <li><a href="#">&laquo;</a></li>
                <li class="active"><a href="#">1</a></li>
                <li class="disabled"><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">...</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
                <li><a href="#">&raquo;</a></li>
            </ul>

        </div>
        <div class="col-sm-3">
            <div style="margin-bottom:35px;">
                <a href="#" class="list-group-item active">
                    文章类别
                </a>
                <a href="#" class="list-group-item">C/C++</a>
                <a href="#" class="list-group-item">ASM</a>
                <a href="#" class="list-group-item">JAVA</a>
                <a href="#" class="list-group-item">Python</a>
            </div>
            <div>
            <a href="#" class="list-group-item active">
                浏览最多
            </a>
            <a href="#" class="list-group-item">24*7 支持</a>
            <a href="#" class="list-group-item">免费 Window 空间托管</a>
            <a href="#" class="list-group-item">图像的数量</a>
            <a href="#" class="list-group-item">每年更新成本</a>
            </div>
        </div>
    </div>
</div>
<div class="container-fluid" style="
  background-color: #222;
  border-color: #080808;
  height:200px;
  padding:30px;
  color: #9d9d9d;
">
    <h3>
        友情链接:
    </h3>
    <p style="padding:10px;">
        <a class="text-muted" href="#">暗组论坛</a>

        <a class="text-muted" href="#">QQTZ综合社区</a>

    </p>
    <p class="">BOOL @copyright reversed!</p>
</div>


<script src="<%=request.getContextPath()%>/plug-in/blog/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/plug-in/blog/js/bootstrap.js"></script>


<script type="text/javascript">
    $(document).ready(function() {

        // 创建两个变量，一个数组中的月和日的名称
        var monthNames = [ "一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月" ];
        var dayNames= ["星期日","星期一","星期二","星期三","星期四","星期五","星期六"]

        // 创建一个对象newDate（）
        var newDate = new Date();
        // 提取当前的日期从日期对象
        newDate.setDate(newDate.getDate());
        //输出的日子，日期，月和年
        $('#Date').html(newDate.getFullYear() + " " + monthNames[newDate.getMonth()] + ' ' + newDate.getDate() + ' ' + dayNames[newDate.getDay()]);

        setInterval( function() {
            // 创建一个对象，并提取newDate（）在访问者的当前时间的秒
            var seconds = new Date().getSeconds();
            //添加前导零秒值
            $("#sec").html(( seconds < 10 ? "0" : "" ) + seconds);
        },1000);

        setInterval( function() {
            // 创建一个对象，并提取newDate（）在访问者的当前时间的分钟
            var minutes = new Date().getMinutes();
            // 添加前导零的分钟值
            $("#min").html(( minutes < 10 ? "0" : "" ) + minutes);
        },1000);

        setInterval( function() {
            // 创建一个对象，并提取newDate（）在访问者的当前时间的小时
            var hours = new Date().getHours();
            // 添加前导零的小时值
            $("#hours").html(( hours < 10 ? "0" : "" ) + hours);
        }, 1000);

    });
</script>
</body>
</html>