<%--
  Created by IntelliJ IDEA.
  User: 93061
  Date: 2022/8/9
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>update</title>
</head>
<body>
${user}
<table border="1" cellpadding="0" width="800">
    <tr>
        <th>id</th>
        <th>用户名</th>
        <th>密码</th>

    </tr>

    <tr align="ceter">
        <td>${user.id}</td>
        <td>${user.username}</td>
        <td>${user.password}</td>

    </tr>

</table>
<form action="/javaweb-demo/mVCdemo/updateuser" method="post">
    id:<input type="text" value="${user.id}" name="id"><br/>
    username:<input type="text" value="${user.username}" name="username"><br/>
    password:<input type="password" value="${user.password}" name="password"><br/>
    <input type="submit" value="提交修改">
</form>
</body>
</html>
