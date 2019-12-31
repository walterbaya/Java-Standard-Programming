package ProyectoDosVentanas;

import static ProyectoDosVentanas.ProyectoUnaVentana.escenarioPrincipal;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class VentanaComputacionController implements Initializable {

    //CheckBox de Cursadas
    @FXML
    CheckBox AnalisisIIC;
    @FXML
    CheckBox AlgebraIC;
    @FXML
    CheckBox AlgoritmosIC;
    @FXML
    CheckBox AlgoritmosIIC;
    @FXML
    CheckBox AlgoritmosIIIC;
    @FXML
    CheckBox OrganizacionIC;
    @FXML
    CheckBox OrganizacionIIC;
    @FXML
    CheckBox MetodosNumericosC;
    @FXML
    CheckBox IngenieriaIC;
    @FXML
    CheckBox IngenieriaIIC;
    @FXML
    CheckBox ProbabilidadYEstadisticaC;
    @FXML
    CheckBox SistemasOperativosC;
    @FXML
    CheckBox LogicaYComputabilidadC;
    @FXML
    CheckBox TeoriaComunicacionesC;
    @FXML
    CheckBox BaseDeDatosC;
    @FXML
    CheckBox TeoriaDeLenguajesC;
    @FXML
    CheckBox ParadigmaDeLenguajesC;

    //CheckBox de Final
    @FXML
    CheckBox AnalisisIIF;
    @FXML
    CheckBox AlgebraIF;
    @FXML
    CheckBox AlgoritmosIF;
    @FXML
    CheckBox AlgoritmosIIF;
    @FXML
    CheckBox AlgoritmosIIIF;
    @FXML
    CheckBox OrganizacionIF;
    @FXML
    CheckBox OrganizacionIIF;
    @FXML
    CheckBox MetodosNumericosF;
    @FXML
    CheckBox IngenieriaIF;
    @FXML
    CheckBox IngenieriaIIF;
    @FXML
    CheckBox ProbabilidadYEstadisticaF;
    @FXML
    CheckBox SistemasOperativosF;
    @FXML
    CheckBox LogicaYComputabilidadF;
    @FXML
    CheckBox TeoriaComunicacionesF;
    @FXML
    CheckBox BaseDeDatosF;
    @FXML
    CheckBox TeoriaDeLenguajesF;
    @FXML
    CheckBox ParadigmaDeLenguajesF;

    //TextField Notas
    @FXML
    private TextField AnalisisIIN;
    @FXML
    private TextField AlgebraIN;
    @FXML
    private TextField AlgoritmosIN;
    @FXML
    private TextField AlgoritmosIIN;
    @FXML
    private TextField AlgoritmosIIIN;
    @FXML
    private TextField OrganizacionIN;
    @FXML
    private TextField OrganizacionIIN;
    @FXML
    private TextField MetodosNumericosN;
    @FXML
    private TextField IngenieriaIN;
    @FXML
    private TextField IngenieriaIIN;
    @FXML
    private TextField ProbabilidadYEstadisticaN;
    @FXML
    private TextField SistemasOperativosN;
    @FXML
    private TextField LogicaYComputabilidadN;
    @FXML
    private TextField TeoriaComunicacionesN;
    @FXML
    private TextField BaseDeDatosN;
    @FXML
    private TextField TeoriaDeLenguajesN;
    @FXML
    private TextField ParadigmaDeLenguajesN;

    //Botones 
    @FXML
    private Button cargarOptativas;
    @FXML
    private Button NumeroAplazos;
    @FXML
    Button PromedioConCBC;
    @FXML
    Button PromedioSinCBC;

    //TextField promedio
    @FXML
    TextField PromedioSinCBCF;
    @FXML
    TextField PromedioConCBCF;

    //Promedio
    static double sumaCBC;
    static double suma;
    static double promedioCBC;
    static double cantNotas;

    public void IncrementarCantNotas() {
        this.cantNotas++;
        System.out.println(cantNotas);
    }

    public void setSumaCBC(double d) {
        sumaCBC = sumaCBC + d;
    }

    public void setSuma(double d) {
        suma = suma + d;
        System.out.println(suma);
    }

    @FXML
    public void setAnalisisIIN() {
        AnalisisIIN.setDisable(true);
        String texto = AnalisisIIN.getText();
        Double nota = Double.valueOf(texto);
        setSuma(nota);
        setSumaCBC(nota);
        cantNotas++;
    }

    @FXML
    public void setAlgebraIN() {
        AlgebraIN.setDisable(true);
        String texto = AlgebraIN.getText();
        Double nota = Double.valueOf(texto);
        setSuma(nota);
        setSumaCBC(nota);
        cantNotas++;
    }

    @FXML
    public void setAlgoritmosIN() {
        AlgoritmosIN.setDisable(true);
        String texto = AlgoritmosIN.getText();
        Double nota = Double.valueOf(texto);
        setSuma(nota);
        setSumaCBC(nota);
        cantNotas++;
    }

    @FXML
    public void setAlgoritmosIIN() {
        AlgoritmosIIN.setDisable(true);
        String texto = AlgoritmosIIN.getText();
        Double nota = Double.valueOf(texto);
        setSuma(nota);
        setSumaCBC(nota);
        cantNotas++;
    }

    @FXML
    public void setAlgoritmosIIIN() {
        AlgoritmosIIIN.setDisable(true);
        String texto = AlgoritmosIIIN.getText();
        Double nota = Double.valueOf(texto);
        setSuma(nota);
        setSumaCBC(nota);
        cantNotas++;
    }

    @FXML
    public void setOrganizacionIN() {
        OrganizacionIN.setDisable(true);
        String texto = OrganizacionIN.getText();
        Double nota = Double.valueOf(texto);
        setSuma(nota);
        setSumaCBC(nota);
        cantNotas++;
    }

    @FXML
    public void setOrganizacionIIN() {
        OrganizacionIIN.setDisable(true);
        String texto = OrganizacionIIN.getText();
        Double nota = Double.valueOf(texto);
        setSuma(nota);
        setSumaCBC(nota);
        cantNotas++;
    }

    @FXML
    public void setMetodosNumericosN() {
        MetodosNumericosN.setDisable(true);
        String texto = MetodosNumericosN.getText();
        Double nota = Double.valueOf(texto);
        setSuma(nota);
        setSumaCBC(nota);
        cantNotas++;
    }

    @FXML
    public void setIngenieriaIN() {
        IngenieriaIN.setDisable(true);
        String texto = IngenieriaIN.getText();
        Double nota = Double.valueOf(texto);
        setSuma(nota);
        setSumaCBC(nota);
        cantNotas++;
    }

    @FXML
    public void setIngenieriaIIN() {
        IngenieriaIIN.setDisable(true);
        String texto = IngenieriaIIN.getText();
        Double nota = Double.valueOf(texto);
        setSuma(nota);
        setSumaCBC(nota);
        cantNotas++;
    }

    @FXML
    public void setProbabilidadYEstadisticaN() {
        ProbabilidadYEstadisticaN.setDisable(true);
        String texto = ProbabilidadYEstadisticaN.getText();
        Double nota = Double.valueOf(texto);
        setSuma(nota);
        setSumaCBC(nota);
        cantNotas++;
    }

    @FXML
    public void setSistemasOperativosN() {
        SistemasOperativosN.setDisable(true);
        String texto = SistemasOperativosN.getText();
        Double nota = Double.valueOf(texto);
        setSuma(nota);
        setSumaCBC(nota);
        cantNotas++;
    }

    @FXML
    public void setLogicaYComputabilidadN() {
        LogicaYComputabilidadN.setDisable(true);
        String texto = LogicaYComputabilidadN.getText();
        Double nota = Double.valueOf(texto);
        setSuma(nota);
        setSumaCBC(nota);
        cantNotas++;
    }

    @FXML
    public void setTeoriaComunicacionesN() {
        TeoriaComunicacionesN.setDisable(true);
        String texto = TeoriaComunicacionesN.getText();
        Double nota = Double.valueOf(texto);
        setSuma(nota);
        setSumaCBC(nota);
        cantNotas++;
    }

    @FXML
    public void setBaseDeDatosN() {
        BaseDeDatosN.setDisable(true);
        String texto = BaseDeDatosN.getText();
        Double nota = Double.valueOf(texto);
        setSuma(nota);
        setSumaCBC(nota);
        cantNotas++;
    }

    @FXML
    public void setTeoriaDeLenguajesN() {
        TeoriaDeLenguajesN.setDisable(true);
        String texto = TeoriaDeLenguajesN.getText();
        Double nota = Double.valueOf(texto);
        setSuma(nota);
        setSumaCBC(nota);
        cantNotas++;
    }

    @FXML
    public void setParadigmaDeLenguajesN() {
        ParadigmaDeLenguajesN.setDisable(true);
        String texto = ParadigmaDeLenguajesN.getText();
        Double nota = Double.valueOf(texto);
        setSuma(nota);
        setSumaCBC(nota);
        cantNotas++;
    }
    public void setPromedio(){
        double promedio = sumaCBC/cantNotas;
        System.out.println(sumaCBC + " " + cantNotas);
        PromedioConCBC.setText(String.valueOf(promedio));
    }
    @FXML
    public void setPromedioSinCbc() {
        double promedio = suma/cantNotas;
        System.out.println(suma + " " + cantNotas);
        PromedioSinCBCF.setText(String.valueOf(promedio));
    }

    @FXML
    public void AbrirVentanaOptativasComputacion() throws IOException {
        Stage escenario = new Stage();
        escenario.initOwner(escenarioPrincipal);
        escenario.setTitle("Optativas");

        FXMLLoader cargador = new FXMLLoader();
        URL direccion = getClass().getResource("/ProyectoDosVentanas/VentanaOptativas.fxml");
        cargador.setLocation(direccion);
        AnchorPane ventanaOptativas = (AnchorPane) cargador.load();

        Scene escenaCompu = new Scene(ventanaOptativas);
        escenario.setScene(escenaCompu);
        escenario.show();
    }

    @FXML
    public void AbrirVentanaAplazosComputacion() throws IOException {
        Stage escenario = new Stage();
        escenario.initOwner(escenarioPrincipal);
        escenario.setTitle("Aplazos");

        FXMLLoader cargador = new FXMLLoader();
        URL direccion = getClass().getResource("/ProyectoDosVentanas/VentanaAplazos.fxml");
        cargador.setLocation(direccion);
        AnchorPane ventanaAplazos = (AnchorPane) cargador.load();

        Scene escenaCompu = new Scene(ventanaAplazos);
        escenario.setScene(escenaCompu);
        escenario.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
