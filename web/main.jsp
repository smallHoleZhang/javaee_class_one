<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2017/8/30
  Time: 12:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
import="org.login" %>
<html>
<head>
    <title>欢迎使用</title>
</head>
<body>
<%
    login login = (org.login) session.getAttribute("login");
    String lan =  login.getName();
%>
 <%= lan%> ,您好，欢迎使用图书管理系统

</body>
</html>
