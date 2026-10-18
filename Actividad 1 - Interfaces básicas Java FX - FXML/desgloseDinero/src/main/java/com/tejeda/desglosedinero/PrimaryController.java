package com.tejeda.desglosedinero;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML TextArea Cantidades;
    @FXML TextField dinero;
    @FXML 
    private void switchToSecondary() throws IOException {
        int Dinero=Integer.parseInt(dinero.getText());
        
        int quinientos = Dinero / 500;
        Dinero = Dinero % 500;
        int docientos = Dinero / 200;
        Dinero = Dinero % 200;
        int cien = Dinero / 100;
        Dinero = Dinero % 100;
        int cincuenta = Dinero / 50;
        Dinero = Dinero % 50;
        int veinte = Dinero / 20;
        Dinero = Dinero % 20;
        int dies = Dinero / 10;
        Dinero = Dinero % 10;
        int cinco = Dinero / 5;
        Dinero = Dinero % 5;
        int dos = Dinero / 2;
        Dinero = Dinero % 2;
        int uno = Dinero;
        
        Cantidades.appendText(quinientos + "\n");
        Cantidades.appendText(docientos + "\n");
        Cantidades.appendText(cien + "\n");
        Cantidades.appendText(cincuenta + "\n"); // o simplemente b50
        Cantidades.appendText(veinte + "\n");
        Cantidades.appendText(dies + "\n");
        Cantidades.appendText(cinco + "\n");
        Cantidades.appendText(dos + "\n");
        Cantidades.appendText(uno + "\n");
    }
    
    @FXML
    private void Limpiar() throws IOException {
        Cantidades.setText("");
        dinero.setText("");
    }
}


