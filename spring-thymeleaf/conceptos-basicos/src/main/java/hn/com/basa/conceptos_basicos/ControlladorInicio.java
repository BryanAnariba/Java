package hn.com.basa.conceptos_basicos;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControlladorInicio {
    
    // http://localhost:8080
    @GetMapping("/")
    public String inicio () {
        return "Hola mundo con Spring Boot";
    }
}
