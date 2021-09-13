/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sa4.ModelDAO;

import com.mycompany.sa4.Banco.AcessoMysql;
import com.mycompany.sa4.Model.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gpalmarante
 */
public class ProdutoDAO {
    public void create(Produtos P ) {
        Connection con = AcessoMysql.getConnection();
        PreparedStatement stmt = null;
        
   
        try {
            stmt= con.prepareStatement("INSERT INTO produtos ( marcaProduto, modeloProduto,tipoProduto,qtdEstoque) VALUES (?,?,?,?)");
            stmt.setString(1,P.getMarca());
            stmt.setString(2,P.getModelo());
            stmt.setString(3,P.getTipo());
            stmt.setInt(4,P.getQtdStoque());
            
            
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{ 
        AcessoMysql.closeConnection(con, stmt);
        }
    }
    public List<Produtos> readall(){
    	 Connection con = AcessoMysql.getConnection();
         PreparedStatement stmt = null;
         ResultSet rs = null;
         List<Produtos> lProdutos = new ArrayList<Produtos>();
         
         try{
             stmt = con.prepareStatement("SELECT * FROM produtos;");
             rs = stmt.executeQuery();
             
             
             while(rs.next()) {
             Produtos produto = new Produtos();
             
             produto.setId(rs.getInt("idprodutos"));
             produto.setMarca(rs.getString("marcaProduto"));
             produto.setModelo(rs.getString("modeloProduto"));
             produto.setTipo(rs.getString("tipoProduto"));
             produto.setQtdStoque(rs.getInt("qtdEstoque"));           
             
             lProdutos.add(produto);
             System.out.println(lProdutos.get(0).getMarca());
             }
             }catch(SQLException ex){
                 System.out.println("erro "+ ex.getMessage());
             }finally{
            	 try {
            		 AcessoMysql.closeConnection(con, stmt, rs);
            		 System.out.println("conecção fechada");
            	 } catch (SQLException ex) {
            		 Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            	 }
             }
    	
    	return lProdutos;
    }
    public void AlterarQuantidade(int qtds , int idproduto) {
    	Connection con = AcessoMysql.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
        	stmt = con.prepareStatement("UPDATE produtos SET qtdEstoque= ? WHERE idprodutos = ?;");
        	stmt.setInt(1,qtds);
        	stmt.setInt(2,idproduto);
        	//  System.out.println(qtds);
            //	System.out.println(idproduto);
        	
        	stmt.executeUpdate();
             	      	
        	
        }catch(SQLException ex){
            System.out.println("erro "+ ex.getMessage());
        }finally{
       	 try {
       		 AcessoMysql.closeConnection(con, stmt, rs);
       		 System.out.println("conecção fechada");
       	 } catch (SQLException ex) {
       		 Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
       	 }
        }
    }
    public void ExcluirProduto(int idproduto) {
    	Connection con = AcessoMysql.getConnection();
        PreparedStatement stmt = null;
        try{
        	stmt = con.prepareStatement("DELETE FROM produtos WHERE idprodutos = ?");
        	stmt.setInt(1,idproduto);
        	
        	
        	stmt.executeUpdate();
             	      	
        	
        }catch(SQLException ex){
            System.out.println("erro "+ ex.getMessage());
        }finally{
       	 AcessoMysql.closeConnection(con, stmt);
		 System.out.println("conecção fechada");
        }
    }
}
