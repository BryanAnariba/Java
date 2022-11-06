package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/holaMundo")
public class HolaMundo  extends  HttpServlet {
    
    @Override
    public void doGet( HttpServletRequest req, HttpServletResponse res ) throws IOException{
        res.setContentType( "text/html;charset=UTF-8" );
        PrintWriter out = res.getWriter();
        out.println( "Hola Mundo Desde Servlets/HolaMundo.class" );
        
    }
    
}
