/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sa4;

import com.mycompany.sa4.Model.Usuario;
import java.io.IOException;
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
    private void BtnCadCadastar() throws IOException {
                  Usuario novoUsuario = new Usuario();
                     novoUsuario.setNome(TxtCadNome.getText());
                     novoUsuario.setSobreNome(TxtCadSobrenome.getText());
                     novoUsuario.setSexo(TxtCadSexo.getText());
                     novoUsuario.setUsuario(TxtCadUsuario.getText());
                     novoUsuario.setSenha(TxtCadSenha.getText());
                     novoUsuario.setDataNacimento(TxtCadData.toString());
                     
           Usuarios.add(novoUsuario);
                  System.out.println("usuario "+ Usuarios.get(0).getNome()+" Salvo com sucesso!");
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
