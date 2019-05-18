/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author mateo
 */
public class ClsSillas {

    String numeropuesto;
    boolean ocupado;
    String categoria;

    public ClsSillas(String numeropuesto, boolean ocupado, String categoria) {
        this.numeropuesto = numeropuesto;
        this.ocupado = ocupado;
        this.categoria = categoria;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
}   