package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CarritoCompra")
public class CarritoCompra extends HttpServlet {
    
    @Override
    protected void doPost ( HttpServletRequest req, HttpServletResponse res ) throws IOException {
        res.setContentType("text/html; charset=UTF-8");
        
        // Parametros del form
        String articuloNuevo = req.getParameter("articulo");
        
        // Creamos el objeto session
        HttpSession sesion = req.getSession();
        
        // Recuperamos la lista de articulos verificando si existe
        List<String> listadoArticulos = (List<String>)sesion.getAttribute("articulos");
        
        if ( listadoArticulos == null) { // Si en la lista no hay nada inicializamos la lista de articulos y la metemos a la sesion
            listadoArticulos = new ArrayList<>(); // Inicializando
            sesion.setAttribute("articulos", listadoArticulos);
        }
        
        // Si Viene algo en articulonuevo lo agregamos
        if  ( articuloNuevo != null && !articuloNuevo.trim().equals("")) {
            listadoArticulos.add(articuloNuevo); // si agregamos aqui la sesion tambien lo agregara
        }
        
        // Imprimimos los articulos agregados
        PrintWriter out = res.getWriter();
        out.println("<h2>Listado de articulos</h2>");
        out.println("<hr/>");
        out.println("<ul>");
        for( String articuloEncontrado: listadoArticulos ) {
            out.println("<li>Articulo: " + articuloEncontrado + "</li>");
        }
        out.println("</ul>");
        out.println("<a href='/CarritoComprasConSesiones_09'>Ir a inicio</a>");
        out.close();
    }   
    
}
