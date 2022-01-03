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
public class Konfirmasi_Pesanan_Toko extends javax.swing.JFrame {

    /**
     * Creates new form Konfirmasi_Pesanan_Toko
     */
    Connection con;
    Statement stm;
    ResultSet rs;
    String sql;
    
    public Konfirmasi_Pesanan_Toko() {
        initComponents();
        koneksi DB = new koneksi();
        DB.config();
        con = DB.conn;
        stm = DB.stm;
        tampil_data();
    }

    private void tampil_data(){
        DefaultTableModel table_data = new DefaultTableModel();
        table_data.addColumn("Id Transaksi");
        table_data.addColumn("Nama User");
        table_data.addColumn("Nama Menu");
        table_data.addColumn("Jumlah");
        table_data.addColumn("Total");
        table_data.addColumn("Waktu Pesan");
        tbl_transaksi.setModel(table_data);
        
        try{
            rs = stm.executeQuery("SELECT t.id_transaksi, pl.nama_pelanggan, t.total_transaksi, t.waktu_transaksi"
                    + " FROM pembelian p"
                    + " JOIN transaksi t ON t.id_transaksi = p.id_transaksi "
                    + " JOIN user u ON u.id_user = t.id_user"
                    + " JOIN pelanggan pl ON pl.id_user = u.id_user"
                    + " WHERE p.id_toko = (SELECT id_toko FROM toko WHERE id_user = '" +toko_login.id_user+ "')");
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

        btn_proses = new javax.swing.JLabel();
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

        btn_proses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_prosesMouseClicked(evt);
            }
        });
        getContentPane().add(btn_proses, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 489, 102, 37));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 760, 270));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Toko/Konfirmasi Pesanan.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        setSize(new java.awt.Dimension(900, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_closeMouseClicked

    private void tbl_transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_transaksiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_transaksiMouseClicked

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        // TODO add your handling code here:
        Menu_Toko t = new Menu_Toko();
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backMouseClicked

    private void btn_prosesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prosesMouseClicked
        // TODO add your handling code here:
        if(tbl_transaksi.getSelectionModel().isSelectionEmpty() == false){
            int row = tbl_transaksi.getSelectedRow();
            int id_transaksi = Integer.parseInt(String.valueOf(tbl_transaksi.getValueAt(row, 0)));
            String nama_user = tbl_transaksi.getValueAt(row, 1).toString();
            Detail_Konfirmasi_Pesanan_Toko d = new Detail_Konfirmasi_Pesanan_Toko();
            d.set_data(id_transaksi, nama_user);
            d.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Silahkan pilih pesanan terlebih dahulu!");
        }
    }//GEN-LAST:event_btn_prosesMouseClicked

    private void btn_tolakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tolakMouseClicked
        // TODO add your handling code here:
        if(tbl_transaksi.getSelectionModel().isSelectionEmpty() == false){
            try{
                int row = tbl_transaksi.getSelectedRow();
                int id_transaksi = Integer.parseInt(String.valueOf(tbl_transaksi.getValueAt(row, 0)));
                PreparedStatement pstm; 
                pstm = con.prepareStatement("UPDATE transaksi set Status = 'Ditunda oleh Toko' "
                        + "WHERE id_transaksi = '" + id_transaksi + "'", Statement.RETURN_GENERATED_KEYS);
                pstm.executeUpdate();
                rs = pstm.getGeneratedKeys();
                rs.next();
                JOptionPane.showMessageDialog(null, "Pesanan telah ditunda");
            }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Silahkan pilih pesanan terlebih dahulu!");
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
            java.util.logging.Logger.getLogger(Konfirmasi_Pesanan_Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Konfirmasi_Pesanan_Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Konfirmasi_Pesanan_Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Konfirmasi_Pesanan_Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Konfirmasi_Pesanan_Toko().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel btn_back;
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel btn_proses;
    private javax.swing.JLabel btn_tolak;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_transaksi;
    // End of variables declaration//GEN-END:variables
}