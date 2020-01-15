<%--
  Created by IntelliJ IDEA.
  User: Najarin
  Date: 1/15/2020
  Time: 11:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>Login</h1>
    <form action="/WEB-INF/views/login.jsp" method="post">
        <div>
            <label>E-mail:</label>
            <input type="text" name="login">
        </div>
        <div>
            <label>Senha:</label>
            <input type="password" name="password">
        </div>
        <a href="esqueceuasenha">Esqueci a senha!</a>
        <button type="submit">Login</button>

    </form>



</body>
</html>
