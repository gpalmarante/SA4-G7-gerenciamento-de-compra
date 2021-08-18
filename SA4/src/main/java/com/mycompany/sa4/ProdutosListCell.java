package com.mycompany.sa4;

import java.io.IOException;

import com.mycompany.sa4.Model.Produtos;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.AnchorPane;


public class ProdutosListCell extends ListCell<Produtos> {

    @FXML
    private Label TxtListTipo,TxtListMarca,TxtListEstoque,TxtListModelo;

    @FXML
    private AnchorPane ListaProdutos;
  
    private FXMLLoader mLLoader;
    
    
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

            TxtListTipo.setText(produtos.getTipo());
            TxtListMarca.setText(produtos.getMarca());
            TxtListModelo.setText(produtos.getModelo());

            setText(null);
            setGraphic(ListaProdutos);
        }

    }
    @FXML 
    private void BtnListEntrada() {}
    @FXML 
    private void BtnListRetirada() {}

}
