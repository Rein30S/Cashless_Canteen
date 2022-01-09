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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

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
    
    public Detail_Riwayat_Pesanan() {
        initComponents();
        koneksi DB = new koneksi();
        DB.config();
        con = DB.conn;
        stm = DB.stm;
    }
    
    public void tampil_data(String id_pembelian, String nama_user){
        DefaultTableModel table_data = new DefaultTableModel();
        table_data.addColumn("Id Transaksi");
        table_data.addColumn("Nama Pemesan");
        table_data.addColumn("Nama Menu");
        table_data.addColumn("Jumlah");
        table_data.addColumn("Total");
        table_data.addColumn("Status");
        tbl_pesanan.setModel(table_data);
        
        try{
            rs = stm.executeQuery("SELECT t.id_transaksi, pl.nama_pelanggan, m.nama_menu, dp.jumlah, dp.subtotal, t.status FROM pembelian p"
                    + " JOIN toko tk ON tk.id_toko = p.id_toko"
                    + " JOIN transaksi t ON t.id_transaksi = p.id_transaksi"
                    + " JOIN user u ON u.id_user = t.id_user"
                    + " JOIN pelanggan pl ON pl.id_user = u.id_user"
                    + " JOIN detail_pembelian dp ON dp.id_pembelian = p.id_pembelian"
                    + " JOIN menu m ON m.id_menu = dp.id_menu"
                    + " WHERE t.id_transaksi = '" + id_pembelian + "'");
                    
            while (rs.next()){
                Object[] data = new Object[6];
                data[0] = rs.getString("id_transaksi");
                data[1] = rs.getString("nama_pelanggan");
                data[2] = rs.getString("nama_menu");
                data[3] = rs.getString("jumlah");
                data[4] = rs.getString("subtotal");
                data[5] = rs.getString("status");
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
        btn_close = new javax.swing.JLabel();
        btn_back = new javax.swing.JLabel();
        btn_cetak = new javax.swing.JLabel();
        txt_status = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        txt_jumlah = new javax.swing.JTextField();
        txt_menu = new javax.swing.JTextField();
        txt_pemesan = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
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

        txt_jumlah.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_jumlah.setBorder(null);
        txt_jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jumlahActionPerformed(evt);
            }
        });
        getContentPane().add(txt_jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 228, 155, -1));

        txt_menu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_menu.setBorder(null);
        txt_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_menuActionPerformed(evt);
            }
        });
        getContentPane().add(txt_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 319, 155, -1));

        txt_pemesan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_pemesan.setBorder(null);
        getContentPane().add(txt_pemesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 274, 155, -1));

        txt_id.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_id.setBorder(null);
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 228, 155, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Toko/Detail_Riwayat_Pesanan.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        setSize(new java.awt.Dimension(900, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_menuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_menuActionPerformed

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

    private void txt_jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jumlahActionPerformed

    private void btn_cetakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cetakMouseClicked
        // TODO add your handling code here:
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_pesanan;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_jumlah;
    private javax.swing.JTextField txt_menu;
    private javax.swing.JTextField txt_pemesan;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
