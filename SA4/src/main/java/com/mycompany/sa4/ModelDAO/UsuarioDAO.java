
package com.mycompany.sa4.ModelDAO;

import com.mycompany.sa4.App;
import com.mycompany.sa4.Banco.AcessoMysql;
import com.mycompany.sa4.Model.Login;
import com.mycompany.sa4.Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UsuarioDAO {
    public void create(Usuario U ) {
        Connection con = AcessoMysql.getConnection();
        PreparedStatement stmt = null;
   
        try {
            stmt= con.prepareStatement("INSERT INTO usuarios ( nome, sobrenome,sexo,data,usuario,senha) VALUES (?,?,?,?,?,?)");
            stmt.setString(1,U.getNome());
            stmt.setString(2,U.getSobreNome());
            stmt.setString(3,U.getSexo().toString());
            stmt.setString(4,U.getDataNacimento());
            stmt.setString(5,U.getUsuario());
            stmt.setString(6,U.getSenha());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{ 
        AcessoMysql.closeConnection(con, stmt);
        }
    }
      public Boolean verifcaLogin(Login L) {
        //System.out.println(L.getUsuario()+"verificaLogin");
        Connection con = AcessoMysql.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
       
        Usuario UsVerifica = new Usuario();
       
        
        try{
            stmt = con.prepareStatement("SELECT usuario, senha,nome FROM usuarios WHERE usuario = ?;");
            stmt.setString(1,L.getUsuario());
            rs = stmt.executeQuery();
        
            if(rs!= null && rs.next()) {
            	System.out.println(rs.getString("usuario")+"depois do query1");
            	UsVerifica.setUsuario(rs.getString("usuario"));
            	UsVerifica.setSenha(rs.getString("senha"));
            	UsVerifica.setNome(rs.getString("nome"));
            	
            	System.out.println(UsVerifica.getSenha()+"depois do query2");
            }
            }
        catch(SQLException ex){
                     System.out.println("erro "+ ex.getMessage());
            }
        finally{
            try {
                AcessoMysql.closeConnection(con, stmt, rs);
                System.out.println("conecção fechada");
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(L.getUsuario());
        		System.out.println(UsVerifica.getUsuario());
        				System.out.println(L.getSenha());
        						System.out.println(UsVerifica.getSenha());
           String LN =L.getUsuario();
           String LS =L.getSenha();
           String VN=UsVerifica.getUsuario();
           String VS=UsVerifica.getSenha();
        		
     //   if (((L.getUsuario()).equals == (UsVerifica.getUsuario())) && ((L.getSenha()) == (UsVerifica.getSenha()))){
           if ( LN.equals(VN) && LS.equals(VS)) {
        	 System.out.println("resultado verdadeiro");
        	 App.RegNome(UsVerifica.getNome());
        	 System.out.println(UsVerifica.getNome());
        	return true;
            }else{
            	System.out.println("resultado falso");
                return false;
            }
      }
}
        
      
