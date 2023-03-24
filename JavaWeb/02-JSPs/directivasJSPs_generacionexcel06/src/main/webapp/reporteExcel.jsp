<%@page 
    errorPage="/WEB-INF/manejoErrores.jsp"
%>

<%@page   
    import="utils.Conversion, java.util.Date"
%>

<%@page 
    contentType="application/vnd.ms.excel"
%>
<%
    String nombreReporte = "reporte.xls";
//    response.setHeader("Content-Disposition", "attachment;filename=" + nombreReporte);
    response.setHeader("Content-Disposition", "inline;filename=" + nombreReporte);
%>

<!DOCTYPE html>
<html>
    <head>
        <title>Reporte de Excel</title>
    </head>
    <body>
        <h1>Excel Document</h1>
        <br/>
        <table border="1">
            <tr>
                <thead>Curso</thead>
                <thead>Descripcion</thead>
                <thead>Fecha</thead>
            </tr>
            <tr>
                <td>1 Fundamentos Java</td>
                <td>Sintaxis basica "500"</td>
                <td><%= Conversion.format(new Date())%></td>
                
            </tr>
            <tr>
                <td>2 Fundamentos Javascript</td>
                <td>Sintaxis basica nodejs</td>
                <td><%= Conversion.format(new Date())%></td>
            </tr>
        </table>
    </body>
</html>
