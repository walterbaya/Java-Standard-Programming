/*
Crear la clase abstracta Persona con las siguientes características:

nombre (privado y de la clase java.lang.String)
fechaDeNacimiento (privado y de la clase java.util.Date)
métodos de acceso (setters y getters) correspondientes
 */
package laboratorio4B;

public abstract class Persona {

    private java.lang.String nombre;
    private java.util.Date fechaDeNacimiento; //Donde util es el paquete y Date el nombre de la clase

    public java.lang.String getNombre() {
        return nombre;
    }

    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    public java.util.Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(java.util.Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}
