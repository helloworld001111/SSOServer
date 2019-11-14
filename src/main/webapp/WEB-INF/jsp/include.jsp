<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2018/12/12
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--jsp页面使用java的两种方式。
1.<% %>普通脚本
2.<%= %>表达式标签--%>
<%String basePath = request.getContextPath();%>
<%--request.getScheme()和request.getRequestURL()获取的可能是http，而非实际的https。
可以通过配置tomcat和nginx获取正确的schema--%>
<%String path = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/";%>
