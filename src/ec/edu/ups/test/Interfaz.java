/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.hilo.Cajero;
import ec.edu.ups.hilo.Cliente;
import ec.edu.ups.hilo.FilaDeClientes;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author Dutan2000
 */
public class Interfaz extends javax.swing.JFrame {
    
    private DefaultListModel<String> modeloLista;
;
    public Interfaz() {
        initComponents();
        modeloLista=new DefaultListModel<>();
    }


    public JLabel getCliente1() {
        return lblClienteC1;
    }

    public JLabel getCajero1() {
        return lblCajero1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCajero2 = new javax.swing.JLabel();
        lblCajero1 = new javax.swing.JLabel();
        lblCajero3 = new javax.swing.JLabel();
        lblClienteC1 = new javax.swing.JLabel();
        lblClienteC2 = new javax.swing.JLabel();
        lblClienteC3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSimular = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listVista = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCajero2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/CAJERO.png"))); // NOI18N

        lblCajero1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/CAJERO.png"))); // NOI18N

        lblCajero3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/CAJERO.png"))); // NOI18N

        lblClienteC1.setText("jLabel2");

        lblClienteC2.setText("jLabel2");

        lblClienteC3.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblClienteC1)
                    .addComponent(lblClienteC2)
                    .addComponent(lblClienteC3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 325, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCajero3)
                    .addComponent(lblCajero2)
                    .addComponent(lblCajero1))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCajero1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblClienteC1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblClienteC2)
                        .addGap(127, 127, 127)
                        .addComponent(lblClienteC3)
                        .addGap(73, 73, 73))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblCajero2)
                        .addGap(53, 53, 53)
                        .addComponent(lblCajero3)
                        .addGap(41, 41, 41))))
        );

        jLabel1.setText("SIMULACION DE BANCO");

        btnSimular.setText("SIMULAR");
        btnSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listVista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(btnSimular)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addComponent(btnSimular)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularActionPerformed
try {
        Cajero[] cajeros;
        Thread[] hilos;

        cajeros = new Cajero[3];
        hilos = new Thread[3];

        FilaDeClientes fila = new FilaDeClientes(100);

        for (int i = 0; i < 3; i++) {
            cajeros[i] = new Cajero(fila,i+1, this.listVista,modeloLista);
            hilos[i] = new Thread(cajeros[i]);

            hilos[i].start();

        }

        for (int i = 0; i < 100; i++) {
            Cliente c = new Cliente(fila);
            c.entrarABanco();
        }
        Cajero.esperar(30);

        for (int i = 0; i < 3; i++) {
            cajeros[i].cerrarBanco();
            
                hilos[i].join();
            }
        
        }catch (InterruptedException ex) {

            System.out.println(ex);
        }
    }//GEN-LAST:event_btnSimularActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCajero1;
    private javax.swing.JLabel lblCajero2;
    private javax.swing.JLabel lblCajero3;
    private javax.swing.JLabel lblClienteC1;
    private javax.swing.JLabel lblClienteC2;
    private javax.swing.JLabel lblClienteC3;
    private javax.swing.JList<String> listVista;
    // End of variables declaration//GEN-END:variables
}
