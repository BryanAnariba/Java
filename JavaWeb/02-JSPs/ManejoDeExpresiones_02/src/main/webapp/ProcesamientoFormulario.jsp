<%-- 
    Document   : ProcesamientoFormulario
    Created on : 12 feb. 2023, 21:32:24
    Author     : 50494
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
    </head>
    <body>
        <h1>Bienvenid@ <%=request.getParameter("usuario")%></h1>
       <small>Tu clave es: <%=request.getParameter("password")%></small>
       <hr/>
       <a href="./index.html">Regresar al inicio</a>
    </body>
</html>
