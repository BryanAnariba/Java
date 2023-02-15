package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Sessions")
public class Sessions extends HttpServlet {
    
    @Override
    protected void doGet ( HttpServletRequest req, HttpServletResponse res ) throws IOException {
        res.setContentType("text/html; charset=UTF-8");
        
        HttpSession sesion = req.getSession();
        String titulo = "";
         
        // Pedir el atributo contador visitas a la session
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
        
        // Si es nulo es primera vez que accedermos a la aplicacion
        if (contadorVisitas == null) {
            contadorVisitas = 1;
            titulo = "Bienvenido Por Primera vez";
        } else {
            contadorVisitas++;
            titulo = "Bienvenido Nuevamente";
        }
        
        // Agregamos el nuevo valor a la session
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        
        
        // Respondemos
        PrintWriter out = res.getWriter();
        out.println(titulo + "<br>");
        out.println("Haz accedido por: " + contadorVisitas + "<br>");
        out.println("Session activa ID: " + sesion.getId());
        out.close();
    }
}
