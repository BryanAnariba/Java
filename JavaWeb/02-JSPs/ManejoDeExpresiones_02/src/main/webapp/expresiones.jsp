<%-- 
    Document   : expresiones
    Created on : 12 feb. 2023, 21:33:47
    Author     : 50494
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Con Expresiones</title>
    </head>
    <body>
        <h1>Tipos de expresiones:</h1>
        <strong>Concatenacion:</strong>  
        <%="Bienvenido " + "Bryan Ariel Sanchez Anariba"%>
        <hr/>
        <strong>Operacion Matematica ((2*3)/2):</strong>  
        <%=( ( 2 * 3 ) / 2 )%>
        <hr/>
        <strong>Obtener el id de la sesion:</strong>  
        <%=session.getId()%>
        <hr/>
        <a href="./index.html">Regresar al inicio</a>
    </body>
</html>
