package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet( "/ServletManejoParametros" )
public class ManejoParametros extends HttpServlet {
    @Override
    protected void doPost ( HttpServletRequest req, HttpServletResponse res ) throws IOException {
        // OBTENIENDO PARAMETROS DEL FORMULARIO
        String nombreUsuario = req.getParameter("nombreUsuario" );
        String passwordUsuario = req.getParameter("passwordUsuario" );
        
        System.out.println("Parametros Recibidos del Formulario, { nombreUsuario: " + nombreUsuario + ", passwordUsuario: " + passwordUsuario + " }");
        
        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<p><strong>Parametro Usuario: </strong>" + nombreUsuario + "</p>");
        out.println("<p><strong>Parametro Password Usuario: </strong>" + passwordUsuario + "</p>");
        out.println("</html>");
        out.println("</body>");
    }    
}
