package ProyectoDosVentanas.Controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class VentanaOptativasController extends VentanaComputacionController implements Initializable {

    static int puntosFaltantes = 12;
    String nombreMateriaS = " ";

    @FXML
    TextField nombreMateria;
    @FXML
    TextField puntosMateria;
    @FXML
    TextField notaObtenida;
    @FXML
    TextField puntosRestantes;

    
    
    @FXML
    public void ingresarMateriaOptativa() {
        nombreMateriaS = nombreMateriaS + nombreMateria.getText() + " ";
        int puntosMateriaS = (int) Integer.valueOf(puntosMateria.getText());
        double notaObtenidaS = Double.valueOf(notaObtenida.getText());
        super.setSuma(notaObtenidaS);
        super.IncrementarCantNotas();
        puntosFaltantes = puntosFaltantes - puntosMateriaS;
        puntosRestantes.setText(String.valueOf(puntosFaltantes));
        System.out.println(puntosFaltantes);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        puntosRestantes.setDisable(true);
    }

}
