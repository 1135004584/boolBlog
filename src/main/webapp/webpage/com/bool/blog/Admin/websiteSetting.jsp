<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>网站设置</title>
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link href="<%=request.getContextPath()%>/plug-in/blog/layui/css/layui.css" rel="stylesheet" media="all">
</head>
<body>
<form class="layui-form" action="">
    <div class="layui-container" style="margin-top:50px;">
            <input type="hidden" value="${blogWebsiteSettingEntity.id}" name="id" />
        <div class="layui-form-item">
            <label class="layui-form-label">博客标题</label>
            <div class="layui-input-block">
                <input type="text" value="${blogWebsiteSettingEntity.blogTitle}" name="blogTitle" lay-verify="title" autocomplete="off" placeholder="博客标题" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">版权信息</label>
            <div class="layui-input-block">
                <input type="text" value="${blogWebsiteSettingEntity.copyright}" name="copyright" lay-verify="title" autocomplete="off" placeholder="版权信息" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">SEO</label>
            <div class="layui-input-block">
                <textarea name="webSeo" autocomplete="off" style="min-height:150px" placeholder="webSeo" class="layui-textarea">${blogWebsiteSettingEntity.webSeo}</textarea>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">描述</label>
            <div class="layui-input-block">
                <textarea name="webDescription" autocomplete="off" placeholder="描述" class="layui-textarea" style="min-height:150px" >${blogWebsiteSettingEntity.webDescription}</textarea>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit="" lay-filter="settingSave">立即提交</button>
            </div>
        </div>
    </div>
</form>

<script src="<%=request.getContextPath()%>/plug-in/blog/layui/layui.js"></script>
<script src="<%=request.getContextPath()%>/plug-in/blog/js/jquery.min.js"></script>
<script>
    layui.use('form',function(){
        var form = layui.form;
        var layer = layui.layer;

        form.on('submit(settingSave)',function(data){
            console.log(data.field);
            $.ajax({
                type:'post',
                dataType:'json',
                data:data.field,
                url:'<%=request.getContextPath()%>/SettingController/saveSettingInfo.do',
                success:function(d)
                {
                    console.log(d.status);
                    if(d.status === "success")
                    {
                        layer.msg("保存成功！");
                    }
                },error:function(e)
                {
                    layer.msg("保存失败!请检查网络!");
                }
            });
            return false;
        });
    });
</script>
</body>
</html>