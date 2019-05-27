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

    String numeropuesto;
    boolean ocupado;
    

    public ClsSillas(String numeropuesto, boolean ocupado) {
        this.numeropuesto = numeropuesto;
        this.ocupado = ocupado;
        
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