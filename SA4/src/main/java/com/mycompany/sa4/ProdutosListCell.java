package com.mycompany.sa4;

import java.io.IOException;

import com.mycompany.sa4.Model.Produtos;
import com.mycompany.sa4.ModelDAO.ProdutoDAO;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;


public class ProdutosListCell extends ListCell<Produtos> {

    @FXML
    private Label TxtListTipo,TxtListMarca,TxtListEstoque,TxtListModelo;

    @FXML
    TextField  TxtListQtdSaida,TxtListQtdEntrada;
    
    @FXML
    private AnchorPane ListaProdutos;
  
    private FXMLLoader mLLoader;
    
    private Produtos Prod;
    @Override
    protected void updateItem(Produtos produtos, boolean empty) {
        super.updateItem(produtos, empty);

        if(empty || produtos == null) {

            setText(null);
            setGraphic(null);

        } else {
            if (mLLoader == null) {
                mLLoader = new FXMLLoader(getClass().getResource("TelaListaEstoque.fxml"));
                mLLoader.setController(this);

                try {
                    mLLoader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            Prod = produtos;
            TxtListTipo.setText(produtos.getTipo());
            TxtListMarca.setText(produtos.getMarca());
            TxtListModelo.setText(produtos.getModelo());
            TxtListEstoque.setText(String.valueOf(produtos.getQtdStoque()));
            setText(null);
            setGraphic(ListaProdutos);
        }

    }
  
    @FXML 
    private void BtnListRetirada() {
    	int qtd = Integer.parseInt(TxtListQtdSaida.getText());
    	
    	
    	if(Prod.getQtdStoque()>= qtd ) {
    		
    	 int qtdFinal = Prod.getQtdStoque() - qtd;
    	 int id = Prod.getId();
    	 ProdutoDAO dao  = new ProdutoDAO();
    	 dao.AlterarQuantidade(qtdFinal, id);
    	 TxtListEstoque.setText(String.valueOf(qtdFinal));
    	 Prod.setQtdStoque(qtdFinal);
    	}else {
    		Alert alert = new Alert(AlertType.WARNING, "Sem estoque disponivel para essa quantidade", ButtonType.CANCEL);
        	alert.showAndWait();
        	//if (alert.getResult() == ButtonType.YES) {
        	    //do stuff
            //	}
    	}
    }
    @FXML 
    private void BtnListEntrada() { 
    	
    	int qtd = Integer.parseInt(TxtListQtdEntrada.getText());
    	int id = Prod.getId();
    	
    	ProdutoDAO dao  = new ProdutoDAO();
    	int qtdFinal = Prod.getQtdStoque() + qtd;
   	 	dao.AlterarQuantidade(qtdFinal, id);
   	 	TxtListEstoque.setText(String.valueOf(qtdFinal));
   	 	Prod.setQtdStoque(qtdFinal);
    	
    }
    	 
    
	@FXML
    private void BtnListExcluir() throws IOException {
		int id = Prod.getId();
		ProdutoDAO dao  = new ProdutoDAO();
		dao.ExcluirProduto(id);
		App.setRoot("TelaProdutos");
	}
}
