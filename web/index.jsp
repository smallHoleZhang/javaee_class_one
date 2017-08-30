<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2017/8/29
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>图书馆管理系统</title>
  </head>
  <body bgcolor="#5f9ea0">
  <form action="org/loginservlet" method="post">
       <table>
         <caption>用户登录</caption>
         <tr>
           <td> 用户名：</td>
           <td> <input  name="name" type="text" size="20" /></td>
         </tr>
         <tr>
           <td> 密码：</td>
           <td> <input  name="password" type="text" size="20" /></td>
         </tr>
       </table>
    <input type="submit" value="登录">
    <input type="reset" value="重置">

  </form>
  </body>
</html>
