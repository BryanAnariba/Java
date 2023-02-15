package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet( "/FormularioHtmlUsuario" )
public class FormularioUsuario extends HttpServlet {
    @Override
    protected void doPost( HttpServletRequest req, HttpServletResponse res ) throws IOException {
        
        res.setContentType( "text/html; charset=UTF8" );
        PrintWriter out = res.getWriter();
        
        // Recogemos los parametros del formulario
        String nombreUsuario = req.getParameter("nombreUsuario");
        String passwordUsuario = req.getParameter("passwordUsuario");
        String tecnologias[] = req.getParameterValues("tecnologia");
        String genero = req.getParameter("genero");
        String profesion = req.getParameter("profesion");
        String musicas[] = req.getParameterValues("musica");
        String comentarios = req.getParameter("comentarios");
        
        // Retornamos al servidor de nuevo con una nueva vista
        out.println("<!doctype html>");
        out.println("<html lang=\"en\">");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\">");
        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
        out.println("<title>Formulario Html</title>");
        out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\" crossorigin=\"anonymous\">");
        out.println("<link href=\"./recursos/styles.css\"/>");
        out.println("</head>");
        out.println("<body>");
        
        out.println("<div class=\"container\">");
        out.println("<div class=\"row mt-5 mx-auto text-center\">");
        out.println("<div class=\"col-lg-6 col-sm-12 text-center mx-auto\">");
        
        out.println("<div class=\"card text-white bg-primary mb-3\" style=\"max-width: 18rem;\">");
        out.println("<div class=\"card-header\">Usuario: " + nombreUsuario + ", Clave: " + passwordUsuario + ", Sexo: " + genero + "</div>");
        out.println("<div class=\"card-body\">"); 
        out.println("<h5 class=\"card-title\">" + "Tecnologias: " + "</h5>");
        
        out.println("<ul class=\"list-group\">");        
        if ( tecnologias != null ) {
            for( String tecnologia: tecnologias ) {
                out.println("<li class=\"list-group-item active\">" + tecnologia + "</li>");        
            }
        } else {
            out.println("<li class=\"list-group-item active\">No Selecciono Tecnologias Favoritas</li>");        
        }
        out.println("</ul>");        
        out.println("<p class=\"card-text\">Profesion: " + profesion + "</p>");
        
        out.println("<h5 class=\"card-title\">" + "Generos Musicales: " + "</h5>");
        out.println("<ul class=\"list-group\">");     
        if ( musicas != null ) {
            for( String musica: musicas ) {
                out.println("<li class=\"list-group-item active\">" + musica + "</li>");        
            }
        } else {
            out.println("<li class=\"list-group-item active\">Musica No Seleccionada</li>");        
        }
        out.println("</ul>");        
        out.println("<p class=\"card-text\">Comentarios: " + comentarios + "</p>");
        out.println("</div>");
        out.println("</div>");
        
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        
        out.println("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\" crossorigin=\"anonymous\"></script>");
        out.println("<script src=\"./recursos/controlador.js\"></script>");
        out.println("</body>");
        out.println("</html>");
    }
}
