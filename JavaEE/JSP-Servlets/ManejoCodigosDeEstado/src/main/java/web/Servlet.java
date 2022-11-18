package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doPost( HttpServletRequest req, HttpServletResponse res ) throws IOException {
      
        String usuarioOk = "Juan";
        String passwordOK = "123";
        
        String usuario = req.getParameter("usuario");
        String password = req.getParameter("password");
        
        PrintWriter out = res.getWriter();
        
        if ( usuarioOk.equals( usuario ) && passwordOK.equals( password ) ) {
            // VALORES CORRECTOS SI EL USUARIO DIGITA ESTO MANDAR UN 200
            //res.setStatus( res.SC_OK ); // 200
            out.print("<h2>Login Success, Welcome " + usuario + "</h2>");
            
        } else {
            // VALORES INCORRECTOS ESTO DEBE MANDAR UN 400
            res.sendError( res.SC_UNAUTHORIZED, "Las Credenciales Son Incorrectas" ); // 401
        }
        out.close();
    }
}
