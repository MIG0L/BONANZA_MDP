package com.mycompany.bonanza;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MODULO_CATEGORIAS_CONSUMO extends javax.swing.JFrame {

 CONNECTION_MODULE cn = new CONNECTION_MODULE();
 DefaultTableModel CategoriasConsumo = new DefaultTableModel();
 
 String RFC; String Alimentacion; String Ropa; String Electronica; String Hogar; String Belleza; String Lectura; String Entretenimiento;
 String Deportes; String Viajes;
 
 int i=0;
 
    public MODULO_CATEGORIAS_CONSUMO() {
        initComponents();
        
        setLocationRelativeTo(null);
        tblCategoriasConsumo.setVisible(false);
    }
    
     public void ObtenerValores(){
        
        try {
            Statement st;
            st = cn.con.createStatement();                                  
            
            RFC = (String)tblCategoriasConsumo.getValueAt(0,0);
            Alimentacion = (String) tblCategoriasConsumo.getValueAt(0,1);
            Ropa = (String) tblCategoriasConsumo.getValueAt(0,2);
            Electronica = (String) tblCategoriasConsumo.getValueAt(0,3);
            Hogar = (String) tblCategoriasConsumo.getValueAt(0,4);
            Belleza = (String) tblCategoriasConsumo.getValueAt(0,5);
            Lectura = (String) tblCategoriasConsumo.getValueAt(0,6);
            Entretenimiento = (String) tblCategoriasConsumo.getValueAt(0,7);
            Deportes = (String) tblCategoriasConsumo.getValueAt(0,8);
            Viajes = (String) tblCategoriasConsumo.getValueAt(0,9);
            
            String sql = "Update registrocompras set RFC='"+RFC+"',Alimentacion='"+Alimentacion+"',Ropa='"+Ropa+"',Electronica='"+Electronica+"',Hogar='"+Hogar+"',Belleza='"+Belleza+"',Lectura='"+Lectura+"',Entretenimiento='"+Entretenimiento+"',Deportes='"+Deportes+"',Viajes='"+Viajes+"' where RFC = '"+RFC+"'";
            
            st.executeUpdate(sql);
        } ///////////////////////
        catch (SQLException ex) {
            Logger.getLogger(MODULO_CATEGORIAS_CONSUMO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        ////////////////////////////////////////
        
        Thread hilo= new Thread(){
            
           @Override
           public void run(){          
           
                  i = Integer.parseInt(Alimentacion);  
                  BarraProgesoAlimentacion.setValue(i);
                  i = Integer.parseInt(Ropa);
                  BarraProgesoRopa.setValue(i);
                  i = Integer.parseInt(Electronica);          
                  BarraProgesoElectronica.setValue(i);
                  i = Integer.parseInt(Hogar); 
                  BarraProgesoHogar.setValue(i);
                  i = Integer.parseInt(Belleza); 
                  BarraProgesoBelleza.setValue(i);
                  i = Integer.parseInt(Lectura);
                  BarraProgesoLectura.setValue(i);
                  i = Integer.parseInt(Entretenimiento);
                  BarraProgesoEntretenimiento.setValue(i);
                  i = Integer.parseInt(Deportes);
                  BarraProgesoDeportes.setValue(i);
                  i = Integer.parseInt(Viajes); 
                  BarraProgesoViajes.setValue(i);
                 
            } 
                
        }; // fin de hilo
        hilo.start(); // iniciar hilo     
        
        
    }///////////////////
    
    public void consultaConsumos(){
        
       try {
            CategoriasConsumo = (DefaultTableModel) tblCategoriasConsumo.getModel();
            String RFC = txtRFC.getText();
            
            Statement st =cn.con.createStatement();
            ResultSet Consulta = st.executeQuery("Select * from registrocompras where RFC = '"+RFC+"'");
            
            while(Consulta.next()){
                
                String [] Registro = {Consulta.getString(1),Consulta.getString(2),Consulta.getString(3),
                    Consulta.getString(4),Consulta.getString(5),Consulta.getString(6),
                    Consulta.getString(7),Consulta.getString(8),Consulta.getString(9),Consulta.getString(10)};
                CategoriasConsumo.addRow(Registro);
                
            }// fin while
        } ////Fin try primario
        catch (SQLException ex) {
            Logger.getLogger(MODULO_CATEGORIAS_CONSUMO.class.getName()).log(Level.SEVERE, null, ex);
        }//Fin try primario
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BarraProgesoViajes = new javax.swing.JProgressBar();
        BarraProgesoAlimentacion = new javax.swing.JProgressBar();
        BarraProgesoRopa = new javax.swing.JProgressBar();
        BarraProgesoElectronica = new javax.swing.JProgressBar();
        BarraProgesoHogar = new javax.swing.JProgressBar();
        BarraProgesoBelleza = new javax.swing.JProgressBar();
        BarraProgesoLectura = new javax.swing.JProgressBar();
        BarraProgesoEntretenimiento = new javax.swing.JProgressBar();
        BarraProgesoDeportes = new javax.swing.JProgressBar();
        txtRFC = new javax.swing.JTextField();
        lblIngresarRFC = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategoriasConsumo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONSUMO POR CATEGORÍAS");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraProgesoViajes.setMaximum(10);
        BarraProgesoViajes.setBorder(null);
        BarraProgesoViajes.setString("0");
        jPanel1.add(BarraProgesoViajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 170, 20));

        BarraProgesoAlimentacion.setMaximum(10);
        BarraProgesoAlimentacion.setBorder(null);
        BarraProgesoAlimentacion.setString("0");
        jPanel1.add(BarraProgesoAlimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 170, 20));

        BarraProgesoRopa.setMaximum(10);
        BarraProgesoRopa.setBorder(null);
        BarraProgesoRopa.setString("0");
        jPanel1.add(BarraProgesoRopa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 170, 20));

        BarraProgesoElectronica.setMaximum(10);
        BarraProgesoElectronica.setBorder(null);
        BarraProgesoElectronica.setString("0");
        jPanel1.add(BarraProgesoElectronica, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 170, 20));

        BarraProgesoHogar.setMaximum(10);
        BarraProgesoHogar.setBorder(null);
        BarraProgesoHogar.setString("0");
        jPanel1.add(BarraProgesoHogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 170, 20));

        BarraProgesoBelleza.setMaximum(10);
        BarraProgesoBelleza.setBorder(null);
        BarraProgesoBelleza.setString("0");
        jPanel1.add(BarraProgesoBelleza, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 170, 20));

        BarraProgesoLectura.setMaximum(10);
        BarraProgesoLectura.setBorder(null);
        BarraProgesoLectura.setString("0");
        jPanel1.add(BarraProgesoLectura, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 170, 20));

        BarraProgesoEntretenimiento.setMaximum(10);
        BarraProgesoEntretenimiento.setBorder(null);
        BarraProgesoEntretenimiento.setString("0");
        jPanel1.add(BarraProgesoEntretenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 170, 20));

        BarraProgesoDeportes.setMaximum(10);
        BarraProgesoDeportes.setBorder(null);
        BarraProgesoDeportes.setString("0");
        jPanel1.add(BarraProgesoDeportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 170, 20));

        txtRFC.setBackground(new java.awt.Color(0, 165, 159));
        txtRFC.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtRFC.setForeground(new java.awt.Color(51, 51, 51));
        txtRFC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRFC.setText("Ingresa tu RFC");
        txtRFC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtRFC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtRFCMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtRFCMousePressed(evt);
            }
        });
        jPanel1.add(txtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 160, 30));

        lblIngresarRFC.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIngresarRFC.setForeground(new java.awt.Color(255, 255, 255));
        lblIngresarRFC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngresarRFC.setText("Ingresar");
        lblIngresarRFC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIngresarRFCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIngresarRFCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIngresarRFCMouseExited(evt);
            }
        });
        jPanel1.add(lblIngresarRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 70, 30));

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon("C:\\Users\\ORTIZMURILLOMIGUELAN\\Downloads\\BONANZA\\LogoBonanza.png")); // NOI18N
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, -120, -1, 190));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Alimentación");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, 20));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ropa");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 20));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Electrónica");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 140, 20));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hogar");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 140, 20));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Belleza");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 140, 20));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Entretenimiento");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 140, 20));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Deportes");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 140, 20));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Lectura");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 140, 20));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Viajes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 140, 20));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\ORTIZMURILLOMIGUELAN\\Downloads\\BONANZA\\house.png")); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 40, -1));

        lblFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\ORTIZMURILLOMIGUELAN\\Downloads\\BONANZA\\FONDO CONSUMO CATEGORIAS.png")); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, 430, 540));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tblCategoriasConsumo.setBackground(new java.awt.Color(204, 204, 204));
        tblCategoriasConsumo.setForeground(new java.awt.Color(51, 51, 51));
        tblCategoriasConsumo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"
            }
        ));
        jScrollPane1.setViewportView(tblCategoriasConsumo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 10, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblIngresarRFCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresarRFCMouseEntered
        lblIngresarRFC.setForeground(Color.gray);
    }//GEN-LAST:event_lblIngresarRFCMouseEntered

    private void lblIngresarRFCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresarRFCMouseExited
        lblIngresarRFC.setForeground(Color.white);
    }//GEN-LAST:event_lblIngresarRFCMouseExited

    private void txtRFCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRFCMousePressed
        if (txtRFC.getText().equals("Ingresa tu RFC")){
       txtRFC.setText("");
       txtRFC.setForeground(Color.white);} // fin if
    }//GEN-LAST:event_txtRFCMousePressed

    private void txtRFCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRFCMouseExited
        if (txtRFC.getText().isEmpty()){ 
        txtRFC.setText("Ingresa tu RFC");
        txtRFC.setForeground(new Color(51,51,51));}
    }//GEN-LAST:event_txtRFCMouseExited

    private void lblIngresarRFCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresarRFCMouseClicked
        consultaConsumos();
        ObtenerValores();
    }//GEN-LAST:event_lblIngresarRFCMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        HOME Home = new HOME();
        Home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MODULO_CATEGORIAS_CONSUMO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarraProgesoAlimentacion;
    private javax.swing.JProgressBar BarraProgesoBelleza;
    private javax.swing.JProgressBar BarraProgesoDeportes;
    private javax.swing.JProgressBar BarraProgesoElectronica;
    private javax.swing.JProgressBar BarraProgesoEntretenimiento;
    private javax.swing.JProgressBar BarraProgesoHogar;
    private javax.swing.JProgressBar BarraProgesoLectura;
    private javax.swing.JProgressBar BarraProgesoRopa;
    private javax.swing.JProgressBar BarraProgesoViajes;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackHome;
    private javax.swing.JLabel lblBackHome1;
    private javax.swing.JLabel lblBackHome2;
    private javax.swing.JLabel lblBackHome3;
    private javax.swing.JLabel lblBackHome4;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIngresarRFC;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblCategoriasConsumo;
    private javax.swing.JTextField txtRFC;
    // End of variables declaration//GEN-END:variables
}
