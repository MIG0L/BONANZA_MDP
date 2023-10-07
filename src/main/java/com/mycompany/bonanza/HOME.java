package com.mycompany.bonanza;

public class HOME extends javax.swing.JFrame {


    public HOME() {
        initComponents();
        
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblGoRetro = new javax.swing.JLabel();
        lblGoCategorias = new javax.swing.JLabel();
        lblGoAhorro = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGoRetro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGoRetro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGoRetroMouseClicked(evt);
            }
        });
        jPanel1.add(lblGoRetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 120, 120));

        lblGoCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGoCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGoCategoriasMouseClicked(evt);
            }
        });
        jPanel1.add(lblGoCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, 120));

        lblGoAhorro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGoAhorro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGoAhorroMouseClicked(evt);
            }
        });
        jPanel1.add(lblGoAhorro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 120, 120));

        lblFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\ORTIZMURILLOMIGUELAN\\Downloads\\BONANZA\\OFICIAL HOME.png")); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblGoCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGoCategoriasMouseClicked
        MODULO_CATEGORIAS_CONSUMO MC = new MODULO_CATEGORIAS_CONSUMO();
        MC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblGoCategoriasMouseClicked

    private void lblGoAhorroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGoAhorroMouseClicked
        MODULO_DINERO_BAJO_COLCHON MDBC = new MODULO_DINERO_BAJO_COLCHON();
        MDBC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblGoAhorroMouseClicked

    private void lblGoRetroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGoRetroMouseClicked
        MODULO_RETROALIMENTACION MR = new MODULO_RETROALIMENTACION();
        MR.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblGoRetroMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HOME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblGoAhorro;
    private javax.swing.JLabel lblGoCategorias;
    private javax.swing.JLabel lblGoRetro;
    // End of variables declaration//GEN-END:variables
}
