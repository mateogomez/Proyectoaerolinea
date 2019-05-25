/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ClsVuelo;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mateo
 */
public class CtVuelo {

    public DefaultTableModel listarElementosida(ArrayList<ClsVuelo> listaVuelos) {
        DefaultTableModel modelo;
        String nombreColumnas[] = {"Numero vuelo", "Fecha", "Origen", "Destino", "Hora salida", "Hora llegada", "Estado"};
        modelo = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        try {

            for (int i = 0; i < listaVuelos.size(); i++) {
                if (listaVuelos.get(i).getTipovuelo().equals("Ida")) {
                    modelo.addRow(new Object[]{listaVuelos.get(i).getNumeroVuelo(), listaVuelos.get(i).getFecha(), listaVuelos.get(i).getOrigen(), listaVuelos.get(i).getDestino(), listaVuelos.get(i).getHoraSalida(), listaVuelos.get(i).getHoraLlegada(), listaVuelos.get(i).getEstado()});
                }
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return modelo;
    }

    public DefaultTableModel listarElementosregreso(ArrayList<ClsVuelo> listaVuelos) {
        DefaultTableModel modelo;
        String nombreColumnas[] = {"Numero vuelo", "Fecha", "Origen", "Destino", "Hora salida", "Hora llegada", "Estado"};
        modelo = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        try {

            for (int i = 0; i < listaVuelos.size(); i++) {
                if (listaVuelos.get(i).getTipovuelo().equals("Vuelta")) {
                    modelo.addRow(new Object[]{listaVuelos.get(i).getNumeroVuelo(), listaVuelos.get(i).getFecha(), listaVuelos.get(i).getOrigen(), listaVuelos.get(i).getDestino(), listaVuelos.get(i).getHoraSalida(), listaVuelos.get(i).getHoraLlegada(), listaVuelos.get(i).getEstado()});
                }
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return modelo;
    }

    public String buscarvueloida(String ida, Date ingresoida, Date fechaida) {
        String desicion = "";

        if (ingresoida.equals(fechaida) && ida.equals("Ida")) {
            desicion = "existe";
        }
        return desicion;
    }

    public String buscarvueloregreso(String regreso, Date ingresoida, Date fechaida) {
        String desicion = "";
        if (ingresoida.equals(fechaida) && regreso.equals("Vuelta")) {
            desicion = "existe";
        }
        return desicion;
    }

}
