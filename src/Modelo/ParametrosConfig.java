/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author cjavi
 */
public class ParametrosConfig {

    public String getCadenaConexionMysql() {
     return cadenaConexionMysql;
    }

    public void setCadenaConexionMysql(String cadenaConexionMysql) {
        this.cadenaConexionMysql = cadenaConexionMysql;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    String cadenaConexionMysql;
    String usuario;
    String password;
    
}
