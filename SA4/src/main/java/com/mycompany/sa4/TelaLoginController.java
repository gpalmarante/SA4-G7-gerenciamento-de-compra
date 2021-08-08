/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sa4;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author gpalmarante
 */
public class TelaLoginController {
    @FXML 
        TextField TxtLogin;
    @FXML
        TextField TxtSenha;
    
    @FXML
     private void BtnAcaoLogar() throws IOException {
                  
    }
    @FXML 
    private void BtnAcaoCadastar()throws IOException {
        App.setRoot("TelaCadastro");
    }
}
