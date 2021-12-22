/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toko;

import Login.LoginPage;
import User.user_login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class Menu_Toko extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Toko
     */
    
    Connection conn;
    Statement stm;
    ResultSet rs;
    String username;
    public Menu_Toko() {
        initComponents();
        this.username = toko_login.getUsername();
        labelUsername.setText(username);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        Btn_Pesanan = new javax.swing.JLabel();
        Btn_TarikSaldo = new javax.swing.JLabel();
        Btn_RiwayatPenjualan = new javax.swing.JLabel();
        Btn_UpdateMenu = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 110, 40));

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 40, 40));

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 150, 40));

        labelUsername.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        labelUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(labelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 220, 30));
        getContentPane().add(Btn_Pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 240, 170));

        Btn_TarikSaldo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_TarikSaldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_TarikSaldoMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_TarikSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 240, 170));
        getContentPane().add(Btn_RiwayatPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 240, 170));

        Btn_UpdateMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_UpdateMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_UpdateMenuMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_UpdateMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 240, 170));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Toko/Menu Page.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        setSize(new java.awt.Dimension(900, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        LoginPage lp = new LoginPage();
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        Pengaturan_Akun pa = new Pengaturan_Akun();
        pa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void Btn_UpdateMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_UpdateMenuMouseClicked
        // TODO add your handling code here:
        Atur_Menu am = new Atur_Menu();
        am.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_UpdateMenuMouseClicked

    private void Btn_TarikSaldoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_TarikSaldoMouseClicked
        // TODO add your handling code here:
        Menu_Saldo ms = new Menu_Saldo();
        ms.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_TarikSaldoMouseClicked

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
            java.util.logging.Logger.getLogger(Menu_Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Toko().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel Btn_Pesanan;
    private javax.swing.JLabel Btn_RiwayatPenjualan;
    private javax.swing.JLabel Btn_TarikSaldo;
    private javax.swing.JLabel Btn_UpdateMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelUsername;
    // End of variables declaration//GEN-END:variables
}
