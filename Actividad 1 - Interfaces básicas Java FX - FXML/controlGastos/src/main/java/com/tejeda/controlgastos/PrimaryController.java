package com.tejeda.controlgastos;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML TextField alim;
    @FXML TextField refri;
    @FXML TextField trans;
    @FXML TextField tel;
    @FXML TextField otro;
    @FXML TextField total;
    @FXML TextField gastoAlto;
    
    @FXML
    private void switchToSecondary() throws IOException {
        int alimen = Integer.parseInt(alim.getText());
        int refriger = Integer.parseInt(refri.getText());
        int transpo = Integer.parseInt(trans.getText());
        int telef = Integer.parseInt(tel.getText());
        int otros = Integer.parseInt(otro.getText());
         
        int sumaTotal = alimen + refriger + transpo + telef + otros;
        total.setText(sumaTotal+" ");
        
        if(otros>alimen){
            gastoAlto.setText("Otros");
        }
        if(alimen>refriger){
            gastoAlto.setText("Alimentos");
        }
        if(refriger>transpo){
            gastoAlto.setText("Refrigerios");
        }
        if(transpo>telef){
            gastoAlto.setText("Transporte");
        }
        if(telef>otros){
            gastoAlto.setText("Telefono");
        }
        
    }
    @FXML
    private void limpiar() throws IOException {
        alim.setText("");
        refri.setText("");
        trans.setText("");
        tel.setText("");
        otro.setText("");
        total.setText("");
        gastoAlto.setText("");
    }
}
