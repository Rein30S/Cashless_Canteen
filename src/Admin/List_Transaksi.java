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
public class List_Transaksi extends javax.swing.JFrame {

    /**
     * Creates new form Detail_Transaksi
     */
    Connection conn;
    Statement stm;
    ResultSet rs;
    public List_Transaksi() {
        initComponents();
        koneksi DB = new koneksi();
        DB.config();
        conn = DB.conn;
        stm = DB.stm;
        setData(5);
    }
    
    private void setData(int kode){
        String value = tfCari.getText();
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Transaksi");
        model.addColumn("Username");
        model.addColumn("Jenis Transaksi");
        model.addColumn("Total");
        model.addColumn("Waktu");
        model.addColumn("Status");
        tabelTransaksi.setModel(model);
        
        if(kode == 1){            
            try{
                rs = stm.executeQuery("SELECT t.id_transaksi, u.username, t.jenis_transaksi, t.total_transaksi, t.waktu_transaksi, t.status FROM user u INNER JOIN transaksi t ON u.ID_USER = t.ID_USER LEFT JOIN pembelian p ON t.ID_TRANSAKSI = p.ID_TRANSAKSI LEFT JOIN toko ON p.ID_TOKO = toko.ID_TOKO LEFT JOIN user ON toko.ID_USER = user.ID_USER WHERE u.USERNAME LIKE '"+value+"' OR toko.NAMA_TOKO LIKE '"+value+"' OR user.USERNAME LIKE '"+value+"' ORDER BY waktu_transaksi DESC");
                while(rs.next()){
                    Object[] data = new Object[6];
                    data[0] = rs.getString("id_transaksi");
                    data[1] = rs.getString("username");
                    data[2] = rs.getString("jenis_transaksi");
                    data[3] = rs.getString("total_transaksi");
                    data[4] = rs.getString("waktu_transaksi");
                    data[5] = rs.getString("status");
                    model.addRow(data);
                    tabelTransaksi.setModel(model);
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }else if(kode == 2){
            try{
                rs = stm.executeQuery("SELECT t.id_transaksi, u.username, t.jenis_transaksi, t.total_transaksi, t.waktu_transaksi, t.status FROM user u INNER JOIN transaksi t ON u.ID_USER = t.ID_USER INNER JOIN pelanggan ON u.id_user = pelanggan.id_user WHERE (u.USERNAME LIKE '"+value+"' OR pelanggan.nama_pelanggan LIKE '"+value+"') AND t.JENIS_TRANSAKSI = 'Deposit' ORDER BY waktu_transaksi DESC");
                while(rs.next()){
                    Object[] data = new Object[6];
                    data[0] = rs.getString("id_transaksi");
                    data[1] = rs.getString("username");
                    data[2] = rs.getString("jenis_transaksi");
                    data[3] = rs.getString("total_transaksi");
                    data[4] = rs.getString("waktu_transaksi");
                    data[5] = rs.getString("status");
                    model.addRow(data);
                    tabelTransaksi.setModel(model);
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }            
        }else if(kode == 3){
            try{
                rs = stm.executeQuery("SELECT t.id_transaksi, u.username, t.jenis_transaksi, t.total_transaksi, t.waktu_transaksi, t.status FROM user u INNER JOIN transaksi t ON u.ID_USER = t.ID_USER INNER JOIN toko ON u.id_user = toko.id_user WHERE (u.USERNAME LIKE '"+value+"' OR toko.nama_toko LIKE '"+value+"') AND t.JENIS_TRANSAKSI = 'Withdraw' ORDER BY waktu_transaksi DESC");
                while(rs.next()){
                    Object[] data = new Object[6];
                    data[0] = rs.getString("id_transaksi");
                    data[1] = rs.getString("username");
                    data[2] = rs.getString("jenis_transaksi");
                    data[3] = rs.getString("total_transaksi");
                    data[4] = rs.getString("waktu_transaksi");
                    data[5] = rs.getString("status");
                    model.addRow(data);
                    tabelTransaksi.setModel(model);
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            } 
        }else if(kode == 4){
            try{
                rs = stm.executeQuery("SELECT t.id_transaksi, u.username, t.jenis_transaksi, t.total_transaksi, t.waktu_transaksi, t.status FROM user u INNER JOIN transaksi t ON u.ID_USER = t.ID_USER LEFT JOIN pembelian p ON t.ID_TRANSAKSI = p.ID_TRANSAKSI LEFT JOIN toko ON p.ID_TOKO = toko.ID_TOKO LEFT JOIN user ON toko.ID_USER = user.ID_USER WHERE (u.USERNAME LIKE '"+value+"' OR toko.NAMA_TOKO LIKE '"+value+"' OR user.USERNAME LIKE '"+value+"') AND t.JENIS_TRANSAKSI = 'Pembelian' ORDER BY waktu_transaksi DESC");
                while(rs.next()){
                    Object[] data = new Object[6];
                    data[0] = rs.getString("id_transaksi");
                    data[1] = rs.getString("username");
                    data[2] = rs.getString("jenis_transaksi");
                    data[3] = rs.getString("total_transaksi");
                    data[4] = rs.getString("waktu_transaksi");
                    data[5] = rs.getString("status");
                    model.addRow(data);
                    tabelTransaksi.setModel(model);
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }else if(kode == 5){
            try{
                rs = stm.executeQuery("SELECT t.id_transaksi, u.username, t.jenis_transaksi, t.total_transaksi, t.waktu_transaksi, t.status FROM user u INNER JOIN transaksi t ON u.ID_USER = t.ID_USER LEFT JOIN pembelian p ON t.ID_TRANSAKSI = p.ID_TRANSAKSI LEFT JOIN toko ON p.ID_TOKO = toko.ID_TOKO LEFT JOIN user ON toko.ID_USER = user.ID_USER ORDER BY waktu_transaksi DESC");
                while(rs.next()){
                    Object[] data = new Object[6];
                    data[0] = rs.getString("id_transaksi");
                    data[1] = rs.getString("username");
                    data[2] = rs.getString("jenis_transaksi");
                    data[3] = rs.getString("total_transaksi");
                    data[4] = rs.getString("waktu_transaksi");
                    data[5] = rs.getString("status");
                    model.addRow(data);
                    tabelTransaksi.setModel(model);
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tabelTransaksi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfCari = new javax.swing.JTextField();
        btn_setor_tunai = new javax.swing.JLabel();
        btn_penarikan = new javax.swing.JLabel();
        btn_pembelian = new javax.swing.JLabel();
        btn_detail = new javax.swing.JLabel();
        btn_cari = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabelTransaksi);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 670, 220));

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(853, 14, 33, 33));

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 554, 40, 32));

        tfCari.setBorder(null);
        tfCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCariActionPerformed(evt);
            }
        });
        getContentPane().add(tfCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 243, 570, 20));

        btn_setor_tunai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_setor_tunai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_setor_tunaiMouseClicked(evt);
            }
        });
        getContentPane().add(btn_setor_tunai, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 225, 90, 90));

        btn_penarikan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_penarikan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_penarikanMouseClicked(evt);
            }
        });
        getContentPane().add(btn_penarikan, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 90, 90));

        btn_pembelian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pembelianMouseClicked(evt);
            }
        });
        getContentPane().add(btn_pembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 416, 90, 90));

        btn_detail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_detail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_detailMouseClicked(evt);
            }
        });
        getContentPane().add(btn_detail, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 497, 107, 35));

        btn_cari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cariMouseClicked(evt);
            }
        });
        getContentPane().add(btn_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 84, 26));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Admin/Daftar Transaksi.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        setSize(new java.awt.Dimension(900, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        Menu_Admin ma = new Menu_Admin();
        ma.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btn_cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cariMouseClicked
        // TODO add your handling code here:
        setData(1);
    }//GEN-LAST:event_btn_cariMouseClicked

    private void btn_setor_tunaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_setor_tunaiMouseClicked
        // TODO add your handling code here:
        setData(2);
    }//GEN-LAST:event_btn_setor_tunaiMouseClicked

    private void btn_detailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_detailMouseClicked
        // TODO add your handling code here:
        if(tabelTransaksi.getSelectionModel().isSelectionEmpty() == false){
            int row = tabelTransaksi.getSelectedRow();
            String jenisTransaksi = String.valueOf(tabelTransaksi.getValueAt(row, 2));
            
            if(jenisTransaksi.equals("Deposit") || jenisTransaksi.equals("Withdraw")){
                Konfirmasi_WD dt = new Konfirmasi_WD();
                dt.setData(Integer.parseInt(String.valueOf(tabelTransaksi.getValueAt(row, 0))));
                dt.setVisible(true);
                this.dispose();
            }else if(jenisTransaksi.equals("Pembelian")){
                Detail_Pembelian dp = new Detail_Pembelian();
                dp.setData(Integer.parseInt(String.valueOf(tabelTransaksi.getValueAt(row, 0))));
                dp.setVisible(true);
                this.dispose();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Anda belum memilih data pada tabel!");
        }
    }//GEN-LAST:event_btn_detailMouseClicked

    private void tfCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCariActionPerformed

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseEntered

    private void btn_penarikanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_penarikanMouseClicked
        // TODO add your handling code here:
        setData(3);
    }//GEN-LAST:event_btn_penarikanMouseClicked

    private void btn_pembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pembelianMouseClicked
        // TODO add your handling code here:
        setData(4);
    }//GEN-LAST:event_btn_pembelianMouseClicked

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
            java.util.logging.Logger.getLogger(List_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(List_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(List_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(List_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new List_Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel btn_cari;
    private javax.swing.JLabel btn_detail;
    private javax.swing.JLabel btn_pembelian;
    private javax.swing.JLabel btn_penarikan;
    private javax.swing.JLabel btn_setor_tunai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelTransaksi;
    private javax.swing.JTextField tfCari;
    // End of variables declaration//GEN-END:variables
}
