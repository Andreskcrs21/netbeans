/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author IdeaPad - S340
 */
public class persona {
    int idintegrantes;
    String Nombres;
    String Apellidos;

    public persona(int idintegrantes, String Nombres, String Apellidos) {
        this.idintegrantes = idintegrantes;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
    }
    public persona(){}

    public int getIdintegrantes() {
        return idintegrantes;
    }

    public void setIdintegrantes(int idintegrantes) {
        this.idintegrantes = idintegrantes;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    @Override
    public String toString() {
        return "persona{" + "idintegrantes=" + idintegrantes + ", Nombres=" + Nombres + ", Apellidos=" + Apellidos + '}';
    }
    
    
}
