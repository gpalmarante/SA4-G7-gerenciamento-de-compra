/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sa4.Banco;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class  AcessoMysql {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL ="jdbc:mysql://localhost:3306/dbestoque";
    private static final String USER = "root";
    private static final String PASS = "root1234";

    public static Connection getConnection() {
        
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);

        } catch (ClassNotFoundException | SQLException ex) {
                      
            throw new RuntimeException("erro na conecção drive", ex);

        }
                
        
    }
    public static void closeConnection(Connection con) {
        
            try {
                if (con != null){
                    con.close();}
            } catch (SQLException e) {
                    throw new RuntimeException("erro na conecção", e);
            }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        closeConnection(con);
            
                try {
                    if(stmt != null){
                    stmt.close();}
                } catch (SQLException e) {
                    throw new RuntimeException("erro na conecção", e);
            }
        }
    
    
    public static void closeConnection(Connection con, PreparedStatement stmt,ResultSet rs ) throws SQLException{
        closeConnection(con,stmt);
        try {
            if(rs != null){
            rs.close();}
        } catch (SQLException e) {
            throw new RuntimeException("erro na conecção", e);
    }
}
}