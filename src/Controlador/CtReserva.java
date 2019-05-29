/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ClsPromocion;
import java.util.ArrayList;

/**
 *
 * @author mateo
 */
public class CtReserva {

    public double pesoequipaje(ArrayList<ClsPromocion>listapromocion,String nombrepromocion,int pasajeros) {
     double valor=0;
     for(int i=0;i<listapromocion.size();i++){
         
     }
    }

    public double pagototal(double valorsilla, double seguros, double checkins, double valorpromocion) {
        double iva = 0.19;
        double valor = valorsilla + seguros + checkins + valorpromocion;
        double impuesto = valor * 0.19;
        double valortotal = valor + impuesto;

        return valortotal;
    }

    public double seguro(String seguro) {
        double valor = 0;
        if (seguro.equals("Si")) {
            valor = 10000;
        } else {
            if (seguro.equals("No")) {
                valor = 0;
            }
        }
        return valor;
    }

    public double checkin(String checkin) {
        double valor = 0;
        if (checkin.equals("Si")) {
            valor = 10000;
        } else {
            if (checkin.equals("No")) {
                valor = 0;
            }
        }
        return valor;
    }

    public double valorsillaeconomica(ArrayList<String> silla) {
        double valor = 0;
        String caracter = null;
        String ultimo = null;
        for (int i = 0; i < silla.size(); i++) {
            for (int j = 0; j < 6; j++) {
                caracter = silla.get(i);
                ultimo = caracter.substring(caracter.length() - 1);
                if (caracter.equals("A" + j) || caracter.equals("B" + j) || caracter.equals("C" + j)) {
                    if (ultimo.equals("1") || ultimo.equals("3") || ultimo.equals("4") || ultimo.equals("6")) {
                        valor += 9000;
                    } else {
                        if (ultimo.equals("2") || ultimo.equals("5")) {
                            valor += 8500;
                        }
                    }
                }
            }
        }
        return valor;
    }

    public double valorsillaintermedio(ArrayList<String> silla) {
        double valor = 0;
        String caracter = null;
        String ultimo = null;
        for (int i = 0; i < silla.size(); i++) {
            for (int j = 0; j < 6; j++) {
                caracter = silla.get(i);
                ultimo = caracter.substring(caracter.length() - 1);
                if (caracter.equals("D" + j) || caracter.equals("E" + j) || caracter.equals("F" + j)) {
                    if (ultimo.equals("1") || ultimo.equals("3") || ultimo.equals("4") || ultimo.equals("6")) {
                        valor += 9500;
                    } else {
                        if (ultimo.equals("2") || ultimo.equals("5")) {
                            valor += 9000;
                        }
                    }
                }
            }
        }
        return valor;
    }

    public double valorsillaeconomicavip(ArrayList<String> silla) {
        double valor = 0;
        String caracter = null;
        String ultimo = null;
        for (int i = 0; i < silla.size(); i++) {
            for (int j = 0; j < 6; j++) {
                caracter = silla.get(i);
                ultimo = caracter.substring(caracter.length() - 1);
                if (caracter.equals("G" + j) || caracter.equals("H" + j) || caracter.equals("I" + j) || caracter.equals("J" + j)) {
                    if (ultimo.equals("1") || ultimo.equals("3") || ultimo.equals("4") || ultimo.equals("6")) {
                        valor += 10000;
                    } else {
                        if (ultimo.equals("2") || ultimo.equals("5")) {
                            valor += 9500;
                        }
                    }
                }
            }
        }
        return valor;
    }

}
