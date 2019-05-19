<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>bool's blog</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="<%=request.getContextPath()%>/plug-in/blog/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/plug-in/blog/css/bootstrap.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/plug-in/blog/css/bootstrap-theme.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/plug-in/blog/css/dater.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/plug-in/blog/css/new.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/plug-in/blog/css/timeline.min.css" rel="stylesheet">
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
                <li><a href="articlePage.jsp">文章列表</a></li>
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
        <div class="col-sm-8">
            <div class="timeline timeline-line-dotted">
                    <span class="timeline-label">
                        <span class="label label-primary">5.03.2019</span>
                    </span>
                <div class="timeline-item">
                    <div class="timeline-point timeline-point-success">
                        <i class="fa fa-money"></i>
                    </div>
                    <div class="timeline-event">
                        <div class="timeline-heading">
                            <h4>创建了个人博客</h4>
                        </div>
                        <div class="timeline-body">
                            <p>花了几天时间写好了个人博客系统，准备把以后的生活和学习都记录下来</p>
                        </div>
                        <div class="timeline-footer">
                            <p class="text-right">Fri Apr  5 20:10:11 CST 2019</p>
                        </div>
                    </div>
                </div>

                <span class="timeline-label">
                        <span class="label label-primary">09.03.2016</span>
                    </span>
                <div class="timeline-item">
                    <div class="timeline-point timeline-point-success">
                        <i class="fa fa-money"></i>
                    </div>
                    <div class="timeline-event">
                        <div class="timeline-heading">
                            <h4>MoneyService Transfer</h4>
                        </div>
                        <div class="timeline-body">
                            <p>Money transfer. By Alex, Wallet ID: 1234567890, Amount: 2220$</p>
                        </div>
                        <div class="timeline-footer">
                            <p class="text-right">09.03.2016 09:00</p>
                        </div>
                    </div>
                </div>

                <span class="timeline-label">
                        <span class="label label-primary">09.03.2016</span>
                    </span>
                <div class="timeline-item">
                    <div class="timeline-point timeline-point-success">
                        <i class="fa fa-money"></i>
                    </div>
                    <div class="timeline-event">
                        <div class="timeline-heading">
                            <h4>MoneyService Transfer</h4>
                        </div>
                        <div class="timeline-body">
                            <p>Money transfer. By Alex, Wallet ID: 1234567890, Amount: 2220$</p>
                        </div>
                        <div class="timeline-footer">
                            <p class="text-right">09.03.2016 09:00</p>
                        </div>
                    </div>
                </div>

                <span class="timeline-label">
                        <span class="label label-primary">09.03.2016</span>
                    </span>
                <div class="timeline-item">
                    <div class="timeline-point timeline-point-success">
                        <i class="fa fa-money"></i>
                    </div>
                    <div class="timeline-event">
                        <div class="timeline-heading">
                            <h4>MoneyService Transfer</h4>
                        </div>
                        <div class="timeline-body">
                            <p>Money transfer. By Alex, Wallet ID: 1234567890, Amount: 2220$</p>
                        </div>
                        <div class="timeline-footer">
                            <p class="text-right">09.03.2016 09:00</p>
                        </div>
                    </div>
                </div>
                <span class="timeline-label">
                        <button type="button" class="btn btn-default" title="More...">
                            <i class="glyphicon glyphicon-repeat"></i>
                        </button>
                    </span>

            </div>
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


<script src="webpage/com/Blog/js/jquery.min.js"></script>
<script src="webpage/com/Blog/js/bootstrap.js"></script>


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