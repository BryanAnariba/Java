package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

// Url Principal: http://localhost:8080/HolaMundoJavaWeb_00/


// Debe Heredar de HttpServlet para crear un Servlet, y a su ves de WebServlet
@WebServlet("/accediendo-servlet")
public class HolaMundo extends HttpServlet {
    
    @Override
    protected void doGet( HttpServletRequest req, HttpServletResponse res ) throws IOException {
        res.setContentType( "text/html; charset=UTF-8" );
        PrintWriter responseData = res.getWriter();
        responseData.println( "Operacion HttpGet Desde -> SourcePackages/web/HolaMundo.java" );
    }
}
