<%-- 
    Document   : indedx
    Created on : 7 feb. 2023, 20:10:45
    Author     : 50494
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola Mundo Con JSPs</title>
    </head>
    <body>
        <h1>Hola Mundo Con JSPs</h1>
        
        <strong>Maneras de Pintar informacion con JSPs</strong>
        <ul>
            <li><% out.println("Holaaaaaa este mensaje es con Scriptlets"); %></li>
            <li>${"Hola Mundo Con expresion languaje (EL)"}</li>
            <li><%= "Hola Mundo Con Expresiones" %></li>
            <li><c:out value="Hola Mundo con JSTL" /></li>
        </ul>
    </body>
</html>
