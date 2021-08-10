
package ModelDAO;

import com.mycompany.sa4.Banco.AcessoMysql;
import com.mycompany.sa4.Model.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mycompany.sa4.Model.Usuario;
import java.sql.ResultSet;
import java.util.List;
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
            stmt.setString(3,U.getSexo());
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
      public Boolean verifcaLogin(Login L ) {
        //System.out.println(L.getUsuario()+"verificaLogin");
        Connection con = AcessoMysql.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
       
        Usuario UsVerifica = new Usuario();
       // System.out.println("antes try");
        try{
            stmt = con.prepareStatement("SELECT usuario, senha FROM usuarios WHERE usuario = '?';");
            stmt.setString(1,L.getUsuario());
            rs = stmt.executeQuery();
            
          // System.out.println(rs.getString("usuario")+"depois do query1");
            UsVerifica.setUsuario(rs.getString("usuario"));
            UsVerifica.setSenha(rs.getString("senha"));
            //System.out.println(UsVerifica.getSenha()+"depois do query2");
            
            }
        catch(SQLException ex){
                     System.out.println("erro na verificação");
            }
        finally{
            try {
                AcessoMysql.closeConnection(con, stmt, rs);
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
           
        if ((L.getUsuario() == UsVerifica.getUsuario()) && (L.getSenha()== UsVerifica.getSenha())){
                return true;
            }else{
                
                return false;
            }
      }
}
        
      
