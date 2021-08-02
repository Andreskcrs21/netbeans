/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comoconectar;


import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.Connection;

/**
 *
 * @author IdeaPad - S340
 */
public class ComoConectar {
    private final String base = "familia";
    private final String user = "root";
    private final String password = "chateo282";
    private final String url = "jdbc:mysql://Localhost:3306/" + base;
    PreparedStatement ps;

    public Connection getConexion() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, password);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
            System.out.println("Conexion Establecida");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexion");
        } catch (SQLException ex) {
            
        }
        return con;
    }

    public static void main(String[] args) {
        ComoConectar cc = new ComoConectar();
        cc.getConexion();
        
    }
    
}
