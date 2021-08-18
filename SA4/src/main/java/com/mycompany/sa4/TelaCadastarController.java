/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sa4;

import com.mycompany.sa4.ModelDAO.UsuarioDAO;
import com.mycompany.sa4.Enums.UsuarioGenero;
import com.mycompany.sa4.Model.Usuario;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 *
 * @author gpalmarante
 */
public class TelaCadastarController implements Initializable {
   
	@FXML
    TextField TxtCadNome,TxtCadSobrenome,TxtCadUsuario,TxtCadSenha;
    @FXML
    private ChoiceBox<UsuarioGenero> TxtCadSexo;
   
    @FXML
    DatePicker TxtCadData;
        
         
    @FXML
    private void BtnCadCadastar() throws IOException , ClassNotFoundException, SQLException{
        //pega todos os textos dos campos e cria o novoUsuario        
    	
        Usuario novoUsuario = new Usuario();
                     novoUsuario.setNome(TxtCadNome.getText());
                     novoUsuario.setSobreNome(TxtCadSobrenome.getText());
                     novoUsuario.setSexo( TxtCadSexo.getValue());
                     novoUsuario.setUsuario(TxtCadUsuario.getText());
                     novoUsuario.setSenha(TxtCadSenha.getText());
                     novoUsuario.setDataNacimento(TxtCadData.getValue().toString());
                     
                   
                   // manda para graver no banco o novo usuario
        UsuarioDAO dao  = new com.mycompany.sa4.ModelDAO.UsuarioDAO();
        dao.create(novoUsuario);
        App.setRoot("TelaLogin03");
    }
                  
    @FXML
    private void BtnCadApagar() throws IOException {
               TxtCadNome.setText("");
               TxtCadSobrenome.setText("");
      
               TxtCadUsuario.setText("");
               TxtCadSenha.setText("");
    }
    @FXML
    private void BtnCadVoltar()throws IOException {
                 App.setRoot("TelaLogin03");
    }


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
    	TxtCadSexo.getItems().addAll(UsuarioGenero.values());
    	
	}

    
}
