/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ClsVuelo;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mateo
 */
public class CtVuelo {
    
    public DefaultTableModel listarElementos(ArrayList<ClsVuelo> listaVuelos){
       DefaultTableModel modelo;
       String nombreColumnas [] = {"Numero vuelo", "Fecha", "Origen", "Destino", "Estado"};
       modelo = new DefaultTableModel(new Object[][]{}, nombreColumnas);
       
       try{
          
           for (int i = 0; i < listaVuelos.size(); i++) {
               
               modelo.addRow(new Object[]{listaVuelos.get(i).getNumeroVuelo(),listaVuelos.get(i).getFecha(),listaVuelos.get(i).getOrigen(),listaVuelos.get(i).getDestino(),listaVuelos.get(i).getEstado()});
               
           }
       
       }catch(Exception e){
           System.out.println(e.toString());
       }
   
        return modelo;
    }
}
