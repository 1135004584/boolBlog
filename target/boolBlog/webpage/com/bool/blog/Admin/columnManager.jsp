<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>栏目管理</title>
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link href="<%=request.getContextPath()%>/plug-in/blog/layui/css/layui.css" rel="stylesheet" media="all">
</head>
<body>
<script type="text/html" id="toolbar">
    <div class="layui-btn-container">
        <button class="layui-btn layui-btn-sm" lay-event="add-column"><i class="layui-icon layui-icon-add-1"></i>添加栏目
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
            , url: '<%=request.getContextPath()%>/ColumController/getColumInfo.do'
            , cols: [[
                {field: 'id', width: 80, title: 'ID', sort: true}
                , {field: 'columName', title: '栏目名称'}
                , {field: 'columHref', title: '栏目地址'}
                , {field: 'fathercolumid', title: '父栏目id'}
                , {title: '操作', toolbar: '#operateBar'}
            ]]
            , page: true
        });

        table.on('toolbar(colManager)', function (obj) {
            var checkStatus = table.checkStatus(obj.config.id);
            switch (obj.event) {
                case 'add-column':
                    addColumnIndex = layer.open({
                        title: "添加栏目",
                        type: 1,
                        content: $("#addColumn-dialog"),
                        success: function (e, e1) {
                            loadSelectfathercolumData('');
                        }
                    });

                    break;
                case 'getCheckLength':
                    var data = checkStatus.data;
                    layer.msg('选中了：' + data.length + ' 个');
                    break;
                case 'isAll':
                    layer.msg(checkStatus.isAll ? '全选' : '未全选');
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
    /**
     * 加载父栏目选择数据
     * @param checkid
     */
    function loadSelectfathercolumData(checkid) {

        var fathercolum = $("select[name='fathercolumid']:first");
        $(fathercolum).html("<option>加载中...</option>");
        $.ajax({
            type: 'get',
            dataType: 'json',
            url: '<%=request.getContextPath()%>/ColumController/getColumInfo.do',
            success: function (d) {
                if (d.code === 0) {
                    var html = "<option></option>";
                    for (var i = 0; i < d.data.length; i++) {
                        if (checkid === d.data[i].id) {
                            html += '<option value="' + d.data[i].id + '" checked>'
                                + d.data[i].columName + '</option>';
                        } else {
                            html += '<option value="' + d.data[i].id + '">'
                                + d.data[i].columName + '</option>';
                        }
                    }
                    $(fathercolum).html(html);
                } else {
                    $(fathercolum).html("<option>加载失败!</option>");
                }
                layui.form.render("select");
            }, error: function (e) {
                $(fathercolum).html("<option>加载失败!</option>");
            }

        });
    }



</script>

<div hidden="hidden" id="addColumn-dialog" style="padding:10px;">
    <form class="layui-form" action="" class="layui-container">
        <div class="layui-form-item">
            <label class="layui-form-label">栏目名称</label>
            <div class="layui-input-block">
                <input type="text" name="columName" lay-verify="title" autocomplete="off" placeholder="栏目名称"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">栏目地址</label>
            <div class="layui-input-block">
                <input type="text" name="columHref" lay-verify="title" autocomplete="off" placeholder="栏目地址"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">父栏目</label>
            <div class="layui-input-block">
                <select name="fathercolumid">

                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit="" lay-filter="add-column">添加</button>
            </div>
        </div>
    </form>
</div>
<div hidden="hidden" id="editColumn-dialog" style="padding:10px;">
    <form class="layui-form" action="" class="layui-container">
        <input type="hidden" value="" name="id"/>
        <div class="layui-form-item">
            <label class="layui-form-label">栏目名称</label>
            <div class="layui-input-block">
                <input type="text" name="columName" lay-verify="title" autocomplete="off" placeholder="栏目名称"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">栏目地址</label>
            <div class="layui-input-block">
                <input type="text" name="columHref" lay-verify="title" autocomplete="off" placeholder="栏目地址"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">父栏目</label>
            <div class="layui-input-block">
                <select name="fathercolumid">

                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit="" lay-filter="edit-column">保存</button>
            </div>
        </div>
    </form>
</div>
<script>

    layui.use('form', function () {
        var form = layui.form;
        form.on('submit(add-column)', function (data) {
            $.ajax({
                type: 'post',
                dataType: 'json',
                url: '<%=request.getContextPath()%>/ColumController/saveColumItem.do',
                data: data.field,
                success: function (d) {
                    if (d.status === "success") {
                        table.reload('#colManager');
                        layui.layer.close(addColumnIndex);
                    }
                }
            })
        });

        form.on('submit(edit-column)', function (data) {

            $.ajax({
                type: 'post',
                dataType: 'json',
                url: '<%=request.getContextPath()%>/ColumController/updateColumnItem.do',
                data: data.field,
                success: function (d) {
                    if (d.status === "success") {
                        table.reload('#colManager');
                        layui.layer.close(editColumnIndex);
                    }
                }
            })
        });
    });
</script>
</body>
</html>
