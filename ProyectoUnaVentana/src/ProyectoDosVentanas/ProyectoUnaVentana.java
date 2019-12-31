package ProyectoDosVentanas;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ProyectoUnaVentana extends Application {

    static Stage escenarioPrincipal;

    @Override
    public void start(Stage escenario) throws Exception {
        this.escenarioPrincipal = escenario;
        abrirPrincipal();

    }

    public void abrirPrincipal() throws IOException {
        //hay que cargar
        FXMLLoader cargador = new FXMLLoader();
        URL direccion = getClass().getResource("VentanaPrincipal.fxml");
        cargador.setLocation(direccion);
        AnchorPane ventanaPrincipal = (AnchorPane) cargador.load();

        VentanaPrincipalController controlador = cargador.getController();
        controlador.setAplicacionPrincipal(this);

        //hay que setear la escena como principal 
        Scene escena = new Scene(ventanaPrincipal);
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.show();
    }

    public void AbrirVentanaMatematica() throws MalformedURLException, IOException {

            //Creo un escenario en el cual voy a poner la escena que tendra mi fxml cargado
        //creo un objeto escenario
        Stage escenario = new Stage();
        //indico su escenario principal, a partir del cual se crea este
        escenario.initOwner(escenarioPrincipal);
        //opcionalmente le pongo un titulo, con estos tres pasos queda creado el escenario
        escenario.setTitle("Licenciatura En Ciencias Matematicas(Orientación aplicada)");

            //Cargar el FXML dentro de una clase FXMLLoader para luego poder crear una escena con el
        //AVERIGUAR COMO SE PRODUCE LA CARGA PARA PODER ENTENDERLO A FONDO
        //Crear el cargador para la escena
        FXMLLoader cargador = new FXMLLoader();

            //dar la ubicacion del fxml para que el cargador pueda encontrarlo
        //el getClass().getResource() me devuelve la url de mi archivo fxml
        URL direccion = getClass().getResource("/ProyectoDosVentanas/VentanaMatematica.fxml");
        cargador.setLocation(direccion);

        //creas el objeto AnchorPane que sera la base de la ventana a partir del cargador
        AnchorPane ventanaMatematica = (AnchorPane) cargador.load();
        /*Aca finaliza el proceso de carga una vez finalizado voy a poder usar el fondo de mi
         ventana y cargarlo en una nueva escena*/

            //Parte 3 cargar el objeto AnchoPane 
        //crear una nueva escena un objeto escena y pasarle por parametro la ventana cargada
        Scene escenaMate = new Scene(ventanaMatematica);
        //setear la escena en el escenario
        escenario.setScene(escenaMate);
        //mostrar la escena en el escenario
        escenario.show();
    }

    public void AbrirVentanaComputacion() throws IOException {

        Stage escenario = new Stage();
        escenario.initOwner(escenarioPrincipal);
        escenario.setTitle("Ciencias de la computacion");

        FXMLLoader cargador = new FXMLLoader();
        URL direccion = getClass().getResource("/ProyectoDosVentanas/VentanaComputacion.fxml");
        cargador.setLocation(direccion);
        AnchorPane ventanaComputacion = (AnchorPane) cargador.load();

        Scene escenaCompu = new Scene(ventanaComputacion);
        escenario.setScene(escenaCompu);
        escenario.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
