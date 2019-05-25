/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author Javier Parra
 */
public class ClsAvion  implements Serializable{
    
 String serial;
 int capacidad;
 String codigoPiloto;
 String codigoPrimeraazafata;
 String codigoSegundaazafata;

    public ClsAvion(String serial, int capacidad, String codigoPiloto, String codigoPrimeraazafata, String codigoSegundaazafata) {
        this.serial = serial;
        this.capacidad = capacidad;
        this.codigoPiloto = codigoPiloto;
        this.codigoPrimeraazafata = codigoPrimeraazafata;
        this.codigoSegundaazafata = codigoSegundaazafata;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getCodigoPiloto() {
        return codigoPiloto;
    }

    public void setCodigoPiloto(String codigoPiloto) {
        this.codigoPiloto = codigoPiloto;
    }

    public String getCodigoPrimeraazafata() {
        return codigoPrimeraazafata;
    }

    public void setCodigoPrimeraazafata(String codigoPrimeraazafata) {
        this.codigoPrimeraazafata = codigoPrimeraazafata;
    }

    public String getCodigoSegundaazafata() {
        return codigoSegundaazafata;
    }

    public void setCodigoSegundaazafata(String codigoSegundaazafata) {
        this.codigoSegundaazafata = codigoSegundaazafata;
    }
 
}
