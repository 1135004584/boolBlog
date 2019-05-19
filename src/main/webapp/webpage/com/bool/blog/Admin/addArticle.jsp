<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>添加文章</title>
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link href="<%=request.getContextPath()%>/plug-in/blog/layui/css/layui.css" rel="stylesheet" media="all">
</head>
<body>
<form class="layui-form" action="" class="layui-container">
    <div class="layui-form-item">
        <label class="layui-form-label">文章名称</label>
        <div class="layui-input-block">
            <input type="text" name="columName" lay-verify="title" autocomplete="off" placeholder="文章名称"
                   class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">文章摘要</label>
        <div class="layui-input-block">
            <input type="text" name="columName" lay-verify="title" autocomplete="off" placeholder="文章摘要,方便收录"
                   class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">文章内容</label>
        <div class="layui-input-block">
            <!-- 加载编辑器的容器 -->
            <script id="container" name="content" type="text/plain">
        这里写你的初始化内容
            </script>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">文章类型</label>
        <div class="layui-input-block">
            <option></option>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" lay-filter="edit-column">添加文章</button>
        </div>
    </div>
</form>

<script src="<%=request.getContextPath()%>/plug-in/blog/layui/layui.js"></script>
<script src="<%=request.getContextPath()%>/plug-in/blog/js/jquery.min.js"></script>

<script src="<%=request.getContextPath()%>/plug-in/ueditor/ueditor.config.js"></script>
<script src="<%=request.getContextPath()%>/plug-in/ueditor/ueditor.all.js"></script>
<script type="text/javascript">
    var ue = UE.getEditor('container');
</script>

</body>
</html>
