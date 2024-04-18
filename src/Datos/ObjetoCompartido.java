/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
import java.util.Date;
import java.util.List;
import java.util.List;
import Negocio.ServicioConsulta;
import java.util.List;
import Datos.Reserva;
import java.util.ArrayList;
import Datos.ObjetoCompartido; 
/**
 *
 * @author cjavi
 */
public class ObjetoCompartido {
   
    private static ObjetoCompartido instance;
    private List<Reserva> sharedVariable ;

    public ObjetoCompartido() {}

    public static ObjetoCompartido getInstance() {
        if (instance == null) {
            instance = new ObjetoCompartido();
        }
        return instance;
    }

    public List<Reserva> getSharedVariable() {
        return sharedVariable;
    }

    public void setSharedVariable(List<Reserva>  value) {
        sharedVariable = value;
    }
}
