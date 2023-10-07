package com.mycompany.bonanza;


public class CONFIRMACION_COMPRA extends javax.swing.JFrame {


    public CONFIRMACION_COMPRA() {
        initComponents();
        
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnNo = new javax.swing.JButton();
        btnSi = new javax.swing.JButton();
        lblBackHome = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONFIRMACIÓN DE COMPRA");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon("C:\\Users\\ORTIZMURILLOMIGUELAN\\Downloads\\BONANZA\\LogoBonanza.png")); // NOI18N
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -120, -1, 190));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ORTIZMURILLOMIGUELAN\\Downloads\\BONANZA\\buy.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 280, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("¿Estás seguro de comprar este artículo?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 340, 20));

        btnNo.setBackground(new java.awt.Color(0, 102, 102));
        btnNo.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        btnNo.setText("No");
        btnNo.setToolTipText("");
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 530, 90, -1));

        btnSi.setBackground(new java.awt.Color(0, 102, 102));
        btnSi.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        btnSi.setText("Sí");
        btnSi.setToolTipText("");
        btnSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiActionPerformed(evt);
            }
        });
        jPanel1.add(btnSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 90, -1));

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

    private void btnSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiActionPerformed
        COMPRA_REALIZADA CR = new COMPRA_REALIZADA();
        CR.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSiActionPerformed

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        HOME Home = new HOME();
        Home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNoActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CONFIRMACION_COMPRA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnSi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackHome;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
