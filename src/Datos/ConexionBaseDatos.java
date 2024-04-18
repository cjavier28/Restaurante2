/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelo.ParametrosConfig;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author cjavi
 */
public class ConexionBaseDatos {
    private  String jdbcURL = "";
    private  String jdbcUsername = "";
    private  String jdbcPassword = "";
    private ParametrosConfig params = new ParametrosConfig();
    
     public Connection getConnection() {
        Connection connection = null;
        try {            
         ObtenerParametrosConfig config = new  ObtenerParametrosConfig();
        params = config.ObtenerParametrosConfig();
        Class.forName("com.mysql.cj.jdbc.Driver");
            
            jdbcURL = params.getCadenaConexionMysql();
            jdbcUsername = params.getUsuario();
            jdbcPassword = params.getPassword();            
            
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
            
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }    
}
