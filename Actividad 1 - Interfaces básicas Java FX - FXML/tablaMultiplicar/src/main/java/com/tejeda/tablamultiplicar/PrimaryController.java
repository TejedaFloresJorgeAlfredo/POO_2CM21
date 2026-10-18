package com.tejeda.tablamultiplicar;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML TextField num;
    @FXML TextArea multVista;
    @FXML
    private void calcular() throws IOException {
        String a=num.getText();
        int numero=Integer.parseInt(a);
        for(int i=1;i<=10;i++){
            int resultado=numero*i;
            multVista.appendText(numero + " x " + i + " = " + resultado + "\n");
        }
    }
    
    @FXML
    private void limpiar() throws IOException {
        num.setText("");
        multVista.setText("");
    }
    
}
