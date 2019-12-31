package ProyectoDosVentanas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class VentanaAplazosController extends VentanaComputacionController implements Initializable {

    @FXML
    Label informacion;
    @FXML
    Button cargarNuevoAplazo;
    @FXML
    TextField nota;

    byte numeroMateria = 0;
    boolean terminado = false;

    @FXML
    public void agregarAplazo() {
            double valorNota = Double.valueOf(nota.getText());
            super.setSuma(valorNota);
            super.setSumaCBC(valorNota);
            IncrementarCantNotas();
            nota.setText(" ");
            numeroMateria++;
            informacion.setText("Materia Cargada numero : " + numeroMateria);
    }
    @FXML
    public void terminarCarga() {
        informacion.setText("Carga de materias terminada.");
        nota.setDisable(true);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
