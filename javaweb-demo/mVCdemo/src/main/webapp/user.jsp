<%--
  Created by IntelliJ IDEA.
  User: 93061
  Date: 2022/8/7
  Time: 18:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
    <a href="/javaweb-demo/mVCdemo/add.jsp" ><input type="button" value="添加"></a>
</form>
${users}
<table border="1" cellpadding="0" width="800">
    <tr>
        <th>id</th>
        <th>用户名</th>
        <th>密码</th>
        <th>修改</th>
        <th>删除</th>
    </tr>
    <c:forEach items="${users}" var="user" varStatus="status">
        <tr align="ceter">
<%--            输出信息--%>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>

            <td>
<%--                用次数作id和内容--%>
                <form action="/javaweb-demo/mVCdemo/selectid" method="post" >
                    <input type="hidden" value="${user.id}" name="id">
                    <input type="submit" value="修改" id="update">
                </form>
            </td>
            <td>
                <form action="/javaweb-demo/mVCdemo/delet" method="post" >
                    <input type="hidden" value="${user.id}" name="id">
                    <input type="submit" value="删除" id="delet">
                </form>
            </td>
        </tr>

    </c:forEach>
</table>

</body>
</html>
