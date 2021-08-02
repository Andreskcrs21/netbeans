/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import comoconectar.ComoConectar;
import java.sql.SQLException;
import java.sql.*;
import modelo.persona;

/**
 *
 * @author IdeaPad - S340
 */
public class controlador {
    public boolean registrarPersona(persona persona){
    
        boolean registrar = false;
        
        Statement stm = null;
        
        Connection con = null;
        String sql = "insert into integrantes( Nombres, Apellidos) values ('"+persona.getNombres()+"','"+persona.getApellidos()+"')";
        

       
        try {
            ComoConectar  conexion = new ComoConectar();
            con = conexion.getConexion();
            stm = (Statement) con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: "+ e);
        }
        return registrar;
    
        
    }
}
