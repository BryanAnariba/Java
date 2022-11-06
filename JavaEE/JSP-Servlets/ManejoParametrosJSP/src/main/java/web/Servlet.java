package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet( "/Servlet" )
public class Servlet extends HttpServlet {
    
    // ESTO SIGNIFICA QUE ESTAMOS SOVREESCRIBIENDO EL METODO DE HTTPSERVELET doPost
    @Override
    protected void doPost( HttpServletRequest req, HttpServletResponse res ) throws IOException {
        // OBTENEMOS PARAMETROS DEL FORMULARIO
        String nombreUsuario = req.getParameter( "nombreUsuario" );
        String passwordUsuario = req.getParameter( "passwordUsuario" );
        
        System.out.println("{ nombreUsuario:" + nombreUsuario + ", passwordUsuario: " + passwordUsuario + " }");
        
        // RESPONDEMOS AL USUARIO
        PrintWriter out = res.getWriter();
        
        out.print( "<html>" );
        out.print( "<body>" );
        out.print( "Usuario: " + nombreUsuario );
        out.print( "<br>" );
        out.print( "Password: " + passwordUsuario );
        out.print( "</body>" );
        out.print( "</html>" );
        out.close();
    }
}
