/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtPromocion;
import Modelo.ClsPromocion;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mateo
 */
public class FrmPromocion extends javax.swing.JFrame {

    DateFormat formato = DateFormat.getDateInstance();
    ArrayList<ClsPromocion> listapromocion = new ArrayList<ClsPromocion>();
    CtPromocion controladorPromocion;
    String nombre;
    public FrmPromocion(){
        
    }
    public FrmPromocion(String nombre) {
        initComponents();
        controladorPromocion = new CtPromocion();
        this.nombre=nombre;
        try{
            listapromocion=controladorPromocion.cargarArchivo(listapromocion);
            listar();
        }catch(Exception e){
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

        BtnNuevo = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        lblIdpromocion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtablePromocion = new javax.swing.JTable();
        txtIdpromocion = new javax.swing.JTextField();
        lblMillas = new javax.swing.JLabel();
        BtnRegresar = new javax.swing.JButton();
        txtMillas = new javax.swing.JTextField();
        lblNombrepromocion = new javax.swing.JLabel();
        lblEquipaje = new javax.swing.JLabel();
        txtNombrepromocion = new javax.swing.JTextField();
        txtEquipaje = new javax.swing.JTextField();
        lblValorpromocion = new javax.swing.JLabel();
        BtnRegistrar = new javax.swing.JButton();
        txtValorpromocion = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        lblPromocion = new javax.swing.JLabel();
        JdateFecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnNuevo.setText("Nuevo");
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        lblFecha.setText("Fecha");

        lblIdpromocion.setText("Id promocion");

        JtablePromocion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Id promocion", "Nombre Promocion", "Equipaje", "Millas", "Valor Promocion"
            }
        ));
        jScrollPane1.setViewportView(JtablePromocion);

        txtIdpromocion.setEnabled(false);
        txtIdpromocion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdpromocionKeyTyped(evt);
            }
        });

        lblMillas.setText("Millas");

        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        txtMillas.setEnabled(false);
        txtMillas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMillasKeyTyped(evt);
            }
        });

        lblNombrepromocion.setText("Nombre promocion");

        lblEquipaje.setText("Equipaje");

        txtNombrepromocion.setEnabled(false);
        txtNombrepromocion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombrepromocionKeyTyped(evt);
            }
        });

        txtEquipaje.setEnabled(false);
        txtEquipaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEquipajeActionPerformed(evt);
            }
        });
        txtEquipaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEquipajeKeyTyped(evt);
            }
        });

        lblValorpromocion.setText("Valor de promocion");

        BtnRegistrar.setText("Registrar");
        BtnRegistrar.setEnabled(false);
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });

        txtValorpromocion.setEnabled(false);
        txtValorpromocion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorpromocionKeyTyped(evt);
            }
        });

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnModificar.setText("Modificar");
        BtnModificar.setEnabled(false);
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        lblPromocion.setText("Promocion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(lblPromocion)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnNuevo)
                        .addGap(30, 30, 30)
                        .addComponent(BtnLimpiar)
                        .addGap(26, 26, 26)
                        .addComponent(BtnRegresar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIdpromocion)
                                    .addComponent(lblMillas)
                                    .addComponent(lblEquipaje)
                                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMillas, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(txtEquipaje)
                                    .addComponent(txtIdpromocion)
                                    .addComponent(JdateFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnModificar)
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnEliminar)
                                    .addComponent(BtnBuscar)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblValorpromocion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorpromocion, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                            .addComponent(BtnRegistrar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombrepromocion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombrepromocion)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPromocion)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnRegresar)
                            .addComponent(BtnLimpiar)
                            .addComponent(BtnNuevo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFecha)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblIdpromocion)
                                    .addComponent(txtIdpromocion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNombrepromocion)
                                    .addComponent(txtNombrepromocion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMillas)
                                    .addComponent(txtMillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEquipaje)
                                    .addComponent(txtEquipaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblValorpromocion)
                                    .addComponent(txtValorpromocion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtnRegistrar)
                                    .addComponent(BtnBuscar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtnModificar)
                                    .addComponent(BtnEliminar)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JdateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        BtnRegistrar.setEnabled(true);
        JdateFecha.setEnabled(true);
        txtIdpromocion.setEnabled(true);
        txtNombrepromocion.setEnabled(true);
        txtMillas.setEnabled(true);
        txtEquipaje.setEnabled(true);
        txtValorpromocion.setEnabled(true);
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        int idPromocion = Integer.parseInt(JOptionPane.showInputDialog("ingrese el id de la promocion que desea eliminar"));
        listapromocion = controladorPromocion.eliminarPromocion(listapromocion, idPromocion);
        String res = controladorPromocion.guardarArchivo(listapromocion);
        listar();
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void txtIdpromocionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdpromocionKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdpromocionKeyTyped

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        FrmAdministrador administrador=new FrmAdministrador(nombre);
        administrador.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void txtMillasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMillasKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtMillasKeyTyped

    private void txtNombrepromocionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrepromocionKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombrepromocionKeyTyped

    private void txtEquipajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEquipajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEquipajeActionPerformed

    private void txtEquipajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEquipajeKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtEquipajeKeyTyped

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
        String fecha = formato.format(JdateFecha.getDate());
        int idPromocion = Integer.parseInt(txtIdpromocion.getText());
        String nombrePromocion = txtNombrepromocion.getText();
        double millas = Double.parseDouble(txtMillas.getText());
        double equipaje = Double.parseDouble(txtEquipaje.getText());
        double valorPromocion = Double.parseDouble(txtValorpromocion.getText());

        listapromocion = controladorPromocion.registrarPromocion(listapromocion, fecha, nombrePromocion, idPromocion, equipaje, millas, valorPromocion);
        String res = controladorPromocion.guardarArchivo(listapromocion);
        listar();
        limpiar();
    }//GEN-LAST:event_BtnRegistrarActionPerformed

    private void txtValorpromocionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorpromocionKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtValorpromocionKeyTyped

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        int idPromocion = Integer.parseInt(JOptionPane.showInputDialog("ingrese el id de la promocion"));
        BtnModificar.setEnabled(true);
        JdateFecha.setEnabled(true);
        txtIdpromocion.setEnabled(true);
        txtNombrepromocion.setEnabled(true);
        txtMillas.setEnabled(true);
        txtEquipaje.setEnabled(true);
        txtValorpromocion.setEnabled(true);
        ClsPromocion promocion = null;
        promocion = controladorPromocion.buscarPromocion(listapromocion, idPromocion);
        if (promocion == null) {
            limpiar();
        } else {
            Date fecha = convertirString(promocion.getFecha());
            JdateFecha.setDate(fecha);
            txtIdpromocion.setText(promocion.getIdPromocion()+"");
            txtNombrepromocion.setText(promocion.getNombrePromocion());
            txtMillas.setText(promocion.getMillas() + "");
            txtEquipaje.setText(promocion.getEquipaje() + "");
            txtValorpromocion.setText(promocion.getValorPromocion() + "");

        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        String fecha = formato.format(JdateFecha.getDate());
        int idPromocion = Integer.parseInt(txtIdpromocion.getText());
        String nombrePromocion = txtNombrepromocion.getText();
        double millas = Double.parseDouble(txtMillas.getText());
        double equipaje = Double.parseDouble(txtEquipaje.getText());
        double valorPromocion = Double.parseDouble(txtValorpromocion.getText());
        listapromocion = controladorPromocion.modificarPromocion(listapromocion, nombrePromocion, fecha, idPromocion, equipaje, millas, valorPromocion);
        String res = controladorPromocion.guardarArchivo(listapromocion);
        BtnModificar.setEnabled(false);
        limpiar();
        listar();
    }//GEN-LAST:event_BtnModificarActionPerformed
public void limpiar() {
        Date vacio = null;
        JdateFecha.setDate(vacio);
        JdateFecha.setCalendar(null);
        JdateFecha.setEnabled(false);
        txtNombrepromocion.setText("");
        txtNombrepromocion.setEnabled(false);
        txtIdpromocion.setText("");
        txtIdpromocion.setEnabled(false);
        txtMillas.setText("");
        txtMillas.setEnabled(false);
        txtEquipaje.setText("");
        txtEquipaje.setEnabled(false);
        txtValorpromocion.setText("");
        txtValorpromocion.setEnabled(false);

    }
 public void listar() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = controladorPromocion.listarElementos(listapromocion);
        JtablePromocion.setModel(modelo);
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
            java.util.logging.Logger.getLogger(FrmPromocion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPromocion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPromocion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPromocion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPromocion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JButton BtnRegresar;
    private com.toedter.calendar.JDateChooser JdateFecha;
    private javax.swing.JTable JtablePromocion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEquipaje;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIdpromocion;
    private javax.swing.JLabel lblMillas;
    private javax.swing.JLabel lblNombrepromocion;
    private javax.swing.JLabel lblPromocion;
    private javax.swing.JLabel lblValorpromocion;
    private javax.swing.JTextField txtEquipaje;
    private javax.swing.JTextField txtIdpromocion;
    private javax.swing.JTextField txtMillas;
    private javax.swing.JTextField txtNombrepromocion;
    private javax.swing.JTextField txtValorpromocion;
    // End of variables declaration//GEN-END:variables
}
