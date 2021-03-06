/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.Color;
import koneksi.koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import koneksi.koneksi;
/**
 *
 * @author ASUS
 */
public class RegisterPage extends javax.swing.JFrame {

    /**
     * Creates new form RegisterPage
     */
    Connection conn;
    Statement stm;
    ResultSet rs;
    
    Random random = new Random();
    public RegisterPage() {
        initComponents();
        koneksi DB = new koneksi();
        DB.config();
        conn = DB.conn;
        stm = DB.stm;
        Mhs.setSelected(true);
        LK.setSelected(true);
        Email.setBackground(new Color(0, 0, 0, 0));
        Password.setBackground(new Color(0, 0, 0, 0));
        Notelp.setBackground(new Color(0, 0, 0, 0));
        Mhs.setBackground(new Color(0, 0, 0, 0));
        Dosen.setBackground(new Color(0, 0, 0, 0));
        Pegawai.setBackground(new Color(0, 0, 0, 0));
        Nama_Lengkap.setBackground(new Color(0, 0, 0, 0));
        tanggalLahir.setBackground(new Color(0, 0, 0, 0));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        tanggalLahir = new com.toedter.calendar.JDateChooser();
        ClearButton = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JLabel();
        CloseButton = new javax.swing.JLabel();
        BackButton = new javax.swing.JLabel();
        Perem = new javax.swing.JRadioButton();
        LK = new javax.swing.JRadioButton();
        Nama_Lengkap = new javax.swing.JTextField();
        Pegawai = new javax.swing.JRadioButton();
        Dosen = new javax.swing.JRadioButton();
        Mhs = new javax.swing.JRadioButton();
        Notelp = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        Email = new javax.swing.JTextField();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(tanggalLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 290, -1));

        ClearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ClearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearButtonMouseClicked(evt);
            }
        });
        getContentPane().add(ClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 100, 40));

        SubmitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubmitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitButtonMouseClicked(evt);
            }
        });
        getContentPane().add(SubmitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 100, 40));

        CloseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseButtonMouseClicked(evt);
            }
        });
        getContentPane().add(CloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 10, 23, 23));

        BackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 23, 23));

        buttonGroup2.add(Perem);
        Perem.setOpaque(false);
        getContentPane().add(Perem, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 297, -1, -1));

        buttonGroup2.add(LK);
        LK.setOpaque(false);
        getContentPane().add(LK, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 297, -1, -1));

        Nama_Lengkap.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Nama_Lengkap.setBorder(null);
        Nama_Lengkap.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Nama_Lengkap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nama_LengkapActionPerformed(evt);
            }
        });
        getContentPane().add(Nama_Lengkap, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 212, 290, -1));

        buttonGroup1.add(Pegawai);
        Pegawai.setOpaque(false);
        getContentPane().add(Pegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 418, -1, -1));

        buttonGroup1.add(Dosen);
        Dosen.setOpaque(false);
        getContentPane().add(Dosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 380, -1, -1));

        buttonGroup1.add(Mhs);
        Mhs.setOpaque(false);
        getContentPane().add(Mhs, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 345, -1, -1));

        Notelp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Notelp.setBorder(null);
        Notelp.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Notelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotelpActionPerformed(evt);
            }
        });
        getContentPane().add(Notelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 255, 173, -1));

        Password.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Password.setBorder(null);
        Password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 212, 173, -1));

        Email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Email.setBorder(null);
        Email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 169, 173, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Register Page.png"))); // NOI18N
        BG.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(900, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NotelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NotelpActionPerformed

    private void Nama_LengkapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nama_LengkapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nama_LengkapActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void ClearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearButtonMouseClicked
        // TODO add your handling code here:
        clearMahasiswa();
    }//GEN-LAST:event_ClearButtonMouseClicked

    private void CloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseClicked
        // TODO add your handling code here:
        systemClose();
    }//GEN-LAST:event_CloseButtonMouseClicked

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        // TODO add your handling code here:
        LoginPage l = new LoginPage();
        l.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BackButtonMouseClicked

    private void SubmitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitButtonMouseClicked
        // TODO add your handling code here:
        String email = Email.getText();
        String password = Password.getText();
        String noTelp = Notelp.getText();
        String jenisJabatan = "Mahasiswa";
        if(Dosen.isSelected() == true){
            jenisJabatan = "Dosen";
        }else if(Pegawai.isSelected() == true){
            jenisJabatan = "Pegawai";
        }
        String namaLengkap = Nama_Lengkap.getText();
        String jenisKelamin = "Laki-Laki";
        if(Perem.isSelected() == true){
            jenisKelamin = "Perempuan";
        }
        
        Date date = new Date();
        date = tanggalLahir.getDate();
        String tanggal = "";
        if(date != null){
            String tampilan ="yyyy-MM-dd" ; 
            SimpleDateFormat fm = new SimpleDateFormat(tampilan); 
            tanggal = String.valueOf(fm.format(date));
        }
        
        int id = random.nextInt(Integer.MAX_VALUE);
        
        if(!"".equals(email) && !"".equals(password) && !"".equals(noTelp) && !"".equals(jenisJabatan) && !"".equals(namaLengkap) && !"".equals(jenisKelamin) && !"".equals(tanggal)){
            try{
                rs = stm.executeQuery("SELECT * FROM user WHERE username = '"+email+"'");
                
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "Maaf, email sudah digunakan");
                }else{
                    int query1 = stm.executeUpdate("INSERT INTO user VALUES('"+id+"', '"+email+"', '"+password+"', '"+0+"', 'Pelanggan', '0')");
                    int query2 = stm.executeUpdate("INSERT INTO pelanggan(id_user, nama_pelanggan, jk_pelanggan, tgl_lahir_pelanggan) VALUES('"+id+"', '"+namaLengkap+"', '"+jenisKelamin+"', '"+tanggal+"')");

                    if((query1 == 1) && (query2 == 1)){
                        JOptionPane.showMessageDialog(null, "Registrasi berhasil silahkan login untuk melanjutkan");
                        moveToLogin();
                    }else{
                        JOptionPane.showMessageDialog(null, "Registrasi gagal silahkan coba lagi!");
                        stm.executeUpdate("DELETE FROM user WHERE id_user= "+id);
                        stm.executeUpdate("DELETE FROM pelanggan WHERE id_user= "+id);
                    }   
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Semua data harus diisi terlebih dahulu!");
        }
    }//GEN-LAST:event_SubmitButtonMouseClicked
    
    private void systemClose(){
        System.exit(0);
    }
    
    private void moveToLogin(){
        LoginPage lp = new LoginPage();
        lp.setVisible(true);
        this.dispose();
    }
    
    private void clearMahasiswa(){
        Email.setText("");
        Password.setText("");
        Notelp.setText("");
        Mhs.setSelected(true);
        Nama_Lengkap.setText("");
        LK.setSelected(true);
    }
    
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
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel BackButton;
    private javax.swing.JLabel ClearButton;
    private javax.swing.JLabel CloseButton;
    private javax.swing.JRadioButton Dosen;
    private javax.swing.JTextField Email;
    private javax.swing.JRadioButton LK;
    private javax.swing.JRadioButton Mhs;
    private javax.swing.JTextField Nama_Lengkap;
    private javax.swing.JTextField Notelp;
    private javax.swing.JPasswordField Password;
    private javax.swing.JRadioButton Pegawai;
    private javax.swing.JRadioButton Perem;
    private javax.swing.JLabel SubmitButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private com.toedter.calendar.JDateChooser tanggalLahir;
    // End of variables declaration//GEN-END:variables
}
