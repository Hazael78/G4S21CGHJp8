/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21cghjp8;

import Informacion.Datos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author hazae
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    List<Datos> listadatos = new ArrayList<Datos>();
    
    public FrmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        lblnombre = new javax.swing.JLabel();
        lbledad = new javax.swing.JLabel();
        lblcorreo = new javax.swing.JLabel();
        btninicio = new javax.swing.JButton();
        btnatras = new javax.swing.JButton();
        btnsiguiente = new javax.swing.JButton();
        btnultimo = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Agenda");

        jLabel2.setText("Nombre");

        jLabel3.setText("Edad");

        jLabel4.setText("Correo");

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnmostrar.setText("Mostrar");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        lblnombre.setText("Nombre");

        lbledad.setText("Edad");

        lblcorreo.setText("Correo");

        btninicio.setText("|<");

        btnatras.setText("<<");

        btnsiguiente.setText(">>");

        btnultimo.setText(">|");
        btnultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnultimoActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btninicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnatras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnsiguiente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnultimo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnagregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnmostrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnbuscar))
                            .addComponent(txtedad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtcorreo)
                            .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblcorreo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbledad))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblnombre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar)
                    .addComponent(btnmostrar)
                    .addComponent(btnbuscar))
                .addGap(23, 23, 23)
                .addComponent(lblnombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbledad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btninicio)
                    .addComponent(btnatras)
                    .addComponent(btnsiguiente)
                    .addComponent(btnultimo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
        Datos objdatos = new Datos(txtnombre.getText(),Integer.valueOf(txtedad.getText()),txtcorreo.getText());
        listadatos.add(objdatos);
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        // TODO add your handling code here:
        for(Datos datos: listadatos){
            System.out.println("Nombre: " + datos.getNombre());
            System.out.println("Edad: " + datos.getEdad());
            System.out.println("Correo: " + datos.getCorreo());
        }
    }//GEN-LAST:event_btnmostrarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        String cadena= JOptionPane.showInputDialog(this,"Introdusca el nimbre que desea buscar");
        boolean estado = true;
        for(Datos datos: listadatos){
            if(cadena.equals(datos.getNombre())){
                lblnombre.setText("Nombre " + datos.getNombre());
                lbledad.setText("Edad " + String.valueOf(datos.getEdad()));
                lblcorreo.setText("Correo " + datos.getCorreo());
               estado = false;
               break;
            }
        }
        if(estado){
            JOptionPane.showMessageDialog(this,"No se encontro");
        }else{
            JOptionPane.showMessageDialog(this,"Se encontro el nombre"); 
            
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnultimoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnultimoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnatras;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btninicio;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JButton btnsiguiente;
    private javax.swing.JButton btnultimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lbledad;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
