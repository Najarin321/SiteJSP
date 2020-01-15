<%--
  Created by IntelliJ IDEA.
  User: Najarin
  Date: 1/15/2020
  Time: 7:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div>
    <form action="/cadastroMedico" method="post">
        <div>
            <label>Nome:</label>
            <input type="text" name="nome" placeholder="Nome">
        </div>
        <div>
            <label>CRM:</label>
            <input type="text" name="crm" placeholder="CRM">
        </div>
        <div>
            <label>Especialidade:</label>
            <input type="text" name="especialidade" placeholder="Especialidade">
        </div>
        <button type="submit">Cadastrar!</button>
    </form>
</div>

</body>
</html>
