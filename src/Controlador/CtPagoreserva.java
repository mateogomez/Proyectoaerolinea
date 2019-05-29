/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ClsPagoreserva;
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
public class CtPagoreserva {
public ArrayList<ClsPagoreserva>modificarpago(ArrayList<ClsPagoreserva> listareserva,String idreserva){
    for(int i=0;i<listareserva.size();i++){
        if(idreserva.equals(listareserva.get(i).getIdreserva())&& listareserva.get(i).getEstadopago().equals("inactivo")){
            listareserva.get(i).setEstadopago("activo");
        }else {
            JOptionPane.showMessageDialog(null,"no se encontro reserva");
        }
    }
    return listareserva;
}
    public ArrayList<ClsPagoreserva> pagoreserva(ArrayList<ClsPagoreserva> listareserva, String idreserva, String estado) {

        if (listareserva.isEmpty()) {
            ClsPagoreserva pago = new ClsPagoreserva(idreserva, estado);
            listareserva.add(pago);
            JOptionPane.showMessageDialog(null, "pago reserva registrado");
        } else {
            for (int i = 0; i < listareserva.size(); i++) {
                if (listareserva.get(i).getIdreserva().equals(idreserva)) {
                    JOptionPane.showMessageDialog(null, "ya realizo el pago reserva ");
                } else {
                    ClsPagoreserva pago = new ClsPagoreserva(idreserva, estado);
                    listareserva.add(pago);
                    JOptionPane.showMessageDialog(null, "pago reserva registrado");
                }
            }
        }
      return listareserva;  
    }
    public String guardarArchivo(ArrayList<ClsPagoreserva> listapagos) {
        FileOutputStream archivo = null; //reservar en memoria un espacio para la creacion del archivo

        try {
            archivo = new FileOutputStream("pagos.dat");
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
            escrituraArchivo.writeObject(listapagos);// ingresar el listado al archivo creado
            return "Se guardo correctamente";
        } catch (Exception e) {
            return "Error almacenando la informacion";
        }

    }

    public ArrayList<ClsPagoreserva> cargarArchivo(ArrayList<ClsPagoreserva> listapagos) {
        FileInputStream archivo = null; // se reserva el espacio en memoria para el archivo que se va a cargar

        try {
            archivo = new FileInputStream("pagos.dat");//se lee el archivo creado en el guardar
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
            listapagos = (ArrayList<ClsPagoreserva>) lecturaArchivo.readObject();// se saca la informacion del archivo cargado
        } catch (Exception e) {
            //return "Error cargando la informacion";
        }
        return listapagos;
        // return "Archivo cargado correctamente";
    }
}
