package hn.com.basa.conceptos_basicos;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ThymeleafController {
    
    // Las paginas html se crean en Other Sources\src\main\resources\templates
    @GetMapping("/home")
    public String inicio (Model model) {
        List personas = new ArrayList<Persona>();
        Persona persona = new Persona("Nombre Uno","Apellido Uno","test1@gmail.com","55443322");
        Persona persona2 = new Persona("Nombre Dos","Apellido Dos","test2@gmail.com","55443322");
        Persona persona3 = new Persona("Nombre Tres","Apellido Tres","test3@gmail.com","55443322");
        personas.add(persona);
        personas.add(persona2);
        personas.add(persona3);
        model.addAttribute("data", personas);
        return "index";
    }
    
}
