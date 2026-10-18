package com.tejeda.numanalisis;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML TextField numero;
    @FXML TextField canCifras;
    @FXML TextField sumImpar;
    @FXML TextField SumPares;
    @FXML TextField sumTodo;
    @FXML TextField cifraMa;
    @FXML TextField cifraMen;
    @FXML TextArea divisores;
    
    @FXML
    private void switchToSecondary() throws IOException {
        String a=numero.getText(); 
        int sumaTotal=0;
        int sumaPares=0;
        int sumaImpares=0;
        int mayor=0;
        int menor=0;
        for (int i = 0; i < a.length(); i++) {
            int digito = Character.getNumericValue(a.charAt(i));
            
            sumaTotal += digito;
            
            if (digito % 2 == 0) {
                sumaPares += digito;
            } else {
                sumaImpares += digito;
            }
            
            if (digito > mayor) {
                mayor = digito;
                menor=mayor;
            }
            if (digito < menor) {
                menor = digito;
            }
        }
        int numEntero = Integer.parseInt(a);
        for (int i = 1; i <= numEntero; i++) {
            if (numEntero % i == 0) {
                divisores.appendText(i+"\n");
            }
        }
        
        canCifras.setText(a.length()+"");
        sumImpar.setText(sumaImpares+"");
        SumPares.setText(sumaPares+"");
        sumTodo.setText(sumaTotal+"");
        cifraMa.setText(mayor+"");
        cifraMen.setText(menor+"");
        
    }
    
    @FXML
    private void Limpiar() throws IOException{
        divisores.setText("");
        canCifras.setText("");
        sumImpar.setText("");
        SumPares.setText("");
        sumTodo.setText("");
        cifraMa.setText("");
        cifraMen.setText("");
        numero.setText("");
    }
}
