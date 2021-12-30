/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Cursor;
import javax.swing.ImageIcon;

/**
 *
 * @author E.B.A.X. Company
 */
public class Cars_on_sale extends javax.swing.JFrame {

    /**
     * Creates new form Home_Data
     */
    public Cars_on_sale() {
        this.setResizable(false);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnlHonda = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnhonda = new javax.swing.JButton();
        pnlFerrari = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnferrari = new javax.swing.JButton();
        pnlTesla = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btntesla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8-car-dealership-building-64.png"))); // NOI18N
        jLabel15.setText("Cars on Sale");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8-back-arrow-40.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });

        exit.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 0, 0));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_delete_20px.png"))); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 623, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel15))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHonda.setBackground(new java.awt.Color(45, 118, 232));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_honda_100px_1.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Honda Civic");

        btnhonda.setBackground(new java.awt.Color(255, 255, 255));
        btnhonda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnhonda.setForeground(new java.awt.Color(45, 118, 232));
        btnhonda.setText("Click for the transactions");
        btnhonda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnhonda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhondaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHondaLayout = new javax.swing.GroupLayout(pnlHonda);
        pnlHonda.setLayout(pnlHondaLayout);
        pnlHondaLayout.setHorizontalGroup(
            pnlHondaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHondaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnhonda, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHondaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlHondaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );
        pnlHondaLayout.setVerticalGroup(
            pnlHondaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHondaLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnhonda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(pnlHonda, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 190));

        pnlFerrari.setBackground(new java.awt.Color(45, 118, 232));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_ferrari_100px.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ferrari SF90");

        btnferrari.setBackground(new java.awt.Color(255, 255, 255));
        btnferrari.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnferrari.setForeground(new java.awt.Color(45, 118, 232));
        btnferrari.setText("Click for the transactions");
        btnferrari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnferrari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnferrariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFerrariLayout = new javax.swing.GroupLayout(pnlFerrari);
        pnlFerrari.setLayout(pnlFerrariLayout);
        pnlFerrariLayout.setHorizontalGroup(
            pnlFerrariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFerrariLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnferrari, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFerrariLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFerrariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );
        pnlFerrariLayout.setVerticalGroup(
            pnlFerrariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFerrariLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnferrari)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(pnlFerrari, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, 190));

        pnlTesla.setBackground(new java.awt.Color(45, 118, 232));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_tesla_100px.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Tesla Model S");

        btntesla.setBackground(new java.awt.Color(255, 255, 255));
        btntesla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btntesla.setForeground(new java.awt.Color(45, 118, 232));
        btntesla.setText("Click for the transactions");
        btntesla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btntesla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnteslaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTeslaLayout = new javax.swing.GroupLayout(pnlTesla);
        pnlTesla.setLayout(pnlTeslaLayout);
        pnlTeslaLayout.setHorizontalGroup(
            pnlTeslaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTeslaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btntesla, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTeslaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTeslaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );
        pnlTeslaLayout.setVerticalGroup(
            pnlTeslaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTeslaLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btntesla)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(pnlTesla, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered

    }//GEN-LAST:event_jLabel1MouseEntered
 int xx,xy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
        this.setCursor(Cursor.MOVE_CURSOR);
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
       int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
        this.setCursor(Cursor.MOVE_CURSOR);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
         new SuretoExit().setVisible(true);
    }//GEN-LAST:event_exitMousePressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        this.setCursor(Cursor.DEFAULT_CURSOR);       
    }//GEN-LAST:event_jPanel1MouseReleased

    private void btnhondaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhondaActionPerformed
        new CarInfo().setVisible(true);
        this.setVisible(false);
        CarInfo.lblBrand.setText("Honda");
        CarInfo.lblCaseType.setText("Hatchback");
        CarInfo.lblEngineType.setText("4 Cylinder Inline VTEC Turbo");        
        CarInfo.lblVehicleType.setText("R Class");                
        CarInfo.lblProductionDate.setText("2020");                       
        CarInfo.lblEnginePower.setText("315");                                
        CarInfo.lblEngineCapacity.setText("2000");                                        
        CarInfo.lblFuelType.setText("Gasoline");
        CarInfo.lblGearbox.setText("6 Gear Manual");
        CarInfo.lblColor.setText("White");
        //CarInfo.lblID.setText("002");
        CarInfo.jLabel18.setVisible(true);
        CarInfo.lblHeadline.setText("Honda Civic Type R");
        ImageIcon hondacar = new ImageIcon("hondatyper.png");
        ImageIcon hondaicon = new ImageIcon("hondaIcon.png"); 
        CarInfo.lblIconBrand.setIcon(hondaicon);
        CarInfo.lblIconCarPhoto.setIcon(hondacar);
        
    }//GEN-LAST:event_btnhondaActionPerformed

    private void btnferrariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnferrariActionPerformed
        new CarInfo().setVisible(true);
       this.setVisible(false);
       CarInfo.jLabel18.setVisible(true);
    }//GEN-LAST:event_btnferrariActionPerformed

    private void btnteslaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnteslaActionPerformed
        new CarInfo().setVisible(true);
        this.setVisible(false);
        
        CarInfo.lblBrand.setText("Tesla");
        CarInfo.lblCaseType.setText("Sedan");
        CarInfo.lblEngineType.setText("2 Electrical Engines");        
        CarInfo.lblVehicleType.setText("S Class");                
        CarInfo.lblProductionDate.setText("2021");                       
        CarInfo.lblEnginePower.setText("825");                                
        CarInfo.lblEngineCapacity.setText("No Combustion Chamber");
        CarInfo.jLabel18.setVisible(false);
        CarInfo.lblFuelType.setText("Electric");
        CarInfo.lblGearbox.setText("1 Gear CVT");
        CarInfo.lblColor.setText("Black");
        //CarInfo.lblID.setText("002");
        CarInfo.lblHeadline.setText("Tesla Model S Plaid");
        ImageIcon teslacar = new ImageIcon("TeslaCar.png");
        ImageIcon teslaicon = new ImageIcon("teslaIcon.png"); 
        CarInfo.lblIconBrand.setIcon(teslaicon);
        CarInfo.lblIconCarPhoto.setIcon(teslacar);
    }//GEN-LAST:event_btnteslaActionPerformed

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
            java.util.logging.Logger.getLogger(Cars_on_sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cars_on_sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cars_on_sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cars_on_sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cars_on_sale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnferrari;
    private javax.swing.JButton btnhonda;
    private javax.swing.JButton btntesla;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel pnlFerrari;
    public static javax.swing.JPanel pnlHonda;
    public static javax.swing.JPanel pnlTesla;
    // End of variables declaration//GEN-END:variables
}
