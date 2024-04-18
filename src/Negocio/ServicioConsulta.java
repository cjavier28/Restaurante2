/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;
import Datos.ConexionBaseDatos;
import Datos.ObtenerParametrosConfig;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Datos.Reserva;
import Modelo.ParametrosConfig;
import java.util.ArrayList;
import java.util.List;



public class ServicioConsulta {
    
  
    private static final String SELECT_RESTAURANT = "SELECT codigo, numero_documento_cliente, nombre_cliente, numero_contacto_cliente, correo_cliente, fecha_reserva, estado_reserva, cantidad_personas FROM reservas ";
    private static final String INSERT_RESTAURANT = "INSERT INTO reservas (numero_documento_cliente, nombre_cliente, numero_contacto_cliente, correo_cliente, fecha_reserva, estado_reserva, cantidad_personas) VALUES (?, ?, ?, ?, ?, ?, ?); ";  
    private static final String UPDATE_RESERVA = "UPDATE reservas SET numero_documento_cliente = ?, nombre_cliente = ?, numero_contacto_cliente = ?, correo_cliente = ?, fecha_reserva = ?, estado_reserva = ?, cantidad_personas = ? WHERE codigo = ?";
       
       
   public List<Reserva> ObtenerRegistrosRestaurante() {
        ConexionBaseDatos con = new ConexionBaseDatos();
        List<Reserva> lstReservas = new ArrayList<>();           
        try (Connection connection = con.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_RESTAURANT)) {
             ResultSet rs = preparedStatement.executeQuery();         
  
            while (rs.next()) {              
                Reserva reserva = new Reserva();
                reserva.setCodigo(rs.getInt("codigo"));
                reserva.setNumeroDocumentoCliente( rs.getString("numero_documento_cliente")); 
                reserva.setNombreCliente(rs.getString("nombre_cliente"));  
                reserva.setCorreoCliente(rs.getString("correo_cliente"));
                reserva.setNumeroContactoCliente(rs.getString("numero_contacto_cliente"));
                reserva.setFechaReserva(rs.getDate("fecha_reserva"));
                reserva.setEstadoReserva(rs.getString("estado_reserva"));
                reserva.setCantidadPersonas(rs.getInt("cantidad_personas"));
                lstReservas.add(reserva);                
            }            
            
         return lstReservas;
        } catch (SQLException e) {
               e.printStackTrace();
              return lstReservas;         
        }
   
    }
       
   public  boolean InsertarReserva(Reserva reserva){
         ConexionBaseDatos con = new ConexionBaseDatos();
         boolean insertExitoso = false;

          try (Connection connection = con.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_RESTAURANT)) {
                   
  
              // Establecer los valores de los parámetros
           
                preparedStatement.setString(1,reserva.getNumeroDocumentoCliente() );
                preparedStatement.setString(2, reserva.getNombreCliente());
                preparedStatement.setString(3, reserva.getNumeroContactoCliente());
                preparedStatement.setString(4, reserva.getCorreoCliente());
                preparedStatement.setDate(5, reserva.getFechaReserva());
                preparedStatement.setString(6, reserva.getEstadoReserva());
                preparedStatement.setInt(7, reserva.getCantidadPersonas());
                int filasAfectadas = preparedStatement.executeUpdate();
                if (filasAfectadas > 0) {
                    insertExitoso = true;
                }
         return insertExitoso;
        } catch (SQLException e) {
               e.printStackTrace();
              return insertExitoso;         
        }      
   }    
     
     public boolean actualizarReserva(Reserva reserva) {
            ConexionBaseDatos con = new ConexionBaseDatos();
            boolean actualizacionExitosa = false;

            try (Connection connection = con.getConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_RESERVA)) {

                // Establecer los valores de los parámetros
                preparedStatement.setString(1, reserva.getNumeroDocumentoCliente());
                preparedStatement.setString(2, reserva.getNombreCliente());
                preparedStatement.setString(3, reserva.getNumeroContactoCliente());
                preparedStatement.setString(4, reserva.getCorreoCliente());
                preparedStatement.setDate(5, reserva.getFechaReserva());
                preparedStatement.setString(6, reserva.getEstadoReserva());
                preparedStatement.setInt(7, reserva.getCantidadPersonas());
                preparedStatement.setInt(8, reserva.getCodigo()); // Aquí se establece el código de la reserva para la condición WHERE

                // Ejecutar la actualización
                int filasAfectadas = preparedStatement.executeUpdate();
                if (filasAfectadas > 0) {
                    actualizacionExitosa = true;
                }

                return actualizacionExitosa;
            } catch (SQLException e) {
                e.printStackTrace();
                return actualizacionExitosa;
            }
        }
     
     
   }    
     
     
     
     

