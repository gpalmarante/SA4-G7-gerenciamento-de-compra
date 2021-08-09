package ModelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mycompany.sa4.ConnectorBase.ConnectionFactory;
import com.mycompany.sa4.Model.Usuario;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;

public class UsuarioDAO {
    public void create(Usuario U ) throws ClassNotFoundException, SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        stmt= con.prepareStatement("INSERT INTO usuario ( nome, sobrenome) VALUES (?,?)");
        stmt.setString(1,U.getNome());
        stmt.setString(2,U.getSobreNome());

        stmt.executeUpdate();
        ConnectionFactory.closeConnection(con, stmt);
            
       // Alert alert = new Alert(AlertType.INFORMATION);
       //     alert.setTitle("Message Here...");
       //     alert.setHeaderText("Look, an Information Dialog");
        //    alert.setContentText("Usuario salvo");
        //    alert.showAndWait().ifPresent(rs -> {
        //        if (rs == ButtonType.OK) {
        //            System.out.println("Pressed OK.");
        //        }
        //    });
    }
}