
package ProyectoDosVentanas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class VentanaPrincipalController implements Initializable {

   private ProyectoUnaVentana aplicacionPrincipal;
   
   public void abrirMatematica() throws IOException{
       this.aplicacionPrincipal.AbrirVentanaMatematica();
   }
   public void abrirComputacion() throws IOException{
       this.aplicacionPrincipal.AbrirVentanaComputacion();
   }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public void setAplicacionPrincipal(ProyectoUnaVentana runner) {
        this.aplicacionPrincipal=runner;
    }
    
}
