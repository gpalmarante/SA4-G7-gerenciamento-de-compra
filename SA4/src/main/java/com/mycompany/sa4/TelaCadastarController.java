/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sa4;

import ModelDAO.UsuarioDAO;
import com.mycompany.sa4.Model.Usuario;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 *
 * @author gpalmarante
 */
public class TelaCadastarController {
    @FXML
    TextField TxtCadNome;
    @FXML
    TextField TxtCadSobrenome;
    @FXML
    TextField TxtCadSexo;
    @FXML
    DatePicker TxtCadData;
    @FXML
    TextField TxtCadUsuario;
    @FXML
    TextField TxtCadSenha;
     public List<Usuario> Usuarios = new ArrayList<>(); 
       
    @FXML
    private void BtnCadCadastar() throws IOException , ClassNotFoundException, SQLException{
        //pega todos os textos dos campos e cria o novoUsuario        
        Usuario novoUsuario = new Usuario();
                     novoUsuario.setNome(TxtCadNome.getText());
                     novoUsuario.setSobreNome(TxtCadSobrenome.getText());
                     novoUsuario.setSexo(TxtCadSexo.getText());
                     novoUsuario.setUsuario(TxtCadUsuario.getText());
                     novoUsuario.setSenha(TxtCadSenha.getText());
                     novoUsuario.setDataNacimento(TxtCadData.toString());
                     
                   
                   // manda para graver no banco o novo usuario
                  UsuarioDAO dao  = new UsuarioDAO();
                  dao.create(novoUsuario);
                  App.setRoot("TelaLogin03");
    }
                  
    @FXML
    private void BtnCadApagar() throws IOException {
               TxtCadNome.setText("");
               TxtCadSobrenome.setText("");
               TxtCadSexo.setText("");
               TxtCadUsuario.setText("");
               TxtCadSenha.setText("");
    }
    @FXML
    private void BtnCadVoltar()throws IOException {
                 App.setRoot("TelaLogin03");
    }

    
}
