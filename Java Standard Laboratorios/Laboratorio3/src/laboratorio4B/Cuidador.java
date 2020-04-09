/*
Es el responsable de alimentar a los animales
Es una subclase de Persona
Posee un atributo entero privado cantidadDeRaciones que se setea cuando se construye el objeto
Método alimentarAnimales() que informará si la cantidad de raciones que le entregaron al cuidador 
fue suficiente para alimentar a todos los animales
 */
package laboratorio4B;

public class Cuidador extends Persona {

    private final int cantidadDeRaciones;

    public void alimentarAnimales() {
        int racionesNecesarias = Zoológico.CANTIDAD_ANIMALES * Zoológico.RACIONES_POR_ANIMAL;
        if (cantidadDeRaciones >= racionesNecesarias) {
            System.out.println("La cantidad de raciones fue suficiente");
        } else {
            System.out.println("La cantidad de raciones no fue suficiente");
        }
    }

    public Cuidador(int cantidadRaciones) {
        this.cantidadDeRaciones = cantidadRaciones;
    }

}
