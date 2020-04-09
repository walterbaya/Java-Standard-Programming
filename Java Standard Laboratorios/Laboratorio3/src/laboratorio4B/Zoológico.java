/*
Crear la clase Zoológico que tenga las siguientes características:

 Atributos de clase públicos y constantes  CANTIDAD_ANIMALES = 25 y RACIONES_POR_ANIMAL = 5 del tipo entero
 Atributo privado abierto del tipo boolean representando si el zoológico está abierto o cerrado
 Método abrir() para abrir el zoológico
 Método alimentarAnimales(int unaCantidadDeRaciones) 
 Método cerrar() para cerrar el zoológico
 */
package laboratorio4B;

public class Zoológico {

    public final static int CANTIDAD_ANIMALES = 25;
    public final static int RACIONES_POR_ANIMAL = 5;
    private boolean abierto = false;

    public void abrir() {
        this.abierto = true;
    }

    public void cerrar() {
        this.abierto = false;
    }

    public void alimentarAnimales(int unaCantidadDeRaciones) {
        if (abierto == true) {
            Cuidador guarda = new Cuidador(unaCantidadDeRaciones);
            guarda.alimentarAnimales();
        } else {
            System.out.println("El zoologico esta cerrado y no se puede alimentar animales");
        }

    }

}
