/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toko;

import java.awt.Color;
import java.sql.Connection;
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
    int id_user;
    public Detail_Konfirmasi_Pesanan_Toko() {
        initComponents();
        koneksi DB = new koneksi();
        DB.config();
        con = DB.conn;
        stm = DB.stm;
        txt_id_transaksi.setBackground(new Color(0, 0, 0, 0));
        txt_id_pembelian.setBackground(new Color(0,0,0,0));
        txt_nama_user.setBackground(new Color(0, 0, 0, 0));
        txt_nama_menu.setBackground(new Color(0, 0, 0, 0));
        txt_jumlah.setBackground(new Color(0, 0, 0, 0));
        txt_total.setBackground(new Color(0, 0, 0, 0));
        txt_waktu_pesan.setBackground(new Color(0, 0, 0, 0));
    }

    public void set_data(String id, String nama){
        DefaultTableModel table_data = new DefaultTableModel();
        table_data.addColumn("ID Menu");
        table_data.addColumn("Nama Menu");
        table_data.addColumn("Harga");
        table_data.addColumn("Jumlah");
        table_data.addColumn("Total");
        tbl_transaksi.setModel(table_data);
        
        try{
            rs = stm.executeQuery("SELECT * FROM transaksi INNER JOIN pembelian ON transaksi.id_transaksi = pembelian.id_transaksi INNER JOIN detail_pembelian ON pembelian.id_pembelian = detail_pembelian.id_pembelian INNER JOIN menu ON detail_pembelian.id_menu = menu.id_menu WHERE transaksi.id_transaksi = '"+id+"'");
            while (rs.next()){
                Object[] data = new Object[7];
                data[0] = rs.getString("id_menu");
                data[1] = rs.getString("nama_menu");
                data[3] = rs.getString("harga_satuan");
                data[4] = rs.getString("jumlah");
                data[5] = rs.getString("subtotal");
                table_data.addRow(data);
                tbl_transaksi.setModel(table_data);
            }
            rs = stm.executeQuery("SELECT * FROM transaksi INNER JOIN pembelian ON transaksi.id_transaksi = pembelian.id_transaksi WHERE transaksi.id_transaksi = '"+id+"'");
            rs.next();
            txt_id_transaksi.setText(rs.getString("id_transaksi"));
            txt_id_pembelian.setText(rs.getString("id_pembelian"));
            txt_nama_user.setText(nama);
            txt_total.setText(String.valueOf(-rs.getInt("total_transaksi")));
            txt_waktu_pesan.setText(rs.getString("waktu_transaksi"));
            this.id_user = rs.getInt("id_user");
            
            rs.close();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    private void bersih(){
        txt_id_transaksi.setText("");
        txt_id_pembelian.setText("");
        txt_nama_user.setText("");
        txt_nama_menu.setText("");
        txt_jumlah.setText("");
        txt_total.setText("");
        txt_waktu_pesan.setText("");
    }
    
    private void kembali(){                        
        Menu_Toko t = new Menu_Toko();
        t.setVisible(true);
        this.dispose();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_id_transaksi = new javax.swing.JTextField();
        txt_id_pembelian = new javax.swing.JTextField();
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

        txt_id_transaksi.setEditable(false);
        txt_id_transaksi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_id_transaksi.setBorder(null);
        txt_id_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_transaksiActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 205, 175, -1));

        txt_id_pembelian.setEditable(false);
        txt_id_pembelian.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_id_pembelian.setBorder(null);
        txt_id_pembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_pembelianActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id_pembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 246, 175, -1));

        txt_nama_user.setEditable(false);
        txt_nama_user.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_nama_user.setBorder(null);
        txt_nama_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_userActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nama_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 288, 175, -1));

        txt_nama_menu.setEditable(false);
        txt_nama_menu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_nama_menu.setBorder(null);
        getContentPane().add(txt_nama_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 329, 175, -1));

        txt_jumlah.setEditable(false);
        txt_jumlah.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_jumlah.setBorder(null);
        txt_jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jumlahActionPerformed(evt);
            }
        });
        getContentPane().add(txt_jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 371, 175, -1));

        txt_total.setEditable(false);
        txt_total.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_total.setBorder(null);
        getContentPane().add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 413, 175, -1));

        txt_waktu_pesan.setEditable(false);
        txt_waktu_pesan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_waktu_pesan.setBorder(null);
        txt_waktu_pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_waktu_pesanActionPerformed(evt);
            }
        });
        getContentPane().add(txt_waktu_pesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 454, 175, -1));

        btn_terima.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_terima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_terimaMouseClicked(evt);
            }
        });
        getContentPane().add(btn_terima, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 491, 104, 37));

        btn_tolak.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_tolak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tolakMouseClicked(evt);
            }
        });
        getContentPane().add(btn_tolak, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 493, 100, 34));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_backMouseEntered(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 40, 40));

        tbl_transaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Menu", "Nama Menu", "Harga", "Jumlah", "Total"
            }
        ));
        tbl_transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_transaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_transaksi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 390, 320));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Toko/Detail Konfirmasi Pesanan.png"))); // NOI18N
        BG.setToolTipText("");
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
    }//GEN-LAST:event_tbl_transaksiMouseClicked

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        // TODO add your handling code here:
        kembali();
    }//GEN-LAST:event_btn_backMouseClicked

    private void txt_id_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_transaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_transaksiActionPerformed

    private void txt_waktu_pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_waktu_pesanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_waktu_pesanActionPerformed

    private void btn_terimaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_terimaMouseClicked
        // TODO add your handling code here:
        int confirmed = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin?", "Confirmation Dialog", JOptionPane.YES_NO_OPTION);
        if(confirmed == JOptionPane.YES_OPTION){
            try{
                stm.executeUpdate("UPDATE transaksi SET status = 'Berhasil' WHERE id_transaksi = '"+txt_id_transaksi.getText()+"'");
                stm.executeUpdate("UPDATE user SET saldo = saldo + '"+Integer.parseInt(txt_total.getText())+"' WHERE id_user = '"+toko_login.getId_user()+"'");
                toko_login.setSaldo(toko_login.getSaldo()+Integer.parseInt(txt_total.getText()));
                JOptionPane.showMessageDialog(null, "Transaksi berhasil disetujui");
                kembali();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btn_terimaMouseClicked

    private void btn_tolakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tolakMouseClicked
        // TODO add your handling code here:
        int confirmed = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin?", "Confirmation Dialog", JOptionPane.YES_NO_OPTION);
        if(confirmed == JOptionPane.YES_OPTION){
            try{
                stm.executeUpdate("UPDATE transaksi SET status = 'Ditolak' WHERE id_transaksi = '"+txt_id_transaksi.getText()+"'");
                stm.executeUpdate("UPDATE user SET saldo = saldo + '"+Integer.parseInt(txt_total.getText())+"' WHERE id_user = '"+this.id_user+"'");
                JOptionPane.showMessageDialog(null, "Transaksi berhasil ditolak");
                kembali();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btn_tolakMouseClicked

    private void txt_jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jumlahActionPerformed

    private void txt_id_pembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_pembelianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_pembelianActionPerformed

    private void btn_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_backMouseEntered

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
    private javax.swing.JTextField txt_id_pembelian;
    private javax.swing.JTextField txt_id_transaksi;
    private javax.swing.JTextField txt_jumlah;
    private javax.swing.JTextField txt_nama_menu;
    private javax.swing.JTextField txt_nama_user;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_waktu_pesan;
    // End of variables declaration//GEN-END:variables
}
