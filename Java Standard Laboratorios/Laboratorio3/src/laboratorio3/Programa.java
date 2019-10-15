package laboratorio3;

public class Programa {

/*  CLASE #03: PROGRAMACIÓN ORIENTADA O OBJETOS  
Proyecto Integrador Fase #1 – Detección de clases y Construcción Base del proyecto  
Especificación
    
Construir la clase Programa y dentro del método main realizar lo siguiente:
   
*/
    public static void main(String[] args) {
        
        //instanciar un vehiculo utilizando el constructor de tres parámetros
        
        Vehiculo auto=new Vehiculo(1,2,3);
        
        //informar los valores de los atributos del vehiculo instanciado
        
        auto.toString();
        
        // instanciar una persona utilizando el constructor de tres parámetros
        
         Persona pers = new Persona("Juan", "jolinjo", "1254");
         
         // informar los valores de los atributos de la persona instanciada
         
         pers.toString();
    }

}
