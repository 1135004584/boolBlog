<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>文章管理</title>
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link href="<%=request.getContextPath()%>/plug-in/blog/layui/css/layui.css" rel="stylesheet" media="all">
</head>
<body>
<script type="text/html" id="toolbar">
    <div class="layui-btn-container">
        <button class="layui-btn layui-btn-sm" lay-event="add-column"><i class="layui-icon layui-icon-add-1"></i>添加文章
        </button>
    </div>
</script>

<script type="text/html" id="operateBar">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

<table class="layui-hide" id="colManager" lay-filter="colManager"></table>
<script src="<%=request.getContextPath()%>/plug-in/blog/layui/layui.js"></script>
<script src="<%=request.getContextPath()%>/plug-in/blog/js/jquery.min.js"></script>

<script>
    layui.use('table', function () {
        var table = layui.table;

        table.render({
            elem: '#colManager'
            , toolbar: '#toolbar'
            , url: '<%=request.getContextPath()%>/ArticleController/getArticleList.do?keywords='
            , cols: [[
                {field: 'id', width: 80, title: 'ID', sort: true}
                , {field: 'article_title', title: '文章标题'}
                , {field: 'typename', title: '类型名称'}
                , {field: 'article_time', title: '发布时间'}
                , {field: 'article_pageviewCount', title: '查看次数'}
                , {title: '操作', toolbar: '#operateBar'}
            ]]
            , page: true
        });

        table.on('toolbar(colManager)', function (obj) {
            var checkStatus = table.checkStatus(obj.config.id);
            switch (obj.event) {
                case 'add-column':
                    window.location.href="<%=request.getContextPath()%>/ArticleController/getAddIndex.do";
                    break;
            }
        });

        //监听行工具事件
        table.on('tool(colManager)', function (obj) {
            var data = obj.data;
            //console.log(obj)
            if (obj.event === 'del') {
                layer.confirm('真的删除行么', function (index) {
                    $.ajax({
                        type: 'get',
                        dataType: 'json',
                        url: '<%=request.getContextPath()%>/ColumController/deleteById.do?id='+data.id,
                        success: function (d) {
                            if (d.status === "success") {
                                layui.layer.msg("删除成功");
                                obj.del();
                            } else {
                                layui.layer.msg("删除失败");
                            }
                        }
                    });
                    layer.close(index);
                });
            } else if (obj.event === 'edit') {
                var id = $("#editColumn-dialog input[name='id']");
                var columName = $("#editColumn-dialog input[name='columName']");
                var columHref = $("#editColumn-dialog input[name='columHref']");
                $(id).val(data.id);
                $(columName).val(data.columName);
                $(columHref).val(data.columHref);
                loadSelectfathercolumData(data.fathercolumid);
                editColumnIndex = layer.open({
                    title: "编辑栏目",
                    type: 1,
                    content: $("#editColumn-dialog")
                });
            }
        });
    });



</script>

</body>
</html>
