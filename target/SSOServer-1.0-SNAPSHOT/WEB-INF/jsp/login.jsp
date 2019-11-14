<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2018/12/12
  Time: 13:08
  To change this template use File | Settings | File Templates.
--%>
<%--page指令中的contentType决定服务器发送给客户端的内容编码。pageEncoding指jsp编译成class的编码--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<%--静态包含的页面与本页面contentType必须相同--%>
<%@include file="include.jsp"%>
<%--jsp页面引入css和js
1.css <link rel="stylesheet" href="./css/style.css" type="text/css">
2.js <script language='javascript' src='js/TreeToc.js'></script>--%>
<%--每一个css和js都会向服务器发送请求--%>
<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/plugin/easyui/themes/default/easyui.css"/>
<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/plugin/easyui/themes/icon.css"/>
<%--<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/plugin/easyui/demo.css"/>--%>
<%--可以给静态资源后加时间戳防止静态资源缓存--%>
<script type="text/javascript" src="<%=basePath%>/static/plugin/easyui/jquery.min.js?<%= System.currentTimeMillis()%>"></script>
<script type="text/javascript" src="<%=basePath%>/static/plugin/jquery/jquery-1.11.2.min.js?<%= System.currentTimeMillis()%>"></script>
<script type="text/javascript" src="<%=basePath%>/static/plugin/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>/static/plugin/validate/jquery.validate.js"></script>
<link rel="stylesheet" href="<%=basePath%>/static/plugin/webui-popver/jquery.webui-popover.css">
<script src="<%=basePath%>/static/plugin/webui-popver/jquery.webui-popover.js"></script>
<html>
<head>
    <%--title对应浏览器的tab页title--%>
    <title>Title</title>
        <%--客户端禁用缓存--%>
        <%--只能禁用jsp页面的缓存，静态资源无法禁用--%>
        <%--pragma 在请求/响应链上附近的一些参数--%>
        <%--只有GET请求有缓存，POST请求没有--%>
    <meta http-equiv="pragma" content="no-cache">
        <%--cache-control 对缓存的控制--%>
    <meta http-equiv="cache-control" content="no-cache">
        <%--expires告诉客户端该响应数据会在指定的时间过期，通常用于给客户端缓存作为参考。--%>
        <%--Last-Modified客户端所请求的资源的最后修改时间--%>
    <meta http-equiv="expires" content="0">
</head>

<body>
<%--因为使用paht可能导致获取的协议等错误。最好直接使用basePath，默认使用原来的协议+服务器host+端口号--%>
<%--basePath，类似于 /web格式，前面不能带斜线--%>
<form action="<%=basePath%>/login/dologin" id="dologin" method="post">
        用户名：<input name="username" required minlength="5"><br/>
        密码：<input name="password"><br/>
        验证码：<input name="verifyCode"><img   id="verifyCodeId" src="<%=basePath%>/login/verify" onclick="changeVerify()"><br/>
    <div id="errorMsg"></div>
        <input type="button" id="submitBtn" value="登陆" onclick="submitForm()" >
    </form>

</body>
<script>
    // $("#dologin").form("submit");
    function changeVerify(){
        $("#verifyCodeId").attr("src","<%=path%>/login/verify?date="+new Date());
    }

    function submitForm(){
        // var msg = $("#dologin").valid();
        $("#dologin").ajaxSubmit();
        // $("#dologin").validate({
        //     submitHandler: function(form){   //表单提交句柄,为一回调函数，带一个参数：form
        //         alert("提交表单");
        //     },
        //     rules: {
        //         username: {
        //             required: true
        //         }
        //     }
        // });
        /*默认返回的数据格式为json*/
        <%--$.post("<%=basePath%>/login/dologin",$("#dologin").serialize(),function (data) {--%>
            <%--if(data.code==200){--%>
                <%--window.location="<%=basePath%>/welcome";--%>
            <%--}else{--%>
                <%--$("#errorMsg").html(data.desc);--%>
            <%--}--%>
        <%--});--%>
    }

    // var options = {
    //     placement:'top',//值: auto,top,right,bottom,left,top-right,top-left,bottom-right,bottom-left
    //     width:'auto',//可以设置数字
    //     height:'auto',//可以设置数字
    //     trigger:'click',//值:click,hover
    //     style:'',//值:'',inverse
    //     delay:300,//延迟时间, 悬浮属性才执行
    //     cache:true,//如果缓存设置为false,将重建
    //     multi:false,//在页面允许其他弹出层
    //     arrow:true,//是否显示箭头
    //     title:'123',//标题,如果标题设置为空字符串时,标题栏会自动隐藏
    //     content:'content',//内容,内容可以是函数
    //     closeable:true,//显示关闭按钮
    //     padding:true,//内容填充
    //     type:'html',//内容类型, 值:'html','iframe','async'
    //     url:''//如果不是空的,插件将通过url加载内容
    // };
    // $('#submitBtn').webuiPopover(options);

    /*webuiPopver两种使用方式。
    1.通过webuiPopover
    2.在dom中使用data-* 属性创建弹出层。如data-title="Title" data-content="Contents..." data-placement="right"等。或设置一个div层，添加类名 webui-popover-content
        $('a').webuiPopover();*/
    <%--$(function(){--%>
    <%--function changeVerify(){--%>
    <%--$("#verifyCodeId").attr("src","<%=path%>/login/verify?date="+new Date());--%>
    <%--}--%>
    <%--});--%>
</script>
</html>
