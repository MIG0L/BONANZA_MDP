package com.mycompany.bonanza;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MODULO_DINERO_BAJO_COLCHON extends javax.swing.JFrame {
    
CONNECTION_MODULE cn = new CONNECTION_MODULE();
DefaultTableModel InfoHistorialCrediticio = new DefaultTableModel();

int PorcentajeSlider=50; int HC=0;  String RFC; String HistorialCrediticio; int Credito = 0;float ValorGuardado =0;

    public MODULO_DINERO_BAJO_COLCHON() {
        initComponents();
        
        setLocationRelativeTo(null);
    }
    
    
    public int CalcularCredito(int HC){
        
        int Credito=0;
        
        if((HC>300)&&(HC<400))
            Credito = 3000;
        if((HC>400)&&(HC<700))
            Credito = 3000;
        if((HC>700)&&(HC<850))
            Credito = 3000;
            
        return(Credito);    
        
    }
    
    public void ObtenerValoresDB(){
        
        try {
                       
            Statement st;
            st = cn.con.createStatement();                                  
            
            RFC = (String)tblCategoriasConsumo.getValueAt(0,0);
            HistorialCrediticio = (String) tblCategoriasConsumo.getValueAt(0,1);          
            
            String sql = "Update registrohistorialcrediticio set RFC='"+RFC+"',HistorialCrediticio='"+HistorialCrediticio+"' where RFC = '"+RFC+"'";
            
            st.executeUpdate(sql);           
            
            int HC = Integer.parseInt(HistorialCrediticio);
            
            if((HC>300)&&(HC<400)){
            Credito = 3000;}
            if((HC>400)&&(HC<700)){
            Credito = 6000;}
            if((HC>700)&&(HC<850)){
            Credito = 10000;}
            
            ValorGuardado = Credito*PorcentajeSlider/100;
                    
                    //(Credito*(PorcentajeSlider/100));
            
            lblCreditoOtorgado.setText(""+Credito);
            lblDineroGuardado.setText(""+ValorGuardado);         
            
        } //try
        catch (SQLException ex) {
            Logger.getLogger(MODULO_CATEGORIAS_CONSUMO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }////////////////////
    
    
     public void consultaHistorial(){
        
       try {
            InfoHistorialCrediticio = (DefaultTableModel) tblCategoriasConsumo.getModel();
            String RFC = txtRFC.getText();
            
            Statement st =cn.con.createStatement();
            ResultSet Consulta = st.executeQuery("Select * from registrohistorialcrediticio where RFC = '"+RFC+"'");
            
            while(Consulta.next()){
                
                String [] Registro = {Consulta.getString(1),Consulta.getString(2)};
                InfoHistorialCrediticio.addRow(Registro);
                
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
        txtRFC = new javax.swing.JTextField();
        lblIngresarRFC = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblValorSlider = new javax.swing.JLabel();
        sliderPorcentajeDinero = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblDineroGuardado = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblCreditoOtorgado = new javax.swing.JLabel();
        lblBackHome = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategoriasConsumo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DINERO BAJO EL COLCHÓN");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(txtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 160, 30));

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
        jPanel1.add(lblIngresarRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 70, 30));

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon("C:\\Users\\ORTIZMURILLOMIGUELAN\\Downloads\\BONANZA\\LogoBonanza.png")); // NOI18N
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -120, -1, 190));

        lblValorSlider.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        lblValorSlider.setForeground(new java.awt.Color(255, 255, 255));
        lblValorSlider.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorSlider.setText("50 %");
        jPanel1.add(lblValorSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 340, 20));

        sliderPorcentajeDinero.setBackground(new java.awt.Color(0, 102, 102));
        sliderPorcentajeDinero.setForeground(new java.awt.Color(255, 255, 255));
        sliderPorcentajeDinero.setFocusCycleRoot(true);
        sliderPorcentajeDinero.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderPorcentajeDineroStateChanged(evt);
            }
        });
        jPanel1.add(sliderPorcentajeDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 320, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Dinero guardado:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 140, 20));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ORTIZMURILLOMIGUELAN\\Downloads\\BONANZA\\software-engineer.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 140, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Elije el % de tu dinero que quieres guardar:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 340, 20));

        lblDineroGuardado.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        lblDineroGuardado.setForeground(new java.awt.Color(255, 255, 255));
        lblDineroGuardado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblDineroGuardado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 140, 20));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Credito otorgado:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 140, 20));

        lblCreditoOtorgado.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        lblCreditoOtorgado.setForeground(new java.awt.Color(255, 255, 255));
        lblCreditoOtorgado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblCreditoOtorgado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 140, 20));

        lblBackHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBackHome.setIcon(new javax.swing.ImageIcon("C:\\Users\\ORTIZMURILLOMIGUELAN\\Downloads\\BONANZA\\house.png")); // NOI18N
        lblBackHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackHomeMouseClicked(evt);
            }
        });
        jPanel1.add(lblBackHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 40, -1));

        lblFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\ORTIZMURILLOMIGUELAN\\Downloads\\BONANZA\\FONDO DINERO BAJO COLCHON.png")); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, 420, 540));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tblCategoriasConsumo.setBackground(new java.awt.Color(204, 204, 204));
        tblCategoriasConsumo.setForeground(new java.awt.Color(51, 51, 51));
        tblCategoriasConsumo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(tblCategoriasConsumo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 10, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRFCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRFCMouseExited
        if (txtRFC.getText().isEmpty()){
            txtRFC.setText("Ingresa tu RFC");
            txtRFC.setForeground(new Color(51,51,51));}
    }//GEN-LAST:event_txtRFCMouseExited

    private void txtRFCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRFCMousePressed
        if (txtRFC.getText().equals("Ingresa tu RFC")){
            txtRFC.setText("");
            txtRFC.setForeground(Color.white);} // fin if
    }//GEN-LAST:event_txtRFCMousePressed

    private void lblIngresarRFCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresarRFCMouseClicked

        consultaHistorial();
        ObtenerValoresDB();
    }//GEN-LAST:event_lblIngresarRFCMouseClicked

    private void lblIngresarRFCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresarRFCMouseEntered
        lblIngresarRFC.setForeground(Color.gray);
    }//GEN-LAST:event_lblIngresarRFCMouseEntered

    private void lblIngresarRFCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresarRFCMouseExited
        lblIngresarRFC.setForeground(Color.white);
    }//GEN-LAST:event_lblIngresarRFCMouseExited

    private void sliderPorcentajeDineroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderPorcentajeDineroStateChanged
        
        PorcentajeSlider = sliderPorcentajeDinero.getValue();
        lblValorSlider.setText(""+PorcentajeSlider+" %");
    }//GEN-LAST:event_sliderPorcentajeDineroStateChanged

    private void lblBackHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackHomeMouseClicked
        HOME Home = new HOME();
        Home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBackHomeMouseClicked


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MODULO_DINERO_BAJO_COLCHON().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackHome;
    private javax.swing.JLabel lblCreditoOtorgado;
    private javax.swing.JLabel lblDineroGuardado;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIngresarRFC;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblValorSlider;
    private javax.swing.JSlider sliderPorcentajeDinero;
    private javax.swing.JTable tblCategoriasConsumo;
    private javax.swing.JTextField txtRFC;
    // End of variables declaration//GEN-END:variables
}
