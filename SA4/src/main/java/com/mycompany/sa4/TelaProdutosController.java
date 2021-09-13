/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sa4;
import java.io.IOException;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Alert.AlertType;
import com.mycompany.sa4.ModelDAO.ProdutoDAO;
import com.mycompany.sa4.Model.Produtos;

/**
 *
 * @author gpalmarante
 */
public class TelaProdutosController  extends App  implements Initializable  {
    
    
    @FXML 
    private ListView<Produtos> listViewProdutos; 
    @FXML
    private Label TxtProNome;
   
    private ObservableList<Produtos> ProdutosObservableList;
    
    
    public TelaProdutosController() {
    	 System.out.println("tela Produtos 01");
    	 System.out.println(reg.getNome()+"nome produtos 1");
    	 
    	 //String nome = reg.getNome();
    	
    	 
    	 
    	ProdutoDAO LproDAO = new ProdutoDAO();
    	List<Produtos> LP = new ArrayList<>();
    	ProdutosObservableList = FXCollections.observableArrayList();
    	
    	for(Produtos p:  LproDAO.readall() ) {
    	
    		LP.add(p);
    		ProdutosObservableList.addAll(p);
    	}
    	
    	
    	
    	//ProdutosObservableList.addAll();
    		
    		// p.getMarca();
    		// p.getModelo();
    		// p.getTipo();
    		// p.getQtdComprada();
    	//System.out.println(ProdutosObservableList.get(0).getMarca()+"teste do obs");
    }
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	System.out.println("tela Produtos 02");
        listViewProdutos.setItems(ProdutosObservableList);
        listViewProdutos.setCellFactory(produtoCell -> new ProdutosListCell());
        TxtProNome.setText(reg.getNome());
      
    }
    @FXML
     private void BtnProCadastarProdutos() throws IOException {
    	App.RegUltimaTela("TelaProdutos");
    	
    	App.setRoot("TelaCadastroProduto");
    	
    }
    @FXML
    private void BtnProCadastarNotas() throws IOException {
  
    	 
    	 App.RegUltimaTela("TelaProdutos");
    	 App.setRoot("TelaCadastroNotas");
   	
   }
    @FXML
    private void BtnProListar() throws IOException {
                  
    }
    @FXML
    private void BtnProSair() throws IOException {
    	Alert alert = new Alert(AlertType.WARNING, "Desejar fechar?", ButtonType.YES,ButtonType.CANCEL);
    	alert.showAndWait();

    	if (alert.getResult() == ButtonType.YES) {
    		System.exit(0);
    	}
    }
    @FXML
    private void BtnProLogoff() throws IOException {
                  App.setRoot(App.reg.getUltimaTela());
    }
      
    
    
}
