package com.mycompany.bonanza;


public class COMPRA_REALIZADA extends javax.swing.JFrame {


    public COMPRA_REALIZADA() {
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
        lblBackHome = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COMPRA REALIZADA");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon("C:\\Users\\ORTIZMURILLOMIGUELAN\\Downloads\\BONANZA\\LogoBonanza.png")); // NOI18N
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -120, -1, 190));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ORTIZMURILLOMIGUELAN\\Downloads\\BONANZA\\shopping-cart.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 240, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 255, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("¡DISFRUTA TU COMPRA!");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 340, 20));

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


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new COMPRA_REALIZADA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackHome;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
