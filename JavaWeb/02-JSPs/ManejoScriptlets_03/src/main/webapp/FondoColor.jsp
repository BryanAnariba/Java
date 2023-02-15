<%-- 
    Document   : FondoColor
    Created on : 12 feb. 2023, 21:56:47
    Author     : 50494
--%>

<%
    String colorEnviado = request.getParameter("colorDeFondo");
    if ( colorEnviado == null || colorEnviado.trim().equals("") == true ) {
        colorEnviado = "white";
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP CAMBIO COLOR</title>
    </head>
    <body style="background-color: <%=colorEnviado%>;">
        <h1>JSP CAMBIO DE COLOR</h1>
        <br/>
        <strong>Color Aplicado: <%=colorEnviado%></strong>
        <br/>
        <a href="./index.html">Regresar al index</a>
    </body>
</html>
