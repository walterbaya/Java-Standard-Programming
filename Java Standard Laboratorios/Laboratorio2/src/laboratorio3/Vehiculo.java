package laboratorio3;

/*Armar la clase Vehículo con los siguientes atributos:

      alto, de tipo int
        ancho, de tipo int
        largo, de tipo int
 */
public class Vehiculo {

    private int alto;
    private int ancho;
    private int largo;

    //Construir los setters y los getters de forma automática
    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {

    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
//Armar un constructor

    public Vehiculo(int ancho, int alto, int largo) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "El alto es: " + this.alto + ", el ancho es: " + this.ancho
                + ", el largo es: " + this.largo;
    }
}
