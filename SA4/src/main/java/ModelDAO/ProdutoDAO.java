/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import com.mycompany.sa4.Banco.AcessoMysql;
import com.mycompany.sa4.Model.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
            stmt= con.prepareStatement("INSERT INTO produtos ( marca, modelo,tipo,quantidade) VALUES (?,?,?,?)");
            stmt.setString(1,P.getMarca());
            stmt.setString(2,P.getModelo());
            stmt.setString(3,P.getTipo());
            stmt.setString(4,P.getQtdComprada());
            
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{ 
        AcessoMysql.closeConnection(con, stmt);
        }
    }
}
