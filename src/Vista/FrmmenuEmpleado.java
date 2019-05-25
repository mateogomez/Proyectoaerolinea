/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtCliente;
import Controlador.CtEmpleado;
import Modelo.ClsCliente;
import Modelo.ClsEmpleado;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mateo
 */
public class FrmmenuEmpleado extends javax.swing.JFrame {

    public static String nombre;

    ArrayList<ClsEmpleado> listaempleado = new ArrayList<ClsEmpleado>();
    ArrayList<ClsCliente> listacliente = new ArrayList<ClsCliente>();
    CtCliente controladorcliente;
    CtEmpleado controladorempleado;

    public FrmmenuEmpleado() {
        initComponents();
    }
 public FrmmenuEmpleado(String nombre) {
        initComponents();
        this.nombre= nombre;
        lblNombre.setText(nombre);
        controladorcliente= new CtCliente();
        controladorempleado= new CtEmpleado();
        try{
            listacliente=controladorcliente.cargarArchivo(listacliente);
            listaempleado= controladorempleado.cargarArchivo(listaempleado);
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

        jLabel2 = new javax.swing.JLabel();
        BtnRegresar = new javax.swing.JButton();
        lblBienvenido = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JmbMenu = new javax.swing.JMenu();
        BtnConsultar = new javax.swing.JMenuItem();
        JmtpagarReservas = new javax.swing.JMenuItem();
        Jmtreservas = new javax.swing.JMenuItem();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        lblBienvenido.setText("Bienvenido");

        lblNombre.setText("Nombre");

        JmbMenu.setText("Menu");

        BtnConsultar.setText("Consultar clientes");
        BtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarActionPerformed(evt);
            }
        });
        JmbMenu.add(BtnConsultar);

        JmtpagarReservas.setText("Pagar reservas");
        JmbMenu.add(JmtpagarReservas);

        Jmtreservas.setText("Reservas");
        JmbMenu.add(Jmtreservas);

        jMenuBar1.add(JmbMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(223, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnRegresar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblBienvenido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNombre)
                        .addGap(75, 75, 75))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBienvenido)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addComponent(BtnRegresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarActionPerformed
        FrmConsultaCliente cliente = new FrmConsultaCliente();
        cliente.setVisible(true);
        dispose();


    }//GEN-LAST:event_BtnConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmmenuEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmmenuEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmmenuEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmmenuEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmmenuEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BtnConsultar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JMenu JmbMenu;
    private javax.swing.JMenuItem JmtpagarReservas;
    private javax.swing.JMenuItem Jmtreservas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
