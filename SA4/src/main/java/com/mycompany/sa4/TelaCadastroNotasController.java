package com.mycompany.sa4;

import java.io.IOException;
import javafx.fxml.FXML;

public class TelaCadastroNotasController {
	
	
	@FXML
	private void BtnCadNotAdcionaPro() throws IOException {
   	 
   	 App.setRoot(App.reg.getUltimaTela());
   	 
    }
	
	@FXML
	private void BtnCadNotCadastar() throws IOException {
   	 
   	 App.setRoot(App.reg.getUltimaTela());
   	 
    }
	
	@FXML
	private void BtnCadNotLimpar() throws IOException {
   	 
   	 App.setRoot(App.reg.getUltimaTela());
   	 
    }
	@FXML
	private void BtnCadNotVoltar() throws IOException {
    	 
    	 App.setRoot(App.reg.getUltimaTela());
    	 
     }
	
}
