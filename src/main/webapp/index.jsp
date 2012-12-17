<%--
  User: grewan
  Date: 12/14/12
  Time: 7:59 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
    out.println("Hello Greta");
%>

<form method="post" action="login">
    <table>
        <tr>
            <td>UserName:</td>
            <td><input name="username" /></td>
        </tr>

        <tr>
            <td>Password:</td>
            <td><input name="password"/></td>
        </tr>
    </table>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>