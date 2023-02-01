package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet( "GenerandoHoraActual" )
public class GenerandoHoraActual extends HttpServlet {
    
    @Override
    protected void doGet ( HttpServletRequest req, HttpServletResponse res ) throws IOException {
        res.setContentType("text/html; charset=UTF-8");
        
        // Refresar al navegador cada segundo
        res.setHeader("refresh", "1");
        Date fecha = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("'Hora actualizada' HH:mm:ss");
        String horaConFormato = formateador.format(fecha);
        
        
        PrintWriter out = res.getWriter();
        out.println( "Hora Actualizada: " + horaConFormato );
        
        out.close();
    }
}
