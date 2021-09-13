/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sa4;

import com.mycompany.sa4.ModelDAO.UsuarioDAO;
import com.mycompany.sa4.Model.Login;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
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
         System.out.println("botao logar");
                Login login = new Login();
                login.setUsuario(TxtLogin.getText());
                login.setSenha(TxtSenha.getText());
                
               System.out.println(login.getUsuario());
                UsuarioDAO dao  = new UsuarioDAO();
                
                if (dao.verifcaLogin(login)){
                	App.RegUltimaTela("TelaLogin03");
                    App.setRoot("TelaProdutos");
                    System.out.println("login");
                }
                else {
                	System.out.println("dao-falso");
                	Alert alert = new Alert(AlertType.WARNING, "Senha ou usuario incompativeis", ButtonType.CANCEL);
                	alert.showAndWait();

                	if (alert.getResult() == ButtonType.YES) {
                	    //do stuff
                	}
                
                }
    }
    @FXML 
    private void BtnAcaoCadastar()throws IOException {
   	App.RegUltimaTela("TelaLogin03");
       App.setRoot("TelaCadastro");
    }
 //   @FXML
 //   private void BtnAcaoCadastarProduto() throws IOException{
 //   	App.RegUltimaTela("TelaLogin03");
 //        App.setRoot("TelaCadastroProduto");
 //   }
}
