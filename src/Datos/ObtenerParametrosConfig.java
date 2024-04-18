/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelo.ParametrosConfig;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author cjavi
 */
public class ObtenerParametrosConfig {
    
        public ParametrosConfig ObtenerParametrosConfig(){
           ParametrosConfig param = new ParametrosConfig();
              try {
                 
                  Properties prop = new Properties();
                  prop.load(new FileInputStream("src/Recursos/config.properties"));
    
                  param.setCadenaConexionMysql( prop.getProperty("cadenaconexionmysql"));  
                  param.setUsuario(prop.getProperty("usuario")); 
                  param.setPassword(prop.getProperty("password")); 
                  return param;

              } catch (FileNotFoundException ex) {
                 JOptionPane.showMessageDialog(null, ex.toString());
                   return param;
              } catch (IOException ex) {
                
                   return param;
              }
    }
    
    
    
}
