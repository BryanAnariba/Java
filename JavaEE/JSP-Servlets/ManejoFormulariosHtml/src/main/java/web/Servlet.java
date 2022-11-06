package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet( "/Servlet" )
public class Servlet extends HttpServlet {
    
    @Override
    protected void doPost ( HttpServletRequest req, HttpServletResponse res ) throws IOException {        
        res.setContentType( "text/html; charset=UTF-8" );
        PrintWriter out = res.getWriter();
        
        // OBTENIENDO PARAMETROS
        String nombreUsuario =  req.getParameter( "nombreUsuario" );
        String passwordUsuario = req.getParameter( "passwordUsuario" );
        String tecnologias[] = req.getParameterValues( "tecnologia" );
        String genero = req.getParameter( "genero" );
        String ocupacion = req.getParameter( "ocupacion" );
        String musicaFavorita[] = req.getParameterValues( "musicaFavorita" );
        String comentarios = req.getParameter( "comentarios" );
        //System.out.println(nombreUsuario);
        
        out.print( "<html>" );
        out.print( "<head>" );
        out.print( "<title>Resultado Servlet</title>" );
        out.print( "</head>" );
        out.print( "<body>" );
        
        out.print( "<h1>Parametros Procesados por el Servlet.</h1>" );
        
        out.print( "<table border='1'>" );
        
        out.print( "<tr>" );
        out.print( "<td>" );
        out.print( "Usuario" );
        out.print( "</td>" );
        out.print( "<td>" );
        out.print( nombreUsuario );
        out.print( "</td>" );
        out.print( "</tr>" );
        
        out.print( "<tr>" );
        out.print( "<td>" );
        out.print( "Password" );
        out.print( "</td>" );
        out.print( "<td>" );
        out.print( passwordUsuario );
        out.print( "</td>" );
        out.print( "</tr>" );
        
        out.print( "<tr>" );
        out.print( "<td>" );
        out.print( "Tecnologias" );
        out.print( "</td>" );
        out.print( "<td>" );
        int contador = 0;
        for( String tecnologia: tecnologias ) {
            if ( contador != 0 ) {
                out.print( "/" );
            }
            out.print( tecnologia );
            contador++;
        }
        out.print( "</td>" );
        out.print( "</tr>" );
        
        out.print( "<tr>" );
        out.print( "<td>" );
        out.print( "Genero" );
        out.print( "</td>" );
        out.print( "<td>" );
        out.print( ( genero.equals( "M" ) ) ? "Masculino" : "Femenino" );
        out.print( "</td>" );
        out.print( "</tr>" );
        
        out.print( "<tr>" );
        out.print( "<td>" );
        out.print( "Ocupacion" );
        out.print( "</td>" );
        out.print( "<td>" );
        out.print( ocupacion );
        out.print( "</td>" );
        out.print( "</tr>" );
        
        out.print( "<tr>" );
        out.print( "<td>" );
        out.print( "Generos Musicales" );
        out.print( "</td>" );
        out.print( "<td>" );
        if ( musicaFavorita != null ) {
            contador = 0;
            for ( String generoMusical: musicaFavorita ) {
                if ( contador != 0 ) {
                    out.print( "/" );
                }
                out.print( generoMusical );
                contador++;
            }
        } else {
            out.print( "No hay gustos Musicales" );
        }
        out.print( "</td>" );
        out.print( "</tr>" );
        
        out.print( "<tr>" );
        out.print( "<td>" );
        out.print( "Comentarios" );
        out.print( "</td>" );
        out.print( "<td>" );
        out.print( comentarios );
        out.print( "</td>" );
        out.print( "</tr>" );
        
        out.print( "</table>" );
        out.print( "</body>" );
        out.print( "</html>" );
        out.close();
    }
}
