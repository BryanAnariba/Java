package hn.com.basa;

import hn.com.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class Controlador {
    
    @GetMapping("/")
    public String inicio (Model model) {
        // Dicha vista esta en (Other Sources/src/main/resources/templates/index.html)
        var message = "Listado de Personas";
        
        Persona persona = new Persona();
        persona.setNombre("Bryan Ariel");
        persona.setApellido("Sanchez Anariba");
        persona.setEmail("saariel115@gmail.com");
        persona.setTelefono("504-99999999");
        Persona persona2 = new Persona();
        persona2.setNombre("Erick David");
        persona2.setApellido("Jimenez Anariba");
        persona2.setEmail("erickson@gmail.com");
        persona2.setTelefono("504-99999999");
        
        List<Persona> personas = new ArrayList();
        personas.add(persona);
        personas.add(persona2);
        
        model.addAttribute("message", message);
        model.addAttribute("personas", personas);
        return "index";
    }
    
}
