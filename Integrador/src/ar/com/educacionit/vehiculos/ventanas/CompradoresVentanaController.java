package ar.com.educacionit.vehiculos.ventanas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CompradoresVentanaController implements Initializable {

    @FXML
    private Button cerrar;
    @FXML
    private Button editar;
    @FXML
    private Button borrar;

    @FXML
    private void cerrarVentana() {
        Stage escenario = (Stage) cerrar.getScene().getWindow();
        escenario.close();
        Runner.setEstado(false);
    }

    @FXML
    public void abrirAutosEdicion() throws IOException {
          if (Runner.estado() == true && Runner.estadoCompradores() == true) {
            
            Stage escenario = new Stage();
            escenario.initOwner(Runner.escenarioPrincipal());
            escenario.setTitle("Autos Edicion");

            FXMLLoader cargador = new FXMLLoader();
            URL direccion = getClass().getResource("/ar/com/educacionit/vehiculos/ventanas/AutosEdicion.fxml");
            cargador.setLocation(direccion);
            AnchorPane ventana = (AnchorPane) cargador.load();

            Scene escena = new Scene(ventana);
            escenario.setScene(escena);
            escenario.show();
            Runner.setEstado(true);
            if (!escenario.isShowing()) {
                Runner.setEstado(false);
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        editar.setDisable(true);
        borrar.setDisable(true);
    }


}
