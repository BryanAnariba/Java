package hn.com.basa.helloWorld;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Con esto Spring reconoce la clase creada por nosotros @RestController
@RestController
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio () {
        log.info("Ejecutando la primer get request");
        return "Mi Primer clase generada con spring boot";
    }
    
}
