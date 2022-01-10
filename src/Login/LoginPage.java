/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Admin.Menu_Admin;
import Admin.admin_login;
import Toko.Menu_Toko;
import Toko.toko_login;
import User.Menu_User;
import User.user_login;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import koneksi.koneksi;

/**
 *
 * @author ASUS
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    Connection conn;
    Statement stm;
    ResultSet rs;
    ResultSet rsp;
    static String Session = "";
    public static String Session(){return Session;}
    
    public LoginPage() {
        initComponents();
        koneksi DB = new koneksi();
        DB.config();
        conn = DB.conn;
        stm = DB.stm;
        UserText.setBackground(new Color(0, 0, 0, 0));
        PassText.setBackground(new Color(0, 0, 0, 0));
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
        SignUp = new javax.swing.JLabel();
        LoginButton = new javax.swing.JLabel();
        PassText = new javax.swing.JPasswordField();
        UserText = new javax.swing.JTextField();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 7, 25, 25));

        SignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpMouseClicked(evt);
            }
        });
        getContentPane().add(SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 60, 20));

        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 455, 220, 55));

        PassText.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        PassText.setBorder(null);
        getContentPane().add(PassText, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 260, 30));

        UserText.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        UserText.setBorder(null);
        UserText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        UserText.setHighlighter(null);
        UserText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTextActionPerformed(evt);
            }
        });
        getContentPane().add(UserText, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 295, 260, 30));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login Page.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UserTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserTextActionPerformed

    private void SignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpMouseClicked
        // TODO add your handling code here:
        RegisterPage rp = new RegisterPage();
        rp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SignUpMouseClicked

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
        // TODO add your handling code here:
        try{
            String username = UserText.getText();
            String password = PassText.getText();
            
            rs = stm.executeQuery("SELECT * FROM user WHERE username = '"+username+"' AND password='"+password+"' AND isDelete = '0'");
            
            if(rs.next()){
                String level = rs.getString("level");
                if(level.equals("Admin")){
                    admin_login.setId_user(Integer.parseInt(rs.getString("id_user")));
                    admin_login.setUsername(username);
                    Menu_Admin a = new Menu_Admin();
                    a.setVisible(true);
                    this.dispose();
                }else if(level.equals("Toko")){
                    toko_login.setId_user(Integer.parseInt(rs.getString("id_user")));
                    toko_login.setSaldo(Integer.parseInt(rs.getString("saldo")));
                    toko_login.setUsername(username);
                    Menu_Toko t = new Menu_Toko();
                    t.setVisible(true);
                    this.dispose();
                }else if(level.equals("Pelanggan")){
                    user_login.setusername(rs.getString("username"));
                    user_login.setId_user(rs.getString("id_user"));
                    user_login.setsaldo(rs.getInt("saldo"));
                    Session = UserText.getText();
                    Menu_User m = new Menu_User();
                    m.setVisible(true);
                    this.dispose();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Maaf, kombinasi username dan password Anda salah");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_LoginButtonMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel LoginButton;
    private javax.swing.JPasswordField PassText;
    private javax.swing.JLabel SignUp;
    private javax.swing.JTextField UserText;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
