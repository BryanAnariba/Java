<%--Agregamos una declaracion--%>
<%!
    // Declaramos una variable con su metodo get
    private String usuario = "Bryan Ariel Sanchez Anariba";
    public String getUsuario () {
        return this.usuario;
    }

    // Declaramos una variable entera para hacerla de contador de visitas
    private int contadorVisitas = 1;
    
%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de declaraciones JSP</title>
    </head>
    <body>
        <h1>Declaraciones JPS: Consiste en inicializar variables o codigo Java y usuarlo en la pagina tipo a incrustacion de codigo en PHP</h1>
        
        Valor Usuario: <%=this.usuario%>
        <br>
        Valor Usuario Desde El metodo Getter: <%=this.getUsuario()%>
        <br>
        Contador Visitas: <%=this.contadorVisitas=this.contadorVisitas+1%>
    </body>
</html>
