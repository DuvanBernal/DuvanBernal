/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import static Vista.Vista.Aux1;
import static Vista.Vista.Aux2;
import static Vista.Vista.Aux3;

/**
 *
 * @author 57313
 */
public class Vista2 extends javax.swing.JFrame {

    /**
     * Creates new form vista2
     */
    public Vista2() {
        
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
        JTF_cantidadasientos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTF_mascarasoxigeno = new javax.swing.JTextField();
        JB_continuarv2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JTF_colorR1 = new javax.swing.JTextField();
        JTF_tamañoR1 = new javax.swing.JTextField();
        JTF_marcaR1 = new javax.swing.JTextField();
        JTF_pasajerosR = new javax.swing.JTextField();
        JTF_cantidadasientosR = new javax.swing.JTextField();
        JTF_mascarasoxigenoR = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("Pasajeros");

        jLabel2.setText("Cantidad de asientos:");

        jLabel3.setText("Cantidad mascaras de oxigeno:");

        JTF_mascarasoxigeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_mascarasoxigenoActionPerformed(evt);
            }
        });

        JB_continuarv2.setText("Continuar");
        JB_continuarv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_continuarv2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Las caracteristicas que usted añadio acerca del avion son las siguientes:");

        jLabel5.setText("Color:");

        jLabel6.setText("Tamaño:");

        jLabel7.setText("Marca:");

        jLabel8.setText("Servicio a prestar:");

        jLabel9.setText("Cantidad asientos:");

        jLabel10.setText("Cantidad mascaras oxigeno:");

        JTF_colorR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_colorR1ActionPerformed(evt);
            }
        });

        JTF_tamañoR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_tamañoR1ActionPerformed(evt);
            }
        });

        JTF_marcaR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_marcaR1ActionPerformed(evt);
            }
        });

        JTF_pasajerosR.setText("Pasajeros");
        JTF_pasajerosR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_pasajerosRActionPerformed(evt);
            }
        });

        JTF_mascarasoxigenoR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_mascarasoxigenoRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(74, 74, 74)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(jLabel3)))
                    .addGap(64, 64, 64)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JTF_cantidadasientos, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                        .addComponent(JTF_mascarasoxigeno)))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(543, 543, 543))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(549, 549, 549))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(71, 71, 71)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)))
                                .addComponent(jLabel10))
                            .addGap(107, 107, 107)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTF_tamañoR1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTF_colorR1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTF_marcaR1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTF_pasajerosR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTF_cantidadasientosR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTF_mascarasoxigenoR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(209, 209, 209))))
                .addGroup(layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(jLabel4)))
            .addGroup(layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(JB_continuarv2))
            .addGroup(layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jLabel1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTF_cantidadasientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTF_mascarasoxigeno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(JB_continuarv2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(JTF_colorR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(JTF_tamañoR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JTF_marcaR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(JTF_pasajerosR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JTF_cantidadasientosR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(JTF_mascarasoxigenoR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTF_mascarasoxigenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_mascarasoxigenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_mascarasoxigenoActionPerformed

    private void JTF_colorR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_colorR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_colorR1ActionPerformed

    private void JTF_marcaR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_marcaR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_marcaR1ActionPerformed

    private void JTF_pasajerosRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_pasajerosRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_pasajerosRActionPerformed

    private void JTF_tamañoR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_tamañoR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_tamañoR1ActionPerformed

    private void JTF_mascarasoxigenoRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_mascarasoxigenoRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_mascarasoxigenoRActionPerformed

    private void JB_continuarv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_continuarv2ActionPerformed
      JTF_cantidadasientosR.setText(JTF_cantidadasientos.getText());
      JTF_mascarasoxigenoR.setText(JTF_mascarasoxigeno.getText());
      JTF_colorR1.setText(Aux1);
      JTF_tamañoR1.setText(Aux2);
      JTF_marcaR1.setText(Aux3);
      
      
    }//GEN-LAST:event_JB_continuarv2ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JB_continuarv2;
    public javax.swing.JTextField JTF_cantidadasientos;
    public javax.swing.JTextField JTF_cantidadasientosR;
    public javax.swing.JTextField JTF_colorR1;
    public javax.swing.JTextField JTF_marcaR1;
    public javax.swing.JTextField JTF_mascarasoxigeno;
    public javax.swing.JTextField JTF_mascarasoxigenoR;
    public javax.swing.JTextField JTF_pasajerosR;
    public javax.swing.JTextField JTF_tamañoR1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
