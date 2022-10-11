package test;

import hn.com.sc.domain.PersonaBean;

public class TestJavaBean {
    public static void main(String[] args) {
        PersonaBean persona = new PersonaBean();
        persona.setNombre("Bryan");
        persona.setApellido("Anarriba");
        System.out.println("Persona: " + persona);
    }
}
