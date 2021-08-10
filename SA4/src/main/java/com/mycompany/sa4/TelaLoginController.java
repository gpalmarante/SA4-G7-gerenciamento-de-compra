/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sa4;

import ModelDAO.UsuarioDAO;
import com.mycompany.sa4.Model.Login;
import com.mycompany.sa4.Model.Usuario;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;
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
         System.out.println("botao logar");
                Login login = new Login();
                login.setUsuario(TxtLogin.getText());
                login.setSenha(TxtSenha.getText());
               System.out.println(login.getUsuario());
                UsuarioDAO dao  = new UsuarioDAO();
                
                if (dao.verifcaLogin(login)!= null){
                    App.setRoot("TelaProdutos");
                    Logger.getLogger("erro na invalido");
                }
                else {
                 Logger.getLogger("erro na verificação");
                }
    }
    @FXML 
    private void BtnAcaoCadastar()throws IOException {
        App.setRoot("TelaCadastro");
    }
    @FXML
    private void BtnAcaoCadastarProduto() throws IOException{
         App.setRoot("TelaCadastroProduto");
    }
}
