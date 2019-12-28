package ProyectoDosVentanas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class VentanaComputacionController implements Initializable {

    private enum MateriasCBC {
        AnalisisMatematico, Algebra, ICSE, IPC, Quimica, Fisica
    }

    private enum MateriasGrado {
        AnalisisII, AlgebraI, AlgoritmosI, AlgoritmosII, AlgoritmosIII,
        OrganizacionI, OrganizacionII, MetodosNumericos, IngenieriaI, IngenieriaII, ProbabilidadYEstadistica,
        SistemasOperativos, LogicaYComputabilidad, TeoriaComunicaciones, BaseDeDatos, TeoriaDeLenguajes, ParadigmasDeLenguajes
    }

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
    double sumaCBC;
    double suma;
    double promedioCBC;
    double promedio;

    public void setAnalisisIIN(TextField AnalisisIIN) {
        AnalisisIIN.setDisable(true);
        String texto = AnalisisIIN.getText();
        Double nota = Double.valueOf(texto);
        suma = nota + suma;
        sumaCBC = nota + sumaCBC;
    }

    public void setAlgebraIN(TextField AlgebraIN) {
        AlgebraIN.setDisable(true);
        String texto = AlgebraIN.getText();
        Double nota = Double.valueOf(texto);
        suma = nota + suma;
        sumaCBC = nota + sumaCBC;
    }

    public void setAlgoritmosIN(TextField AlgoritmosIN) {
        AlgoritmosIN.setDisable(true);
        String texto = AlgoritmosIN.getText();
        Double nota = Double.valueOf(texto);
        suma = nota + suma;
        sumaCBC = nota + sumaCBC;
    }

    public void setAlgoritmosIIN(TextField AlgoritmosIIN) {
        AlgoritmosIIN.setDisable(true);
        String texto = AlgoritmosIIN.getText();
        Double nota = Double.valueOf(texto);
        suma = nota + suma;
        sumaCBC = nota + sumaCBC;
    }

    public void setAlgoritmosIIIN(TextField AlgoritmosIIIN) {
        AlgoritmosIIIN.setDisable(true);
        String texto = AlgoritmosIIIN.getText();
        Double nota = Double.valueOf(texto);
        suma = nota + suma;
        sumaCBC = nota + sumaCBC;
    }

    public void setOrganizacionIN(TextField OrganizacionIN) {
        OrganizacionIN.setDisable(true);
        String texto = OrganizacionIN.getText();
        Double nota = Double.valueOf(texto);
        suma = nota + suma;
        sumaCBC = nota + sumaCBC;
    }

    public void setOrganizacionIIN(TextField OrganizacionIIN) {
        OrganizacionIIN.setDisable(true);
        String texto = OrganizacionIIN.getText();
        Double nota = Double.valueOf(texto);
        suma = nota + suma;
        sumaCBC = nota + sumaCBC;
    }

    public void setMetodosNumericosN(TextField MetodosNumericosN) {
        MetodosNumericosN.setDisable(true);
        String texto = MetodosNumericosN.getText();
        Double nota = Double.valueOf(texto);
        suma = nota + suma;
        sumaCBC = nota + sumaCBC;
    }

    public void setIngenieriaIN(TextField IngenieriaIN) {
        IngenieriaIN.setDisable(true);
        String texto = IngenieriaIN.getText();
        Double nota = Double.valueOf(texto);
        suma = nota + suma;
        sumaCBC = nota + sumaCBC;
    }

    public void setIngenieriaIIN(TextField IngenieriaIIN) {
        IngenieriaIIN.setDisable(true);
        String texto = IngenieriaIIN.getText();
        Double nota = Double.valueOf(texto);
        suma = nota + suma;
        sumaCBC = nota + sumaCBC;
    }

    public void setProbabilidadYEstadisticaN(TextField ProbabilidadYEstadisticaN) {
        ProbabilidadYEstadisticaN.setDisable(true);
        String texto = ProbabilidadYEstadisticaN.getText();
        Double nota = Double.valueOf(texto);
        suma = nota + suma;
        sumaCBC = nota + sumaCBC;
    }

    public void setSistemasOperativosN(TextField SistemasOperativosN) {
        SistemasOperativosN.setDisable(true);
        String texto = SistemasOperativosN.getText();
        Double nota = Double.valueOf(texto);
        suma = nota + suma;
        sumaCBC = nota + sumaCBC;
    }

    public void setLogicaYComputabilidadN(TextField LogicaYComputabilidadN) {
        LogicaYComputabilidadN.setDisable(true);
        String texto = LogicaYComputabilidadN.getText();
        Double nota = Double.valueOf(texto);
        suma = nota + suma;
        sumaCBC = nota + sumaCBC;
    }

    public void setTeoriaComunicacionesN(TextField TeoriaComunicacionesN) {
        TeoriaComunicacionesN.setDisable(true);
        String texto = TeoriaComunicacionesN.getText();
        Double nota = Double.valueOf(texto);
        suma = nota + suma;
        sumaCBC = nota + sumaCBC;
    }

    public void setBaseDeDatosN(TextField BaseDeDatosN) {
        BaseDeDatosN.setDisable(true);
        String texto = BaseDeDatosN.getText();
        Double nota = Double.valueOf(texto);
        suma = nota + suma;
        sumaCBC = nota + sumaCBC;
    }

    public void setTeoriaDeLenguajesN(TextField TeoriaDeLenguajesN) {
        this.TeoriaDeLenguajesN = TeoriaDeLenguajesN;
    }

    public void setParadigmaDeLenguajesN(TextField ParadigmaDeLenguajesN) {
        this.ParadigmaDeLenguajesN = ParadigmaDeLenguajesN;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
