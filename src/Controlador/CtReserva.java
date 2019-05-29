/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ClsPromocion;
import Modelo.ClsReserva;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mateo
 */
public class CtReserva {

    public ArrayList<ClsReserva> registrarreserva(ArrayList<ClsReserva> listareserva, String tipoVuelo, String numerovuelo, String fecha, String[] pasajero, String promocion, double pesoEquipaje, String seguro, String checkin, double valorTotal, String idReserva, String estadoPago, String numeroSilla,String cedulacliente) {
        
        try {
            if (listareserva.isEmpty()) {
                ClsReserva reserva = new ClsReserva(tipoVuelo, numerovuelo, fecha, pasajero, promocion, pesoEquipaje, seguro, checkin, valorTotal, idReserva, estadoPago, numeroSilla,cedulacliente);
                listareserva.add(reserva);
                JOptionPane.showMessageDialog(null, "reserva registrada");
            } else {
                for (int i = 0; i < listareserva.size(); i++) {
                    if (idReserva.equals(listareserva.get(i).getIdReserva())) {
                        JOptionPane.showMessageDialog(null, "reserva ya existe");
                        break;
                    } else {
                        ClsReserva reserva = new ClsReserva(tipoVuelo, numerovuelo, fecha, pasajero, promocion, pesoEquipaje, seguro, checkin, valorTotal, idReserva, estadoPago, numeroSilla,cedulacliente);
                        listareserva.add(reserva);
                        JOptionPane.showMessageDialog(null, "reserva registrada");
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return listareserva;
    }

    public String numerosilla(ArrayList<String> silla) {
        String sillas = null;
        for (int i = 0; i < silla.size(); i++) {
            sillas = silla.get(i);
        }
        return sillas;
    }

    public double pesoequipaje(ArrayList<ClsPromocion> listapromocion, String nombrepromocion, int pasajeros) {
        double valor = 0;
        for (int i = 0; i < listapromocion.size(); i++) {
            if (listapromocion.get(i).getNombrePromocion().equals(nombrepromocion)) {
                valor = listapromocion.get(i).getEquipaje() * pasajeros;
            }
        }
        return valor;
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

    public String guardarArchivo(ArrayList<ClsReserva> listaReserva) {
        FileOutputStream archivo = null; //reservar en memoria un espacio para la creacion del archivo

        try {
            archivo = new FileOutputStream("Reservas.dat");
        } catch (Exception e) {
            return "Error creando el archivo";
        }

        ObjectOutputStream escrituraArchivo = null; //creamos un objeto para la escritura en el archivo

        try {
            escrituraArchivo = new ObjectOutputStream(archivo);// se asigna al archivo anteriormente cargado
        } catch (Exception e) {
            return "Error con el archivo";
        }

        try {
            escrituraArchivo.writeObject(listaReserva);// ingresar el listado al archivo creado
            return "Se guardo correctamente";
        } catch (Exception e) {
            return "Error almacenando la informacion";
        }

    }

    public ArrayList<ClsReserva> cargarArchivo(ArrayList<ClsReserva> listaReserva) {
        FileInputStream archivo = null; // se reserva el espacio en memoria para el archivo que se va a cargar

        try {
            archivo = new FileInputStream("Reservas.dat");//se lee el archivo creado en el guardar
        } catch (Exception e) {
            // return "Error cargando el archivo";
        }

        ObjectInputStream lecturaArchivo = null;// definimos un objeto para la lectura del archivo

        try {
            lecturaArchivo = new ObjectInputStream(archivo); // se lo asignamos al archivo leido anteiormente
        } catch (Exception e) {
            //  return "Error con el archivo";
        }

        try {
            listaReserva = (ArrayList<ClsReserva>) lecturaArchivo.readObject();// se saca la informacion del archivo cargado
        } catch (Exception e) {
            //return "Error cargando la informacion";
        }
        return listaReserva;
        // return "Archivo cargado correctamente";
    }
}
