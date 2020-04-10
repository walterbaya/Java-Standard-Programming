package programa;

public class CantidadDeArgumentosException extends Exception {

    private String id;
    private String nivelDeError;
    private String mensajeDeError;

    public CantidadDeArgumentosException(String id, String nivelDeError, String mensajeDeError) {
        this.id = id;
        this.nivelDeError = nivelDeError;
        this.mensajeDeError = mensajeDeError;
    }

    @Override
    public String getMessage() {
        return mensajeDeError;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNivelDeError() {
        return nivelDeError;
    }

    public void setNivelDeError(String nivelDeError) {
        this.nivelDeError = nivelDeError;
    }

    public String getMensajeDeError() {
        return mensajeDeError;
    }

    public void setMensajeDeError(String mensajeDeError) {
        this.mensajeDeError = mensajeDeError;
    }
}
