package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CounterApp")
public class CounterApp extends HttpServlet {
    
    @Override
    protected void doGet( HttpServletRequest req, HttpServletResponse res ) throws IOException {
        // Creamos un contador de visitas
        int cantidadVisitas = 0;
        
        //  Verificamos en las cookies si ya existe la variable counterVisitas
        Cookie[] cookiesWeb = req.getCookies();
        if ( cookiesWeb != null ) {
            for ( Cookie c: cookiesWeb ) {
                if ( 
                    c.getName().equals("counterVisitas") 
                ) {
                    cantidadVisitas = Integer.parseInt(c.getValue()) ;
                }
            }
        }
        
        // Incrementamos la cantidadVisitar en 1
        cantidadVisitas ++;
        
        // Incrementamos la cookie
        Cookie c = new Cookie("counterVisitas", Integer.toString(cantidadVisitas));
        
        // Las cookie expirara en una hora y agregamos
        c.setMaxAge(3600); // valor en segundos
        res.addCookie(c);
        
        res.setContentType("text/html; charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println( "Visitaste esta pagina por: " + cantidadVisitas + " Vez." );
        out.close();        
    }
}
