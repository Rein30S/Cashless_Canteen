/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

/**
 *
 * @author handy
 */
public class Detail_Pembelian extends javax.swing.JFrame {

    /**
     * Creates new form Detail_Pembelian
     */
    Connection conn;
    Statement stm;
    ResultSet rs;
    int id_transaksi;
    public Detail_Pembelian() {
        initComponents();
        koneksi DB = new koneksi();
        DB.config();
        conn = DB.conn;
        stm = DB.stm;
    }
    
    public void setData(int idTransaksi){
        this.id_transaksi = idTransaksi;
        try{
            rs = stm.executeQuery("SELECT * FROM transaksi INNER JOIN user ON transaksi.id_user = user.id_user INNER JOIN pembelian ON transaksi.id_transaksi = pembelian.id_transaksi INNER JOIN toko ON pembelian.id_toko = toko.id_toko WHERE transaksi.id_transaksi = '"+id_transaksi+"'");
            rs.next();
            lbIdTransaksi.setText(rs.getString("id_transaksi"));
            lbEmail.setText(rs.getString("username"));
            lbTotal.setText(rs.getString("total_transaksi"));
            lbWaktu.setText(rs.getString("waktu_transaksi"));
            lbStatus.setText(rs.getString("status"));
            lbWaktuPerubahan.setText(rs.getString("status_change_time"));
            lbIdToko.setText(rs.getString("id_toko"));
            lbNamaToko.setText(rs.getString("nama_toko"));
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID Menu");
            model.addColumn("Nama Menu");
            model.addColumn("Harga");
            model.addColumn("Jumlah Pesanan");
            model.addColumn("Total");
            tabelMenu.setModel(model);
            
            rs = stm.executeQuery("SELECT * FROM transaksi INNER JOIN pembelian ON transaksi.id_transaksi = pembelian.id_transaksi INNER JOIN detail_pembelian ON pembelian.id_pembelian = detail_pembelian.id_pembelian INNER JOIN menu ON detail_pembelian.id_menu = menu.id_menu WHERE transaksi.id_transaksi = '"+id_transaksi+"'");
            while(rs.next()){
                Object[] data = new Object[5];
                data[0] = rs.getString("id_menu");
                data[1] = rs.getString("nama_menu");
                data[2] = rs.getString("harga_satuan");
                data[3] = rs.getString("jumlah");
                data[4] = rs.getString("subtotal");
                model.addRow(data);
                tabelMenu.setModel(model);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMenu = new javax.swing.JTable();
        btn_close = new javax.swing.JLabel();
        btn_back = new javax.swing.JLabel();
        lbIdTransaksi = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        lbWaktu = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        lbWaktuPerubahan = new javax.swing.JLabel();
        lbIdToko = new javax.swing.JLabel();
        lbNamaToko = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Menu", "Nama Menu", "Harga", "Jumlah Pesanan", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelMenu);
        if (tabelMenu.getColumnModel().getColumnCount() > 0) {
            tabelMenu.getColumnModel().getColumn(0).setResizable(false);
            tabelMenu.getColumnModel().getColumn(1).setResizable(false);
            tabelMenu.getColumnModel().getColumn(2).setResizable(false);
            tabelMenu.getColumnModel().getColumn(3).setResizable(false);
            tabelMenu.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 780, 150));

        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(855, 15, 30, 30));

        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 40, 40));

        lbIdTransaksi.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbIdTransaksi.setText("jLabel13");
        getContentPane().add(lbIdTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 223, 180, -1));

        lbEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbEmail.setText("jLabel14");
        getContentPane().add(lbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 265, 180, -1));

        lbTotal.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbTotal.setText("jLabel15");
        getContentPane().add(lbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 305, 180, -1));

        lbWaktu.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbWaktu.setText("jLabel16");
        getContentPane().add(lbWaktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 347, 180, -1));

        lbStatus.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbStatus.setText("jLabel18");
        getContentPane().add(lbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 223, 145, -1));

        lbWaktuPerubahan.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbWaktuPerubahan.setText("jLabel19");
        getContentPane().add(lbWaktuPerubahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 266, 145, -1));

        lbIdToko.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbIdToko.setText("jLabel20");
        getContentPane().add(lbIdToko, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 305, 145, -1));

        lbNamaToko.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbNamaToko.setText("jLabel21");
        getContentPane().add(lbNamaToko, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 347, 145, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Admin/Detail Pembelian.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        setSize(new java.awt.Dimension(900, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_closeMouseClicked

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        // TODO add your handling code here:
        List_Transaksi lt = new List_Transaksi();
        lt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backMouseClicked

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
            java.util.logging.Logger.getLogger(Detail_Pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Detail_Pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Detail_Pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Detail_Pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Detail_Pembelian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_back;
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbIdToko;
    private javax.swing.JLabel lbIdTransaksi;
    private javax.swing.JLabel lbNamaToko;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel lbWaktu;
    private javax.swing.JLabel lbWaktuPerubahan;
    private javax.swing.JTable tabelMenu;
    // End of variables declaration//GEN-END:variables
}
