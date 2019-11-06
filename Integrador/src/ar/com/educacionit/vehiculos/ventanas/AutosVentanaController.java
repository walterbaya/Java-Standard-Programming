
package ar.com.educacionit.vehiculos.ventanas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class AutosVentanaController implements Initializable {
    @FXML
    private Button cerrar;
    @FXML
    private void cerrarVentana(){
        Stage escenario = (Stage)cerrar.getScene().getWindow();
        escenario.close();
        Runner.cerrar();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
