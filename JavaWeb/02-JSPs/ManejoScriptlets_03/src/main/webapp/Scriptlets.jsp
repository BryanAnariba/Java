<%-- 
    Document   : Scriptlets
    Created on : 12 feb. 2023, 21:57:07
    Author     : 50494
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP CON SCRIPTLETS</title>
    </head>
    <body>
        <h1>Uso de ScriptLets</h1>
        <br/>
        <%-- Scriptlet para enviar informacion al navegador--%>
        <%
            out.println("Saludos desde un scriptlet");
        %>
        
        <%--Scriptlet para manipular los objetos --%>
        <%
            String nombreAplicacion = request.getContextPath();
            out.println("{nombreAplicacion: " + nombreAplicacion + "}");
        %>
        <br/>
        <%--Condicionales con scriptlets--%>
        <%
            if ( session != null && session.isNew() ) {
        %>
            La session si es nueva
        <%
            } else if ( session != null ) {
        %>
            La session no es nueva
        <%  }
        %>
        <br/>
        <a href="./index.html">Regresar al index</a>
    </body>
</html>
