/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author mateo
 */
public class ClsSillas implements Serializable{
    String numerovuelo;
    String numeropuesto;
    boolean ocupado;

    public ClsSillas(String numerovuelo, String numeropuesto, boolean ocupado) {
        this.numerovuelo = numerovuelo;
        this.numeropuesto = numeropuesto;
        this.ocupado = ocupado;
    }

    public String getNumerovuelo() {
        return numerovuelo;
    }

    public void setNumerovuelo(String numerovuelo) {
        this.numerovuelo = numerovuelo;
    }

    public String getNumeropuesto() {
        return numeropuesto;
    }

    public void setNumeropuesto(String numeropuesto) {
        this.numeropuesto = numeropuesto;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    

   

  

    
}   