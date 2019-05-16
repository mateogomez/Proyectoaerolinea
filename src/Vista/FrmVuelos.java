/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtVuelos;
import Controlador.CtlAvion;
import Controlador.CtlRuta;
import Modelo.ClsAvion;
import Modelo.ClsRuta;
import Modelo.ClsVuelo;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mateo
 */
public class FrmVuelos extends javax.swing.JFrame {

    DateFormat formato = DateFormat.getDateInstance();
    ArrayList<ClsAvion> listaAvion = new ArrayList<ClsAvion>();
    ArrayList<ClsRuta> listaRuta = new ArrayList<ClsRuta>();
    ArrayList<ClsVuelo> listaVuelos = new ArrayList<ClsVuelo>();
    CtlAvion controladorAvion;
    CtlRuta controladorRuta;
    CtVuelos controladorVuelos;
    String nombre;

    public FrmVuelos() {

    }

    public FrmVuelos(String nombre) {
        initComponents();
        controladorAvion = new CtlAvion();
        controladorRuta = new CtlRuta();
        controladorVuelos = new CtVuelos();
        this.nombre = nombre;
        try {
            listaAvion = controladorAvion.cargarArchivo(listaAvion);
            listaRuta = controladorRuta.cargarArchivo(listaRuta);
            listaVuelos = controladorVuelos.cargarArchivo(listaVuelos);
            listarcomboxavion();
            listarcomboxdestino();
            listarcomboxorigen();
            listarida();
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        CbxHorallegada = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtVuelosida = new javax.swing.JTable();
        lblOrigen = new javax.swing.JLabel();
        CbxAvion = new javax.swing.JComboBox<>();
        BtnRegistrar = new javax.swing.JButton();
        txtNumeroVuelo = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        CbxOrigen = new javax.swing.JComboBox<>();
        BtnModificar = new javax.swing.JButton();
        lblDestino = new javax.swing.JLabel();
        BtnEliminar = new javax.swing.JButton();
        CbxDestino = new javax.swing.JComboBox<>();
        BtnRegresar = new javax.swing.JButton();
        lblHorasalida = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblHorallegada = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        lblVuelo = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        CbxHorasalida = new javax.swing.JComboBox<>();
        lblAvion = new javax.swing.JLabel();
        JcalendarFechaida = new com.toedter.calendar.JDateChooser();
        lblNumerovuelo = new javax.swing.JLabel();
        lblVueloida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JrbtnIda = new javax.swing.JRadioButton();
        JrbtnVuelta = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CbxHorallegada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mañana", "Tarde", "Noche" }));

        JtVuelosida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Numero vuelo", "Avion", "Origen", "Destino", "Hora salida", "Hora llegada", "Estado"
            }
        ));
        jScrollPane1.setViewportView(JtVuelosida);

        lblOrigen.setText("Origen");

        BtnRegistrar.setText("Registrar");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        BtnModificar.setText("Modificar");
        BtnModificar.setEnabled(false);
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        lblDestino.setText("Destino");

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        lblHorasalida.setText("Hora salida");

        lblEstado.setText("Estado");

        lblHorallegada.setText("Hora llegada");

        lblVuelo.setText("Vuelos");

        lblFecha.setText("Fecha ");

        CbxHorasalida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mañana", "Tarde", "Noche" }));

        lblAvion.setText("Avion");

        lblNumerovuelo.setText("Numero vuelo");

        lblVueloida.setText("Vuelos");

        jLabel1.setText("Tipo vuelo");

        buttonGroup2.add(JrbtnIda);
        JrbtnIda.setText("Ida");

        buttonGroup2.add(JrbtnVuelta);
        JrbtnVuelta.setText("Vuelta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnRegistrar)
                        .addGap(59, 59, 59)
                        .addComponent(BtnBuscar)
                        .addGap(52, 52, 52)
                        .addComponent(BtnModificar)
                        .addGap(47, 47, 47)
                        .addComponent(BtnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(BtnRegresar)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAvion)
                                    .addComponent(lblOrigen)
                                    .addComponent(lblHorasalida)
                                    .addComponent(lblFecha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CbxAvion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CbxOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CbxHorasalida, 0, 156, Short.MAX_VALUE))
                                    .addComponent(JcalendarFechaida, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumerovuelo)
                                    .addComponent(lblDestino)
                                    .addComponent(lblHorallegada)
                                    .addComponent(lblEstado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CbxDestino, 0, 160, Short.MAX_VALUE)
                                    .addComponent(txtNumeroVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CbxHorallegada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lblVueloida))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(lblVuelo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(JrbtnIda, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JrbtnVuelta, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVuelo)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvion)
                    .addComponent(lblNumerovuelo)
                    .addComponent(CbxAvion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrigen)
                    .addComponent(CbxOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDestino)
                    .addComponent(CbxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHorasalida)
                    .addComponent(lblHorallegada)
                    .addComponent(CbxHorasalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbxHorallegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEstado)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JcalendarFechaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JrbtnIda)
                        .addComponent(JrbtnVuelta)))
                .addGap(7, 7, 7)
                .addComponent(lblVueloida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRegresar)
                    .addComponent(BtnRegistrar)
                    .addComponent(BtnBuscar)
                    .addComponent(BtnModificar)
                    .addComponent(BtnEliminar))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed

        String serial = CbxAvion.getSelectedItem().toString();
        String numeroVuelo = txtNumeroVuelo.getText();
        String origen = CbxOrigen.getSelectedItem().toString();
        String destino = CbxDestino.getSelectedItem().toString();
        String horaSalida = CbxHorasalida.getSelectedItem().toString();
        String horaLlegada = CbxHorallegada.getSelectedItem().toString();
        String fecha = formato.format(JcalendarFechaida.getDate());
        String estado = txtEstado.getText();

        if (JrbtnIda.isSelected() == true && JrbtnVuelta.isSelected() == false) {
            String ida = JrbtnIda.getText();
            listaVuelos = controladorVuelos.registrarVuelo(listaVuelos, fecha, horaSalida, horaLlegada, numeroVuelo, estado, origen, destino, serial, ida);
            String res = controladorVuelos.guardarArchivo(listaVuelos);
            limpiar();
            listarida();
            
        }
        if (JrbtnIda.isSelected() == false && JrbtnVuelta.isSelected() == true) {
            String vuelta = JrbtnVuelta.getText();
            listaVuelos = controladorVuelos.registrarVuelo(listaVuelos, fecha, horaSalida, horaLlegada, numeroVuelo, estado, origen, destino, serial, vuelta);
            String res = controladorVuelos.guardarArchivo(listaVuelos);
            limpiar();
           listarida();
           
        }

    }//GEN-LAST:event_BtnRegistrarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        String numeroVuelo = JOptionPane.showInputDialog("Ingrese el numero de vuelo");
        limpiar();
        ClsVuelo vuelo = null;
        vuelo = controladorVuelos.buscarVuelo(listaVuelos, numeroVuelo);
        if (vuelo == null) {
            limpiar();
        } else {
            if (vuelo.getTipovuelo().equals("Ida")) {
                Date fecha = convertirString(vuelo.getFecha());
                JcalendarFechaida.setDate(fecha);
                CbxAvion.setSelectedItem(vuelo.getSerial());
                txtNumeroVuelo.setText(vuelo.getNumeroVuelo());
                CbxOrigen.setSelectedItem(vuelo.getOrigen());
                CbxDestino.setSelectedItem(vuelo.getDestino());
                CbxHorasalida.setSelectedItem(vuelo.getHoraSalida());
                CbxHorallegada.setSelectedItem(vuelo.getHoraLlegada());
                txtEstado.setText(vuelo.getEstado());
                JrbtnIda.setSelected(true);
                JrbtnVuelta.setSelected(false);
                BtnModificar.setEnabled(true);

            }
            if (vuelo.getTipovuelo().equals("Vuelta")) {
                Date fecha = convertirString(vuelo.getFecha());
                JcalendarFechaida.setDate(fecha);
                CbxAvion.setSelectedItem(vuelo.getSerial());
                txtNumeroVuelo.setText(vuelo.getNumeroVuelo());
                CbxOrigen.setSelectedItem(vuelo.getOrigen());
                CbxDestino.setSelectedItem(vuelo.getDestino());
                CbxHorasalida.setSelectedItem(vuelo.getHoraSalida());
                CbxHorallegada.setSelectedItem(vuelo.getHoraLlegada());
                txtEstado.setText(vuelo.getEstado());
                JrbtnIda.setSelected(false);
                JrbtnVuelta.setSelected(true);
                BtnModificar.setEnabled(true);
            }

        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        String serial = CbxAvion.getSelectedItem().toString();
        String numeroVuelo = txtNumeroVuelo.getText();
        String origen = CbxOrigen.getSelectedItem().toString();
        String destino = CbxDestino.getSelectedItem().toString();
        String horaSalida = CbxHorasalida.getSelectedItem().toString();
        String horaLlegada = CbxHorallegada.getSelectedItem().toString();
        String fechaida = formato.format(JcalendarFechaida.getDate());
        String estado = txtEstado.getText();
        listaVuelos = controladorVuelos.modificarVuelo(listaVuelos, fechaida, horaSalida, horaLlegada, numeroVuelo, estado, origen, destino, serial);
        String res = controladorVuelos.guardarArchivo(listaVuelos);
        limpiar();
        BtnModificar.setEnabled(false);
        listarida();
        
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        String numeroVuelo = JOptionPane.showInputDialog("Ingrese el numero de vuelo");
        listaVuelos = controladorVuelos.eliminarVuelo(listaVuelos, numeroVuelo);
        String res = controladorVuelos.guardarArchivo(listaVuelos);
        listarida();
       
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        FrmAdministrador administrador = new FrmAdministrador(nombre);
        administrador.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed
    private void listarida() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = controladorVuelos.listarElementosida(listaVuelos);
        JtVuelosida.setModel(modelo);
    }

 

    public void limpiar() {
        Date vacio = null;
        JcalendarFechaida.setDate(vacio);
        JcalendarFechaida.setCalendar(null);
        txtNumeroVuelo.setText("");
        txtEstado.setText("");
    }

    public Date convertirString(String fecha) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = format.parse(fecha);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return fechaDate;
    }

    private void listarcomboxavion() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (int i = 0; i < listaAvion.size(); i++) {
            modelo.addElement(listaAvion.get(i).getSerial());
        }
        CbxAvion.setModel(modelo);

    }

    private void listarcomboxorigen() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (int i = 0; i < listaRuta.size(); i++) {
            modelo.addElement(listaRuta.get(i).getOrigen());
        }
        CbxOrigen.setModel(modelo);

    }

    private void listarcomboxdestino() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (int i = 0; i < listaRuta.size(); i++) {
          
            modelo.addElement(listaRuta.get(i).getDestino());
        }
        CbxDestino.setModel(modelo);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVuelos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JComboBox<String> CbxAvion;
    private javax.swing.JComboBox<String> CbxDestino;
    private javax.swing.JComboBox<String> CbxHorallegada;
    private javax.swing.JComboBox<String> CbxHorasalida;
    private javax.swing.JComboBox<String> CbxOrigen;
    private com.toedter.calendar.JDateChooser JcalendarFechaida;
    private javax.swing.JRadioButton JrbtnIda;
    private javax.swing.JRadioButton JrbtnVuelta;
    private javax.swing.JTable JtVuelosida;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvion;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHorallegada;
    private javax.swing.JLabel lblHorasalida;
    private javax.swing.JLabel lblNumerovuelo;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JLabel lblVuelo;
    private javax.swing.JLabel lblVueloida;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNumeroVuelo;
    // End of variables declaration//GEN-END:variables
}
