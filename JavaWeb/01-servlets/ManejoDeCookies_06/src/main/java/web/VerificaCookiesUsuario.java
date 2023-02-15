package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/VerificaCookiesUsuario")
public class VerificaCookiesUsuario extends HttpServlet {
    
    @Override
    protected void doGet( HttpServletRequest req, HttpServletResponse res ) throws IOException {
        
        // suponemos que el usuario visita por primera vez nuestro sitio
        boolean esNuevoUsuario = true;
        
        // Obtenemos las cookies
        Cookie[] cookiesNavegador = req.getCookies();
        
        // Buscamos si ya existe una cookie creada con anterioridad
        if ( cookiesNavegador != null ) { // si hay cookies
            for( Cookie c: cookiesNavegador ) {
                
                // Si existe una cookie llamado usuarioRecurrente y es Si
                if ( 
                    c.getName().equals("esUsuarioRecurrente") 
                    && 
                    c.getValue().equals("Si") 
                ) {
                    esNuevoUsuario = false;
                    break;
                }
            }
        }
        
        String mensaje = "";
        if ( esNuevoUsuario ) { // Si entra aqui es que es primera vez entonces se crea la cookie
            Cookie visitanteCookie = new Cookie("esUsuarioRecurrente", "Si");
            res.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar nuestro sitio por primera vez";
        } else { // Si no  es que la cookie ya esta agregada, y respondemos con gracias por visitar nuevamente nuestro sitio
            mensaje = "Gracias por visitar nuevamente nuestro sitio web, Saludos";
        }
        
        res.setContentType("text/html; charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println(mensaje);
        out.close();
    }
}
