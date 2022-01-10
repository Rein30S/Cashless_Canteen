/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toko;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

/**
 *
 * @author ASUS
 */
public class Detail_Riwayat_Pesanan extends javax.swing.JFrame {

    /**
     * Creates new form Detail_Riwayat_Pesanan
     */
    Connection con;
    Statement stm;
    ResultSet rs;
    String sql;
    String id_transaksi, status, email, nama, nama_toko;
    public Detail_Riwayat_Pesanan() {
        initComponents();
        koneksi DB = new koneksi();
        DB.config();
        con = DB.conn;
        stm = DB.stm;
    }
    
    public void tampil_data(String id_transaksi){
        DefaultTableModel table_data = new DefaultTableModel();
        table_data.addColumn("ID Menu");
        table_data.addColumn("Nama Menu");
        table_data.addColumn("Harga");
        table_data.addColumn("Jumlah Pesanan");
        table_data.addColumn("Total");
        tbl_pesanan.setModel(table_data);
        
        try{
            rs = stm.executeQuery("SELECT * FROM user INNER JOIN toko ON user.id_user = toko.id_user WHERE user.id_user = '"+toko_login.getId_user()+"'");
            rs.next();
            this.nama_toko = rs.getString("nama_toko");
            rs = stm.executeQuery("SELECT * FROM transaksi INNER JOIN user ON transaksi.id_user = user.id_user INNER JOIN pelanggan ON user.id_user = pelanggan.id_user INNER JOIN pembelian ON transaksi.id_transaksi = pembelian.id_transaksi INNER JOIN toko ON pembelian.id_toko = toko.id_toko WHERE transaksi.id_transaksi = '"+id_transaksi+"'");
            rs.next();
            tf_id_transaksi.setText(rs.getString("id_transaksi"));
            this.id_transaksi = id_transaksi;
            txt_username.setText(rs.getString("username"));
            this.email = rs.getString("username");
            txt_pemesan.setText(rs.getString("nama_pelanggan"));
            this.nama = rs.getString("nama_pelanggan");
            txt_waktu.setText(rs.getString("status_change_time"));
            txt_total.setText(String.valueOf(-rs.getInt("total_transaksi")));
            txt_status.setText(rs.getString("status"));
            this.status = rs.getString("status");
            
            rs = stm.executeQuery("SELECT * FROM transaksi INNER JOIN pembelian ON transaksi.id_transaksi = pembelian.id_transaksi INNER JOIN detail_pembelian ON pembelian.id_pembelian = detail_pembelian.id_pembelian INNER JOIN menu ON detail_pembelian.id_menu = menu.id_menu WHERE transaksi.id_transaksi = '"+id_transaksi+"'");
                    
            while (rs.next()){
                Object[] data = new Object[5];
                data[0] = rs.getString("id_menu");
                data[1] = rs.getString("nama_menu");
                data[2] = rs.getString("harga_satuan");
                data[3] = rs.getString("jumlah");
                data[4] = rs.getString("subtotal");
                table_data.addRow(data);
                tbl_pesanan.setModel(table_data);
            }
        } catch (SQLException e){
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_pesanan = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_close = new javax.swing.JLabel();
        btn_back = new javax.swing.JLabel();
        btn_cetak = new javax.swing.JLabel();
        txt_status = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        txt_waktu = new javax.swing.JTextField();
        txt_pemesan = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        tf_id_transaksi = new javax.swing.JTextField();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_pesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_pesanan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tbl_pesanan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 780, 130));

        jLabel4.setText("Total Transaksi");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, -1));

        jLabel2.setText("Email Pemesan");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel3.setText("Nama Pemesan");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jLabel1.setText("Waktu Perubahan");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        btn_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 40, 40));

        btn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 40, 40));

        btn_cetak.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cetak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cetakMouseClicked(evt);
            }
        });
        getContentPane().add(btn_cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 489, 130, 40));

        txt_status.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_status.setBorder(null);
        getContentPane().add(txt_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 319, 155, -1));

        txt_total.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_total.setBorder(null);
        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });
        getContentPane().add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 273, 155, -1));

        txt_waktu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_waktu.setBorder(null);
        txt_waktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_waktuActionPerformed(evt);
            }
        });
        getContentPane().add(txt_waktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 228, 155, -1));

        txt_pemesan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_pemesan.setBorder(null);
        txt_pemesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pemesanActionPerformed(evt);
            }
        });
        getContentPane().add(txt_pemesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 319, 155, -1));

        txt_username.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_username.setBorder(null);
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 274, 155, -1));

        tf_id_transaksi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tf_id_transaksi.setBorder(null);
        getContentPane().add(tf_id_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 228, 155, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Toko/Detail_Riwayat_Pesanan.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        setSize(new java.awt.Dimension(900, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_pemesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pemesanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pemesanActionPerformed

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_closeMouseClicked

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        // TODO add your handling code here:
        Riwayat_Pesanan_Toko r = new Riwayat_Pesanan_Toko();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backMouseClicked

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalActionPerformed

    private void txt_waktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_waktuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_waktuActionPerformed

    private void btn_cetakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cetakMouseClicked
        // TODO add your handling code here:
        if(status.equals("Berhasil")){
            try{
                // Report PDF
                String jrxmlFile = "src/Report/detail_pembelian_toko.jrxml";
                HashMap param = new HashMap();
                param.put("ID_TRANSAKSI", this.id_transaksi);
                param.put("EMAIL", this.email);
                param.put("NAMA_PLG", this.nama);
                param.put("EMAIL_TOKO", toko_login.getUsername());
                param.put("NAMA_TOKO", this.nama_toko);
                param.put("TOTAL_TRANSAKSI", txt_total.getText());
                JasperReport jspR = JasperCompileManager.compileReport(jrxmlFile);
                JasperPrint JPrint = JasperFillManager.fillReport(jspR, param, con);
                String dest = "src/Report/detail_pembelian_toko_"+this.id_transaksi+".pdf";
                JasperExportManager.exportReportToPdfFile(JPrint, dest);
                // End Report PDF
                JOptionPane.showMessageDialog(null, "File berhasil di-generate");
            }catch(JRException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Untuk mencetak detail pembelian, status pembelian harus berhasil!");
        }
    }//GEN-LAST:event_btn_cetakMouseClicked

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
            java.util.logging.Logger.getLogger(Detail_Riwayat_Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Detail_Riwayat_Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Detail_Riwayat_Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Detail_Riwayat_Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Detail_Riwayat_Pesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel btn_back;
    private javax.swing.JLabel btn_cetak;
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_pesanan;
    private javax.swing.JTextField tf_id_transaksi;
    private javax.swing.JTextField txt_pemesan;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_username;
    private javax.swing.JTextField txt_waktu;
    // End of variables declaration//GEN-END:variables
}
