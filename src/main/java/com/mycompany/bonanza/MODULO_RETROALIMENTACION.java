/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bonanza;

/**
 *
 * @author ORTIZMURILLOMIGUELAN
 */
public class MODULO_RETROALIMENTACION extends javax.swing.JFrame {

    /**
     * Creates new form MODULO_RETROALIMENTACION
     */
    public MODULO_RETROALIMENTACION() {
        initComponents();
        
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTriste = new javax.swing.JLabel();
        lblFeliz = new javax.swing.JLabel();
        lblNeutro = new javax.swing.JLabel();
        lblBackHome = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RETROALIMENTACIÓN DE COMPRA");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon("C:\\Users\\ORTIZMURILLOMIGUELAN\\Downloads\\BONANZA\\LogoBonanza.png")); // NOI18N
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -120, -1, 190));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ORTIZMURILLOMIGUELAN\\Downloads\\BONANZA\\question.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 250, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("¿Qué tan necesaria consideras esta compra?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 340, 20));

        lblTriste.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTriste.setIcon(new javax.swing.ImageIcon("C:\\Users\\ORTIZMURILLOMIGUELAN\\Downloads\\BONANZA\\sad-face.png")); // NOI18N
        lblTriste.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTriste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTristeMouseClicked(evt);
            }
        });
        jPanel1.add(lblTriste, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 80, 70));

        lblFeliz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFeliz.setIcon(new javax.swing.ImageIcon("C:\\Users\\ORTIZMURILLOMIGUELAN\\Downloads\\BONANZA\\smile.png")); // NOI18N
        lblFeliz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFeliz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFelizMouseClicked(evt);
            }
        });
        jPanel1.add(lblFeliz, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 80, 70));

        lblNeutro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNeutro.setIcon(new javax.swing.ImageIcon("C:\\Users\\ORTIZMURILLOMIGUELAN\\Downloads\\BONANZA\\neutral-face.png")); // NOI18N
        lblNeutro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNeutro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNeutroMouseClicked(evt);
            }
        });
        jPanel1.add(lblNeutro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 80, 70));

        lblBackHome.setIcon(new javax.swing.ImageIcon("C:\\Users\\ORTIZMURILLOMIGUELAN\\Downloads\\BONANZA\\house.png")); // NOI18N
        lblBackHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackHomeMouseClicked(evt);
            }
        });
        jPanel1.add(lblBackHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, -1, -1));

        lblFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\ORTIZMURILLOMIGUELAN\\Downloads\\BONANZA\\RETROALIMENTACION DE COMPRA.png")); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, 420, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackHomeMouseClicked
        HOME Home = new HOME();
        Home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBackHomeMouseClicked

    private void lblFelizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFelizMouseClicked
        CONFIRMACION_COMPRA CC = new CONFIRMACION_COMPRA();
        CC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblFelizMouseClicked

    private void lblNeutroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNeutroMouseClicked
        CONFIRMACION_COMPRA CC = new CONFIRMACION_COMPRA();
        CC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblNeutroMouseClicked

    private void lblTristeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTristeMouseClicked
        CONFIRMACION_COMPRA CC = new CONFIRMACION_COMPRA();
        CC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblTristeMouseClicked

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
            java.util.logging.Logger.getLogger(MODULO_RETROALIMENTACION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MODULO_RETROALIMENTACION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MODULO_RETROALIMENTACION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MODULO_RETROALIMENTACION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MODULO_RETROALIMENTACION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackHome;
    private javax.swing.JLabel lblFeliz;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNeutro;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTriste;
    // End of variables declaration//GEN-END:variables
}
