/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toko;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

/**
 *
 * @author ASUS
 */
public class Detail_Konfirmasi_Pesanan_Toko extends javax.swing.JFrame {

    /**
     * Creates new form Konfirmasi_Pesanan_Toko
     */
    Connection con;
    Statement stm;
    ResultSet rs;
    String sql;
    
    public Detail_Konfirmasi_Pesanan_Toko() {
        initComponents();
        koneksi DB = new koneksi();
        DB.config();
        con = DB.conn;
        stm = DB.stm;
    }

    public void set_data(int id, String nama){
        txt_nama1.setText(nama);
        DefaultTableModel table_data = new DefaultTableModel();
        table_data.addColumn("Id Transaksi");
        table_data.addColumn("Nama User");
        table_data.addColumn("Nama Menu");
        table_data.addColumn("Jumlah");
        table_data.addColumn("Total");
        tbl_transaksi.setModel(table_data);
        
        try{
            rs = stm.executeQuery("SELECT t.id_transaksi, m.nama_menu, dp.jumlah, t.waktu_transaksi"
                    + "FROM pembelian p"
                    + "JOIN transaksi t ON t.id_transaksi = p.id_transaksi "
                    + "JOIN detail_pembelian dp ON dp.id_pembelian = p.id_pembelian"
                    + "JOIN menu m ON m.id_menu = dp.id_menu"
                    + "JOIN user u ON u.id_user = t.id_user"
                    + "JOIN pelanggan pl ON pl.id_user = u.id_user"
                    + "WHERE p.id_toko = (SELECT id_toko FROM toko WHERE id_user = '" + toko_login.id_user + "')"
                    + "AND t.id_user = (SELECT id_user FROM pelanggan WHERE nama_pelanggan = '" + nama + "')");
            while (rs.next()){
                Object[] data = new Object[4];
                data[0] = rs.getString("id_transaksi");
                data[1] = rs.getString("nama_pelanggan");
                data[2] = rs.getString("total_transaksi");
                data[3] = rs.getString("Waktu_Transaksi");
                table_data.addRow(data);
                tbl_transaksi.setModel(table_data);
            }
            rs.close();
        }catch (SQLException e) {
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

        txt_nama1 = new javax.swing.JLabel();
        txt_id_transaksi = new javax.swing.JTextField();
        txt_nama_user = new javax.swing.JTextField();
        txt_nama_menu = new javax.swing.JTextField();
        txt_jumlah = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        txt_waktu_pesan = new javax.swing.JTextField();
        btn_terima = new javax.swing.JLabel();
        btn_tolak = new javax.swing.JLabel();
        btn_close = new javax.swing.JLabel();
        btn_back = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_transaksi = new javax.swing.JTable();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_nama1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getContentPane().add(txt_nama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 420, 50));

        txt_id_transaksi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_id_transaksi.setBorder(null);
        txt_id_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_transaksiActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 230, 220, -1));

        txt_nama_user.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_nama_user.setBorder(null);
        txt_nama_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_userActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nama_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 273, 220, -1));

        txt_nama_menu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_nama_menu.setBorder(null);
        getContentPane().add(txt_nama_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 313, 220, -1));

        txt_jumlah.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_jumlah.setBorder(null);
        getContentPane().add(txt_jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 355, 220, -1));

        txt_total.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_total.setBorder(null);
        getContentPane().add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 397, 220, -1));

        txt_waktu_pesan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_waktu_pesan.setBorder(null);
        txt_waktu_pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_waktu_pesanActionPerformed(evt);
            }
        });
        getContentPane().add(txt_waktu_pesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 439, 220, -1));

        btn_terima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_terimaMouseClicked(evt);
            }
        });
        getContentPane().add(btn_terima, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 489, 102, 37));

        btn_tolak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tolakMouseClicked(evt);
            }
        });
        getContentPane().add(btn_tolak, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 493, 100, 34));

        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 40, 40));

        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 40, 40));

        tbl_transaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Transaksi", "Nama User", "Nama Menu", "Jumlah", "Total", "Waktu Pesan"
            }
        ));
        tbl_transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_transaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_transaksi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 320, 320));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Toko/Konfirmasi Pesanan.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        setSize(new java.awt.Dimension(900, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nama_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nama_userActionPerformed

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_closeMouseClicked

    private void tbl_transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_transaksiMouseClicked
        // TODO add your handling code here:
        int baris = tbl_transaksi.rowAtPoint(evt.getPoint());
        String id_transaksi = tbl_transaksi.getValueAt(baris,0).toString();
        txt_id_transaksi.setText(id_transaksi);
        String nama_user = tbl_transaksi.getValueAt(baris, 1).toString();
        txt_nama_user.setText(nama_user);
        String nama_menu = tbl_transaksi.getValueAt(baris, 2).toString();
        txt_nama_menu.setText(nama_menu);
        String jumlah = tbl_transaksi.getValueAt(baris, 3).toString();
        txt_jumlah.setText(jumlah);
        String total = tbl_transaksi.getValueAt(baris, 4).toString();
        txt_total.setText(total);
        String waktu_pesan = tbl_transaksi.getValueAt(baris, 5).toString();
        txt_waktu_pesan.setText(waktu_pesan);
    }//GEN-LAST:event_tbl_transaksiMouseClicked

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        // TODO add your handling code here:
        Menu_Toko t = new Menu_Toko();
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backMouseClicked

    private void txt_id_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_transaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_transaksiActionPerformed

    private void txt_waktu_pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_waktu_pesanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_waktu_pesanActionPerformed

    private void btn_terimaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_terimaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_terimaMouseClicked

    private void btn_tolakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tolakMouseClicked
        // TODO add your handling code here:
        String id = txt_id_transaksi.getText();
        String nama = txt_nama_user.getText();
        String menu = txt_nama_menu.getText();
        String jumlah = txt_jumlah.getText();
        String total = txt_total.getText();
        String waktu = txt_waktu_pesan.getText();
        if(!"".equals(id) && !"".equals(nama) && !"".equals(menu) && !"".equals(jumlah) && !"".equals(total) && !"".equals(waktu)){
            try{
                PreparedStatement pstm; 
                pstm = con.prepareStatement("UPDATE transaksi set Status = 'Ditolak' "
                        + "WHERE id_transaksi = '" + txt_id_transaksi.getText() + "'", Statement.RETURN_GENERATED_KEYS);
                pstm.executeUpdate();
                rs = pstm.getGeneratedKeys();
                rs.next();
            }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }else{
            
        }
    }//GEN-LAST:event_btn_tolakMouseClicked

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
            java.util.logging.Logger.getLogger(Detail_Konfirmasi_Pesanan_Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Detail_Konfirmasi_Pesanan_Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Detail_Konfirmasi_Pesanan_Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Detail_Konfirmasi_Pesanan_Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Detail_Konfirmasi_Pesanan_Toko().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel btn_back;
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel btn_terima;
    private javax.swing.JLabel btn_tolak;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_transaksi;
    private javax.swing.JTextField txt_id_transaksi;
    private javax.swing.JTextField txt_jumlah;
    private javax.swing.JLabel txt_nama1;
    private javax.swing.JTextField txt_nama_menu;
    private javax.swing.JTextField txt_nama_user;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_waktu_pesan;
    // End of variables declaration//GEN-END:variables
}
