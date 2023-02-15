package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet( "/ProcesarDatosUsuario" )
public class ProcesarDatosUsuario extends HttpServlet {
    
    @Override
    protected void doPost ( HttpServletRequest req, HttpServletResponse res ) throws IOException {
        String usuarioLogeado = "bsanchez";
        String passwordLogueado = "asd.456";
        
        // La idea es simular un login, si todo va ok 200, si no 401
        String nombreUsuario = req.getParameter("nombreUsuario");
        String passwordUsuario = req.getParameter("passwordUsuario");
        
        PrintWriter responseData = res.getWriter();
        
        if ( 
            usuarioLogeado.equals(nombreUsuario) 
            &&
            passwordLogueado.equals( passwordUsuario )
        ) {
            responseData.println("<h1>Datos Correctos!</h1><hr>");
            responseData.println("<p><strong>Nombre Usuario: </strong>" + nombreUsuario + "</p>");
            responseData.println("<p><strong>Clave Usuario: </strong>" + passwordUsuario + "</p>");
        } else {
            res.sendError( res.SC_UNAUTHORIZED, "Las credenciales ingresadas son incorrectas" );
        }
        
        responseData.close();
    }
}
