package test;

import beans.HolaMundoEJBRemote;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming. *;


public class TestHolaMundoEJB {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente\n");
        Context jndi;
        try {
            jndi = new InitialContext();
             HolaMundoEJBRemote holaMundoEJB = (HolaMundoEJBRemote) jndi.lookup("java:global/HolaMundoEJB/HolaMundoEJBImpl!beans.HolaMundoEJBRemote");
             int resultado = holaMundoEJB.sumar(5, 3);
             System.out.println("Resultado suma: " + resultado);
        } catch (NamingException ex) {
            Logger.getLogger(TestHolaMundoEJB.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
   
}
