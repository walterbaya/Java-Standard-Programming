package ar.com.educacionit.vehiculos.ventanas;

import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Runner extends Application {

    private Stage escenarioPrincipal;
    private AnchorPane ventanaMaestra;
    private static boolean abierta=false;

    @Override
    public void start(Stage escenarioPrincipal) throws IOException {
        this.escenarioPrincipal = escenarioPrincipal;
        this.escenarioPrincipal.setTitle("Ventana Principal");
        abrirVentanaMaestra();
    }

    public void abrirVentanaMaestra() throws IOException {
        FXMLLoader cargador = new FXMLLoader();
        URL direccion = getClass().getResource("/ar/com/educacionit/vehiculos/ventanas/VentanaMaestra.fxml");
        cargador.setLocation(direccion);
        AnchorPane ventanaPrincipal = (AnchorPane) cargador.load();

        VentanaMaestraController controlador = cargador.getController();
        controlador.setRunner(this);
        
        Scene escena = new Scene(ventanaPrincipal);
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.show();

    }

    public void abrirAutosVentana() throws IOException {
        if(abierta==false){
        Stage escenario = new Stage();
        escenario.initOwner(escenarioPrincipal);
        escenario.setTitle("Inicio");

        FXMLLoader cargador = new FXMLLoader();
        URL direccion = getClass().getResource("/ar/com/educacionit/vehiculos/ventanas/AutosVentana.fxml");
        cargador.setLocation(direccion);
        AnchorPane ventana = (AnchorPane) cargador.load();
       
        Scene escena = new Scene(ventana);
        escenario.setScene(escena);
        escenario.show();
        abierta = true;
        
    }
    }
    public void abrirVentanaCompradores() throws IOException {
        if(abierta==false){
        Stage escenario = new Stage();
        escenario.initOwner(escenarioPrincipal);
        escenario.setTitle("Compradores");

        FXMLLoader cargador = new FXMLLoader();
        URL direccion = getClass().getResource("/ar/com/educacionit/vehiculos/ventanas/CompradoresVentana.fxml");
        cargador.setLocation(direccion);
        AnchorPane ventanaCargada = (AnchorPane) cargador.load();

        Scene escena = new Scene(ventanaCargada);
        escenario.setScene(escena);
        escenario.show();
        
        abierta=true;
         if(!escenario.isShowing()){
            abierta=false;
        }
    }
    }
    public void abrirVentanaVendedores() throws IOException {
        if(abierta==false){
            
        Stage escenario = new Stage();
        escenario.initOwner(escenarioPrincipal);
        escenario.setTitle("Vendedores");

        FXMLLoader cargador = new FXMLLoader();
        URL direccion = getClass().getResource("/ar/com/educacionit/vehiculos/ventanas/VendedoresVentana.fxml");
        cargador.setLocation(direccion);
        AnchorPane ventana = (AnchorPane) cargador.load();

        Scene escena = new Scene(ventana);
        escenario.setScene(escena);
        escenario.show();
        abierta=true;
         if(!escenario.isShowing()){
            abierta=false;
        }
        }
    }
    
    public void abrirVentanaConfiguracion() throws IOException{
        if(abierta==false){
            
            Stage escenario = new Stage();
            escenario.initOwner(escenarioPrincipal);
            escenario.setTitle("Configuracion");
            
            FXMLLoader cargador = new FXMLLoader();
            URL direccion = getClass().getResource("/ar/com/educacionit/vehiculos/ventanas/ConfiguracionVentana.fxml");
            cargador.setLocation(direccion);
            AnchorPane ventana = (AnchorPane) cargador.load();
            
            Scene escena = new Scene(ventana);
            escenario.setScene(escena);
            escenario.show();
            abierta=true;
            if(!escenario.isShowing()){
                abierta=false;
            }
            
        }
    }
    
    public static void cerrar(){
       abierta=false; 
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
