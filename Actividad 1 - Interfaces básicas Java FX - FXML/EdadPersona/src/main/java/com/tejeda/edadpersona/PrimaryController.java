package com.tejeda.edadpersona;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;


public class PrimaryController {
    @FXML DatePicker edad;
    @FXML Label mostrarEdad;
    
    @FXML
    private void calcularEdad() throws IOException {
        LocalDate anioNacimiento=edad.getValue();
        LocalDate anioActual=LocalDate.now();
        
        Period periodo=Period.between(anioNacimiento,anioActual);
        int anios=periodo.getYears();
        int meses=periodo.getMonths();
        mostrarEdad.setText("Tiene "+anios+" años con "+meses+" meses");
    }
    
    @FXML
    private void limpiarFecha() throws IOException {
       edad.setValue(null);
       mostrarEdad.setText("");
    }
}
