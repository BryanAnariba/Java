package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet( "/UsoHeaders" )
public class UsoHeaders extends HttpServlet {
    @Override
    protected void doGet ( HttpServletRequest req, HttpServletResponse res ) throws IOException {
        res.setContentType("text/html; charset=UTF-8");
        PrintWriter out = res.getWriter();
        
        // Obtener el tipo de peticion
        String metodoHttp = req.getMethod();
        String url = req.getRequestURI();
        Enumeration cabeceros = req.getHeaderNames();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Headers HTTP Metodos</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Headers Http</h1>");
        out.println("<p><strong>Metodo Http: </strong>" + metodoHttp + "</p>");
        out.println("<hr/>");
        out.println("<p><strong>Url Del Sitio: </strong>" + url + "</p>");
        out.println("<hr/>");
        out.println("<h2>Cabeceros</h2>");
        while ( cabeceros.hasMoreElements() ) {
            String nombreCabeceros = (String)cabeceros.nextElement();
            out.println("<p><strong>Nombre Cabecero: </strong>" + nombreCabeceros + " ----> " + req.getHeader(nombreCabeceros) + "</p>");
            
        }
        out.println("<hr/>");
        out.println("</body>");
        out.println("</html>");
        
        out.close();
    }
}
