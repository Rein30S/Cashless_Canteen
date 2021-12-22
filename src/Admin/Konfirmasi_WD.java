/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import javax.swing.JOptionPane;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

/**
 *
 * @author handy
 */
public class Konfirmasi_WD extends javax.swing.JFrame {

    /**
     * Creates new form Detail_Transaksi_DW
     */
    Connection conn;
    Statement stm;
    ResultSet rs;
    int id_transaksi;
    String status;
    int total_transaksi;
    int id_user;
    String jenis_transaksi;
    public Konfirmasi_WD() {
        initComponents();
        koneksi DB = new koneksi();
        DB.config();
        conn = DB.conn;
        stm = DB.stm;
        txt_id.setBackground(new Color(0, 0, 0, 0));
        txt_email.setBackground(new Color(0, 0, 0, 0));
        txt_jenis.setBackground(new Color(0, 0, 0, 0));
        txt_total.setBackground(new Color(0, 0, 0, 0));
        txt_waktu.setBackground(new Color(0, 0, 0, 0));
        txt_status.setBackground(new Color(0, 0, 0, 0));
        txt_waktuperubahan.setBackground(new Color(0, 0, 0, 0));
        txt_admin.setBackground(new Color(0, 0, 0, 0));
    }
    
    public void setData(int id_transaksi){
        this.id_transaksi = id_transaksi;
        
        try{
            rs = stm.executeQuery("SELECT * FROM transaksi t INNER JOIN user u ON t.ID_USER = u.ID_USER WHERE t.ID_TRANSAKSI = '"+this.id_transaksi+"'");
            rs.next();
            
            txt_id.setText(rs.getString("id_transaksi"));
            txt_jenis.setText(rs.getString("jenis_transaksi"));
            txt_status.setText(rs.getString("status"));
            if(Integer.parseInt(rs.getString("total_transaksi")) < 0){
                txt_total.setText(String.valueOf(Integer.parseInt(rs.getString("total_transaksi")) * -1));
            }else{
                txt_total.setText(rs.getString("total_transaksi"));
            }
            txt_email.setText(rs.getString("username"));
            txt_waktu.setText(rs.getString("waktu_transaksi"));
            txt_waktuperubahan.setText(rs.getString("STATUS_CHANGE_TIME"));
            this.status = rs.getString("status");
            this.id_user = rs.getInt("id_user");
            this.total_transaksi = rs.getInt("total_transaksi");
            this.jenis_transaksi = rs.getString("jenis_transaksi");
            
            rs = stm.executeQuery("SELECT * FROM transaksi t INNER JOIN konfirmasi_transaksi k ON t.ID_TRANSAKSI = k.ID_TRANSAKSI INNER JOIN user u ON k.ID_USER = u.ID_USER WHERE t.ID_TRANSAKSI = '"+this.id_transaksi+"'");
            if(rs.next()){
                txt_admin.setText(rs.getString("username"));
            }else{
                txt_admin.setText("");
            }            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_admin = new javax.swing.JTextField();
        txt_waktuperubahan = new javax.swing.JTextField();
        txt_status = new javax.swing.JTextField();
        txt_waktu = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        txt_jenis = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 40, 40));

        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 40, 40));

        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 496, 102, 33));

        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 495, 100, 34));

        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 495, 101, 35));

        txt_admin.setBorder(null);
        txt_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_adminActionPerformed(evt);
            }
        });
        getContentPane().add(txt_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 140, -1));

        txt_waktuperubahan.setBorder(null);
        txt_waktuperubahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_waktuperubahanActionPerformed(evt);
            }
        });
        getContentPane().add(txt_waktuperubahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 140, -1));

        txt_status.setBorder(null);
        txt_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_statusActionPerformed(evt);
            }
        });
        getContentPane().add(txt_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 470, 200, -1));

        txt_waktu.setBorder(null);
        txt_waktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_waktuActionPerformed(evt);
            }
        });
        getContentPane().add(txt_waktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 420, 200, -1));

        txt_total.setBorder(null);
        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });
        getContentPane().add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 370, 200, -1));

        txt_jenis.setBorder(null);
        txt_jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jenisActionPerformed(evt);
            }
        });
        getContentPane().add(txt_jenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 320, 200, -1));

        txt_email.setBorder(null);
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 270, 200, -1));

        txt_id.setBorder(null);
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 220, 200, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Admin/Konfirmasi Penarikan.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        setSize(new java.awt.Dimension(900, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        if(status.equals("Pending")){
            int confirmed = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin?", "Confirmation Dialog", JOptionPane.YES_NO_OPTION);
            
            try{
                if(confirmed == JOptionPane.YES_OPTION){
                    Calendar cal = Calendar.getInstance();
                    cal.getTime();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String currentDate = sdf.format(cal.getTime());
                    
                    stm.executeUpdate("UPDATE transaksi SET status_change_time = '"+currentDate+"', status='Berhasil' WHERE id_transaksi = '"+id_transaksi+"'");
                    stm.executeUpdate("INSERT INTO konfirmasi_transaksi(id_transaksi, id_user) VALUES('"+id_transaksi+"', '"+admin_login.getId_user()+"')");
                    
                    if("Deposit".equals(this.jenis_transaksi)){
                        stm.executeUpdate("UPDATE user SET saldo = saldo + "+total_transaksi+" WHERE id_user = '"+id_user+"'");                        
                    }
                    
                    JOptionPane.showMessageDialog(null, "Berhasil dikonfirmasi");
                    setData(id_transaksi);
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Transaksi sudah selesai");
        }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        if(status.equals("Pending")){
            int confirmed = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin?", "Confirmation Dialog", JOptionPane.YES_NO_OPTION);
            
            try{
                if(confirmed == JOptionPane.YES_OPTION){
                    Calendar cal = Calendar.getInstance();
                    cal.getTime();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String currentDate = sdf.format(cal.getTime());
                    
                    stm.executeUpdate("INSERT INTO konfirmasi_transaksi(id_transaksi, id_user) VALUES('"+id_transaksi+"', '"+admin_login.getId_user()+"')");
                    if("Withdraw".equals(this.jenis_transaksi)){
                        stm.executeUpdate("UPDATE user SET saldo = saldo + "+total_transaksi+" WHERE id_user = '"+id_user+"'");
                    }
                    stm.executeUpdate("UPDATE transaksi SET status_change_time = '"+currentDate+"', status='Ditolak' WHERE id_transaksi = '"+id_transaksi+"'");                    
                    JOptionPane.showMessageDialog(null, "Berhasil ditolak");
                    setData(id_transaksi);
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Transaksi sudah selesai");
        }
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        List_Transaksi lt = new List_Transaksi();
        lt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        if(status.equals("Berhasil")){
            try{
                // Report PDF
                String jrxmlFile = "src/Report/detail_transaksi.jrxml";
                HashMap param = new HashMap();
                param.put("ID_TRANSAKSI", String.valueOf(id_transaksi));
                JasperReport jspR = JasperCompileManager.compileReport(jrxmlFile);
                JasperPrint JPrint = JasperFillManager.fillReport(jspR, param, conn);
                String dest = "src/Report/detail_transaksi_"+id_transaksi+".pdf";
                JasperExportManager.exportReportToPdfFile(JPrint, dest);
                // End Report PDF
                JOptionPane.showMessageDialog(null, "File berhasil di-generate");
            }catch(JRException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Untuk mencetak detail transaksi, status transaksi harus berhasil!");
        }
    }//GEN-LAST:event_jLabel20MouseClicked

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jenisActionPerformed

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalActionPerformed

    private void txt_waktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_waktuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_waktuActionPerformed

    private void txt_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_statusActionPerformed

    private void txt_waktuperubahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_waktuperubahanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_waktuperubahanActionPerformed

    private void txt_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_adminActionPerformed

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
            java.util.logging.Logger.getLogger(Konfirmasi_WD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Konfirmasi_WD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Konfirmasi_WD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Konfirmasi_WD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Konfirmasi_WD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JTextField txt_admin;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_jenis;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_waktu;
    private javax.swing.JTextField txt_waktuperubahan;
    // End of variables declaration//GEN-END:variables
}
