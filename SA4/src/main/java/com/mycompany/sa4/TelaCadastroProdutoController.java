/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sa4;

import ModelDAO.ProdutoDAO;
import ModelDAO.UsuarioDAO;
import com.mycompany.sa4.Model.Produtos;
import com.mycompany.sa4.Model.Usuario;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 *
 * @author gpalmarante
 */
public class TelaCadastroProdutoController {
    @FXML
    TextField TxtProdModelo,TxtProdMarca,TxtProdTipo,TxtProdQtd;
    
     @FXML
     private void BtnProdSalvar() throws IOException {
          Produtos novoProduto = new Produtos();
                   novoProduto.setModelo(TxtProdModelo.getText());
                   novoProduto.setMarca(TxtProdMarca.getText());
                   novoProduto.setTipo(TxtProdTipo.getText());
                   novoProduto.setQtdComprada(TxtProdQtd.getText());
                    
                     
                   
                   // manda para graver no banco o novo usuario
                  ProdutoDAO dao  = new ProdutoDAO();
                  dao.create(novoProduto);
                  App.setRoot("TelaLogin03");
              
         
     }
}
