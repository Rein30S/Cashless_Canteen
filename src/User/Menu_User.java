/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Login.LoginPage;
import static User.user_login.saldo;

/**
 *
 * @author ASUS
 */
public class Menu_User extends javax.swing.JFrame {

    /**
     * Creates new form Menu_User
     */
    public Menu_User() {
        initComponents();
        
        int balance = user_login.getsaldo();
        String balanceS = Integer.toString(balance);
        
        String saldo1 = Integer.toString(saldo);
        tm_saldo.setText(balanceS);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_topup = new javax.swing.JLabel();
        btn_pesan = new javax.swing.JLabel();
        tm_saldo = new javax.swing.JLabel();
        btn_logout = new javax.swing.JLabel();
        btn_close = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_topup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_topupMouseClicked(evt);
            }
        });
        getContentPane().add(btn_topup, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 250, 250));

        btn_pesan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pesanMouseClicked(evt);
            }
        });
        getContentPane().add(btn_pesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 284, 250, 250));

        tm_saldo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tm_saldo.setText("0");
        getContentPane().add(tm_saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 86, 130, 40));

        btn_logout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_logout.setText("LOGOUT");
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });
        getContentPane().add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 80, 30));

        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 10, 40, 40));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User/Menu Page.png"))); // NOI18N
        BG.setNextFocusableComponent(this);
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(916, 656));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        // TODO add your handling code here:
        LoginPage lp = new LoginPage();
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_logoutMouseClicked

    private void btn_topupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_topupMouseClicked
        // TODO add your handling code here:
        Menu_TopUp tp = new Menu_TopUp();
        tp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_topupMouseClicked

    private void btn_pesanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pesanMouseClicked
        // TODO add your handling code here:
        Menu_Pilih_Kantin pk = new Menu_Pilih_Kantin();
        pk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_pesanMouseClicked

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_closeMouseClicked

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
            java.util.logging.Logger.getLogger(Menu_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JLabel btn_pesan;
    private javax.swing.JLabel btn_topup;
    private javax.swing.JLabel tm_saldo;
    // End of variables declaration//GEN-END:variables
}
