/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author ASUS
 */
public class RegisterPage extends javax.swing.JFrame {

    /**
     * Creates new form RegisterPage
     */
    public RegisterPage() {
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

        ClearButton = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JLabel();
        CloseButton = new javax.swing.JLabel();
        BackButton = new javax.swing.JLabel();
        Alamat = new javax.swing.JTextField();
        Perem = new javax.swing.JRadioButton();
        LK = new javax.swing.JRadioButton();
        Nama_Lengkap = new javax.swing.JTextField();
        Pegawai = new javax.swing.JRadioButton();
        Dosen = new javax.swing.JRadioButton();
        Mhs = new javax.swing.JRadioButton();
        Notelp = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        Username = new javax.swing.JTextField();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ClearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(ClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 100, 40));

        SubmitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(SubmitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 100, 40));

        CloseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(CloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 10, 23, 23));

        BackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 23, 23));

        Alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlamatActionPerformed(evt);
            }
        });
        getContentPane().add(Alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 180, -1));

        Perem.setOpaque(false);
        getContentPane().add(Perem, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 297, -1, -1));

        LK.setOpaque(false);
        getContentPane().add(LK, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 297, -1, -1));

        Nama_Lengkap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nama_LengkapActionPerformed(evt);
            }
        });
        getContentPane().add(Nama_Lengkap, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 180, -1));

        Pegawai.setOpaque(false);
        getContentPane().add(Pegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 474, -1, -1));

        Dosen.setOpaque(false);
        getContentPane().add(Dosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 436, -1, -1));

        Mhs.setOpaque(false);
        getContentPane().add(Mhs, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 401, -1, -1));

        Notelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotelpActionPerformed(evt);
            }
        });
        getContentPane().add(Notelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 180, -1));
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 180, -1));

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 180, -1));
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 180, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Register Page.png"))); // NOI18N
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

    private void AlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlamatActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

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
    private javax.swing.JTextField Alamat;
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
    private javax.swing.JTextField Username;
    // End of variables declaration//GEN-END:variables
}
