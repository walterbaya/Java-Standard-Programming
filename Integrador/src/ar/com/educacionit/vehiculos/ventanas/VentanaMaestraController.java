
package ar.com.educacionit.vehiculos.ventanas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class VentanaMaestraController implements Initializable {
    private Runner runner;
    public void setRunner(Runner runner){
        this.runner=runner;
    }
    public void AbrirVentanaAutos() throws IOException{
        this.runner.abrirAutosVentana();
    }
    
    public void AbrirVentanaVendedores() throws IOException{
        this.runner.abrirVentanaVendedores();
    }
    public void AbrirVentanaCompradores() throws IOException{
        this.runner.abrirVentanaCompradores();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
