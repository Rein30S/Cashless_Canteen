/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import User.user_login;
import static User.user_login.saldo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
/**
 *
 * @author Ajeng Niarti
 */
public class Pilih_Menu extends javax.swing.JFrame {
    int nilai= 0;
    Connection con;
    Statement stm;
    ResultSet rs;
    String sql;
    Random random = new Random();
    
    /**
     * Creates new form Pilih_Menu
     */
    public Pilih_Menu() {
        initComponents();
        tampil_data();
        
        int balance = user_login.getsaldo();
        String balanceS = Integer.toString(balance);
        
        String saldo1 = Integer.toString(saldo);
        tm_saldo.setText(balanceS);
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_close = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_menu = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_pesan = new javax.swing.JTable();
        btn_hapus = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txt_total = new javax.swing.JTextField();
        txt_menu = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        txt_jml = new javax.swing.JTextField();
        tm_memesan = new javax.swing.JLabel();
        tm_saldo = new javax.swing.JLabel();
        btn_pesan = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JLabel();
        btn_makanan = new javax.swing.JLabel();
        btn_minuman = new javax.swing.JLabel();
        template = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 30, 30));

        tbl_menu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Menu", "Nama Menu", "Deskripsi", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_menuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_menu);
        if (tbl_menu.getColumnModel().getColumnCount() > 0) {
            tbl_menu.getColumnModel().getColumn(0).setResizable(false);
            tbl_menu.getColumnModel().getColumn(1).setResizable(false);
            tbl_menu.getColumnModel().getColumn(2).setResizable(false);
            tbl_menu.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 360, 250));

        tbl_pesan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Menu", "Nama Menu", "Jumlah Pesanan", "Harga", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_pesan);
        if (tbl_pesan.getColumnModel().getColumnCount() > 0) {
            tbl_pesan.getColumnModel().getColumn(0).setResizable(false);
            tbl_pesan.getColumnModel().getColumn(1).setResizable(false);
            tbl_pesan.getColumnModel().getColumn(2).setResizable(false);
            tbl_pesan.getColumnModel().getColumn(3).setResizable(false);
            tbl_pesan.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 570, 100));
        getContentPane().add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, 150, 30));

        btn_tambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tambahMouseClicked(evt);
            }
        });
        getContentPane().add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 160, 30));

        jButton2.setText("-");
        jButton2.setBorder(null);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 228, 40, 30));

        jButton1.setText("+");
        jButton1.setBorder(null);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(824, 229, 40, 30));

        txt_total.setEditable(false);
        txt_total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_total.setBorder(null);
        getContentPane().add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 170, 40));

        txt_menu.setEditable(false);
        txt_menu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_menu.setBorder(null);
        getContentPane().add(txt_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 160, 30));

        txt_harga.setEditable(false);
        txt_harga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_harga.setBorder(null);
        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 160, 34));

        txt_jml.setEditable(false);
        txt_jml.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_jml.setText("0");
        txt_jml.setBorder(null);
        getContentPane().add(txt_jml, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 70, 30));
        getContentPane().add(tm_memesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 200, 360, 230));

        tm_saldo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tm_saldo.setText("0");
        getContentPane().add(tm_saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 80, 30));

        btn_pesan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pesanMouseClicked(evt);
            }
        });
        getContentPane().add(btn_pesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 140, 35));

        btn_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelMouseClicked(evt);
            }
        });
        getContentPane().add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 525, 140, 35));

        btn_makanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_makananMouseClicked(evt);
            }
        });
        getContentPane().add(btn_makanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 90, 82));
        getContentPane().add(btn_minuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 90, 89));

        template.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User/Menu Pesan.png"))); // NOI18N
        getContentPane().add(template, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 900, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tampil_data(){
        
        koneksi DB = new koneksi();
        DB.config();
        con = DB.conn;
        stm = DB.stm;
        
        DefaultTableModel table_data = new DefaultTableModel();
        table_data.addColumn("ID Menu");
        table_data.addColumn("Nama Menu");
        table_data.addColumn("Deskripsi");
        table_data.addColumn("Harga");
        tbl_menu.setModel(table_data);
        
        try{
            String kantin = Menu_Pilih_Kantin.kantin;
            rs = stm.executeQuery("SELECT * FROM menu INNER JOIN toko ON menu.id_toko = toko.id_toko INNER JOIN blok ON toko.id_blok = blok.id_blok where kategori = 'makanan' and toko.id_blok ="+kantin);
            while (rs.next()){
                Object[] data = new Object[4];
                data[0] = rs.getString("id_menu");
                data[1] = rs.getString("nama_menu");
                data[2] = rs.getString("deskripsi");
                data[3] = rs.getString("harga");
                table_data.addRow(data);
                tbl_menu.setModel(table_data);
                }
            rs.close();
            }
            catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error!");
        }
    }
    private void btn_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseClicked
        // TODO add your handling code here:
        Menu_Pilih_Kantin back = new Menu_Pilih_Kantin();
        back.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cancelMouseClicked

    private void btn_pesanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pesanMouseClicked
        // TODO add your handling code here:
       try{
            koneksi DB = new koneksi();
            DB.config();
            con = DB.conn;
            stm = DB.stm;
            int f = tbl_pesan.getRowCount();
                for (int baris = 0; baris < f; baris++) {
                    int id_detail_pembelian = 1;
                    int id_pembelian = 1;
                    String id_menu = tbl_pesan.getModel().getValueAt(baris, 1).toString();
                    int id_menu_i = Integer.parseInt(id_menu);
                    String jumlah = tbl_pesan.getModel().getValueAt(baris, 2).toString();
                    int jumlah_i = Integer.parseInt(jumlah);
                    int harga_satuan = 0;
                    String subtotal = tbl_pesan.getModel().getValueAt(baris, 3).toString();
                    int subtotal_i = Integer.parseInt(subtotal);
                    sql = "INSERT INTO DETAIL_PEMBELIAN VALUES('" 
                            + id_detail_pembelian + "','"
                            + id_pembelian + "','"
                            + id_menu_i + "','" 
                            + jumlah_i + "','" 
                            + harga_satuan + "','" 
                            + subtotal_i +  "')"; 
                }
            stm.executeUpdate(sql);
                
        }catch (Exception e) {

        }
        
        Menu_User mu = new Menu_User();
        mu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_pesanMouseClicked

    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here
        if(tbl_menu.getSelectionModel().isSelectionEmpty() == false){
            ++nilai;
        
            String harga = txt_harga.getText();
            int hargai = Integer.parseInt(harga);
            String nilai1 = Integer.toString(nilai);

            txt_jml.setText(nilai1);
            int total = nilai * hargai;
            String totals = Integer.toString(total);
            txt_total.setText(totals);
        }else{
            JOptionPane.showMessageDialog(null, "Anda harus memilih menu terlebih dahulu!");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        if(tbl_menu.getSelectionModel().isSelectionEmpty() == false){
            if(nilai > 0){
                --nilai;
                String harga = txt_harga.getText();
                int hargai = Integer.parseInt(harga);
                String nilai1 = Integer.toString(nilai);

                txt_jml.setText(nilai1);
                int total = nilai * hargai;
                String totals = Integer.toString(total);
                txt_total.setText(totals);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Anda harus memilih menu terlebih dahulu!");
        }        
    }//GEN-LAST:event_jButton2MouseClicked

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_closeMouseClicked

    private void tbl_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_menuMouseClicked
        // TODO add your handling code here:  
        int baris = tbl_menu.rowAtPoint(evt.getPoint());
        String nama_menu = tbl_menu.getValueAt(baris,1).toString();
        txt_menu.setText(nama_menu);
        String harga = tbl_menu.getValueAt(baris, 3).toString();
        txt_harga.setText(harga);
        nilai = 1;
        String nilais = Integer.toString(nilai);
        txt_jml.setText(nilais);
        txt_total.setText(harga);
    }//GEN-LAST:event_tbl_menuMouseClicked

    private void btn_tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseClicked
        // TODO add your handling code here:
        if(tbl_menu.getSelectionModel().isSelectionEmpty() == false){
            if(Integer.parseInt(txt_jml.getText()) > 0){
                int baris = tbl_menu.rowAtPoint(evt.getPoint());
                String id_menu = tbl_menu.getValueAt(baris,0).toString();
                String menu   = txt_menu.getText();
                String jumlah = String.valueOf(nilai);
                String harga = txt_harga.getText();
                String total  = txt_total.getText();

                Object[] row = {id_menu, menu, jumlah, harga, total};

                DefaultTableModel model = (DefaultTableModel) tbl_pesan.getModel();

                model.addRow(row);
            }else{
                JOptionPane.showMessageDialog(null, "Jumlah pesanan harus lebih dari 0!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Anda harus memilih menu terlebih dahulu!");
        }  
    }//GEN-LAST:event_btn_tambahMouseClicked

    private void btn_makananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_makananMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_makananMouseClicked

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
            java.util.logging.Logger.getLogger(Pilih_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pilih_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pilih_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pilih_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pilih_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_cancel;
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel btn_hapus;
    private javax.swing.JLabel btn_makanan;
    private javax.swing.JLabel btn_minuman;
    private javax.swing.JLabel btn_pesan;
    private javax.swing.JLabel btn_tambah;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_menu;
    private javax.swing.JTable tbl_pesan;
    private javax.swing.JLabel template;
    private javax.swing.JLabel tm_memesan;
    private javax.swing.JLabel tm_saldo;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_jml;
    private javax.swing.JTextField txt_menu;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
