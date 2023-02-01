package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("GeneracionDocumentoExcel")
public class GeneracionDocumentoExcel extends HttpServlet {
    
    @Override
    protected void doGet ( HttpServletRequest req, HttpServletResponse res ) throws IOException {
        
        // Indicamos el tipo de respuesta al navegador en este caso que se descargara un archivo de excel
        res.setContentType("application/vnd.ms-excel");
        res.setHeader("Content-Disposition", "attachment;filename=ExcelEjemplo.xls");
        
        // Para generar documento de excel mejor ir a poi.apache.org
        
        // Indicar al navegador que no guarde cache
        res.setHeader("Pragma", "no-cache");
        res.setHeader("Cache-Control", "no-store"); // Que no guarde cache
        res.setDateHeader("Expires", -1); // Expire de manera inmediata
        
        // Desplegamos o en este caso descargamos el archivo
        PrintWriter out = res.getWriter();
        out.println("\tValores");
        out.println("\t1");        
        out.println("\t2");
        out.println("Total:\t=SUMA(b2:b3)");
        out.close();
    }
}
