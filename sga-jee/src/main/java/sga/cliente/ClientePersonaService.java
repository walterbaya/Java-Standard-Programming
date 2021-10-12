package sga.cliente;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.*;
import sga.domain.Persona;
import sga.servicio.PersonaServiceRemote;

public class ClientePersonaService {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente");
        try {
            Context jndi = new InitialContext();
            //Ocultamos la implementacion de la clase y ofrecemos solo el servicio
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee/PersonaServiceImpl!sga.servicio.PersonaServiceRemote");
            List<Persona> personas = personaService.listarPersonas();
            for (Persona persona:personas) {
                System.out.println(persona);
            }
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
