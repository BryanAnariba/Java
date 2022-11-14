package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet( "/ServletHeaders" )
public class Servlet extends HttpServlet {
    protected void doGet ( HttpServletRequest req, HttpServletResponse res ) throws IOException {
        res.setContentType( "text/html; charset=UTF-8" );
        PrintWriter out = res.getWriter();
        
        String metodoHttp = req.getMethod();
        String url = req.getRequestURI();
        Enumeration cabeceros = req.getHeaderNames();
        //System.out.println( "Tipo Peticion ( GET, POST, PUT, DELETE ) => " + metodoHttp  );
        
        out.print( "<html>" );
        out.print( "<head>" );
        out.print( "<title>Headers Http</title>" );
        out.print( "</head>" );
        out.print( "<body>" );
        out.print( "<h1>Headers Http</h1>" );
        
        out.print( "<b>Metodo HTTP: </b><i>" + metodoHttp + "</i>" );
        out.print( "<br><b>Url: </b><i>" + url + "</i>" );
        out.print( "<br>" );
        out.print( "<br>" );
        out.print( "<b>CABECEROS</b><br><br>" );
        while ( cabeceros.hasMoreElements() ) {
            String nombreCabecero = ( String )cabeceros.nextElement();
            out.print("<b>" + nombreCabecero + ": </b>"); // OBTENEMOS LA LLAVE PARA LLAMARLO CON GETHEADER
            out.print( req.getHeader( nombreCabecero ) );
            out.print( "<br>" );
        }        
        
        out.print( "</body>" );
        out.print( "</html>" );
        out.close();
    }
}
