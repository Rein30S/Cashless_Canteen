/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import User.user_login;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
    Map<String, String> dataGambar = new HashMap();
    int totalBelanja = 0;
    String kantin = Menu_Pilih_Kantin.kantin;
    /**
     * Creates new form Pilih_Menu
     */
    public Pilih_Menu() {
        initComponents();
        koneksi DB = new koneksi();
        DB.config();
        con = DB.conn;
        stm = DB.stm;
        tampil_data();
        
        int balance = user_login.getsaldo();
        String balanceS = Integer.toString(balance);
        
        tm_saldo.setText(balanceS);
    }
    
    private void clearText(){
        txt_menu.setText("");
        txt_jml.setText("0");
        txt_harga.setText("");
        txt_total.setText("");
        lbl_image.setIcon(null);
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
        lbl_image = new javax.swing.JLabel();
        clearText = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        btn_hapus = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txt_total = new javax.swing.JTextField();
        txt_menu = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        txt_jml = new javax.swing.JTextField();
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbl_menuMouseEntered(evt);
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
        tbl_pesan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_pesanMouseClicked(evt);
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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 430, 120));
        getContentPane().add(lbl_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 150, 110));

        clearText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clearText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearTextMouseClicked(evt);
            }
        });
        getContentPane().add(clearText, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 150, 30));

        lbTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 130, 30));

        btn_hapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_hapusMouseClicked(evt);
            }
        });
        getContentPane().add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 150, 30));

        btn_tambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tambahMouseClicked(evt);
            }
        });
        getContentPane().add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, 160, 30));

        jButton2.setText("-");
        jButton2.setBorder(null);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 40, 30));

        jButton1.setText("+");
        jButton1.setBorder(null);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, 40, 30));

        txt_total.setEditable(false);
        txt_total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_total.setBorder(null);
        getContentPane().add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 170, 40));

        txt_menu.setEditable(false);
        txt_menu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_menu.setBorder(null);
        txt_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_menuActionPerformed(evt);
            }
        });
        getContentPane().add(txt_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 196, 160, 30));

        txt_harga.setEditable(false);
        txt_harga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_harga.setBorder(null);
        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 160, 34));

        txt_jml.setEditable(false);
        txt_jml.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_jml.setText("0");
        txt_jml.setBorder(null);
        getContentPane().add(txt_jml, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 196, 70, 30));

        tm_saldo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tm_saldo.setText("0");
        getContentPane().add(tm_saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 80, 30));

        btn_pesan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        btn_makanan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_makanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_makananMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_makananMouseEntered(evt);
            }
        });
        getContentPane().add(btn_makanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 90, 82));

        btn_minuman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_minuman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minumanMouseClicked(evt);
            }
        });
        getContentPane().add(btn_minuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 90, 89));

        template.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User/Menu Pesan.png"))); // NOI18N
        getContentPane().add(template, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 900, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tampil_data(){
        DefaultTableModel table_data = new DefaultTableModel();
        table_data.addColumn("ID Menu");
        table_data.addColumn("Nama Menu");
        table_data.addColumn("Deskripsi");
        table_data.addColumn("Harga");
        tbl_menu.setModel(table_data);
        
        try{
            rs = stm.executeQuery("SELECT * FROM menu INNER JOIN toko ON menu.id_toko = toko.id_toko INNER JOIN blok ON toko.id_blok = blok.id_blok where kategori = 'Makanan' and toko.id_blok ='"+kantin+"' and menu.isdelete = 0 and tersedia = 1");
            while (rs.next()){
                Object[] data = new Object[4];
                data[0] = rs.getString("id_menu");
                data[1] = rs.getString("nama_menu");
                data[2] = rs.getString("deskripsi");
                data[3] = rs.getString("harga");
                table_data.addRow(data);
                tbl_menu.setModel(table_data);
                dataGambar.put(rs.getString("id_menu"), rs.getString("gambar"));
            }
            rs.close();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error!");
        }
        lbTotal.setText(String.valueOf(totalBelanja));
    }
    
    private void setGambar(int baris, int jenis){
        try {
            BufferedImage img;
            if(jenis == 1){
                img = ImageIO.read(new File(dataGambar.get((String)tbl_menu.getValueAt(baris, 0))));
            }else{
                img = ImageIO.read(new File(dataGambar.get((String)tbl_pesan.getValueAt(baris, 0))));
            }
            Image resizedImage = img.getScaledInstance(lbl_image.getWidth(), lbl_image.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(resizedImage);
            lbl_image.setText("");
            lbl_image.setIcon(icon);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void hitungTotal(){
        int totalRow = tbl_pesan.getRowCount();
        
        if(totalRow > 0){
            totalBelanja = 0;
            for(int i = 0; i < totalRow; i++){
                totalBelanja = totalBelanja + Integer.parseInt(String.valueOf(tbl_pesan.getValueAt(i, 4)));
                lbTotal.setText(String.valueOf(totalBelanja));
            }
        }else{
            totalBelanja = 0;
            lbTotal.setText(String.valueOf(totalBelanja));
        }
    }
    
    private void clear(int jenis){
        txt_menu.setText("");
        txt_harga.setText("");
        txt_jml.setText("0");
        nilai = 0;
        tbl_pesan.clearSelection();
        tbl_menu.clearSelection();
        txt_total.setText("");
        lbl_image.setIcon(null);
        
        if(jenis == 1){
            totalBelanja = 0;
            lbTotal.setText(String.valueOf(totalBelanja));
            int totalBaris = tbl_pesan.getRowCount();
            DefaultTableModel model = (DefaultTableModel) this.tbl_pesan.getModel();
            for(int i = totalBaris - 1; i >= 0; i--){
                model.removeRow(i);
            }
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
            int f = tbl_pesan.getRowCount();
            if(f > 0){
                if(user_login.getsaldo() >= totalBelanja){
                    
                    //Get Waktu//
                    Calendar cal = Calendar.getInstance();
                    cal.getTime();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String currentDate = sdf.format(cal.getTime());
                    //End Get Waktu//
                    
                    //Insert Transaksi//
                    PreparedStatement pstm = con.prepareStatement("INSERT INTO transaksi(id_user, total_transaksi, jenis_transaksi, waktu_transaksi, status_change_time, status) VALUES('"+user_login.getId_user()+"', '"+(-totalBelanja)+"', 'Pembelian', '"+currentDate+"', '"+currentDate+"', 'Pending')", Statement.RETURN_GENERATED_KEYS);
                    pstm.executeUpdate();
                    rs = pstm.getGeneratedKeys();
                    rs.next();
                    int id_transaksi = rs.getInt(1);
                    //End Insert Transaksi//
                    
                    //Insert Pembelian//
                    rs = stm.executeQuery("SELECT toko.id_toko FROM toko INNER JOIN blok ON toko.id_blok = blok.id_blok WHERE blok.id_blok = '"+kantin+"'");
                    rs.next();
                    pstm = con.prepareStatement("INSERT INTO pembelian(id_transaksi, id_toko) VALUES('"+id_transaksi+"', '"+rs.getString("id_toko")+"')", Statement.RETURN_GENERATED_KEYS);
                    pstm.executeUpdate();
                    rs = pstm.getGeneratedKeys();
                    rs.next();
                    int id_pembelian = rs.getInt(1);
                    System.out.println(id_pembelian);
                    //End Insert Pembelian//
                    for (int baris = 0; baris < f; baris++) {
                        String id_menu = tbl_pesan.getModel().getValueAt(baris, 0).toString();
                        String jumlah = tbl_pesan.getModel().getValueAt(baris, 3).toString();
                        String harga_satuan = tbl_pesan.getModel().getValueAt(baris, 2).toString();
                        String subtotal = tbl_pesan.getModel().getValueAt(baris, 4).toString();
                        stm.executeUpdate("INSERT INTO detail_pembelian(id_pembelian, id_menu, jumlah, harga_satuan, subtotal) VALUES('"+id_pembelian+"', '"+id_menu+"', '"+jumlah+"', '"+harga_satuan+"', '"+subtotal+"')");
                    }
                    stm.executeUpdate("UPDATE user SET saldo = saldo - '"+totalBelanja+"' WHERE id_user = '"+user_login.getId_user()+"'");
                    user_login.setsaldo(user_login.getsaldo() - totalBelanja);
                    tm_saldo.setText(String.valueOf(user_login.getsaldo()));
                    JOptionPane.showMessageDialog(null, "Pembelian berhasil diproses");
                    clear(1);
                }else{
                    JOptionPane.showMessageDialog(null, "Saldo Anda tidak cukup!");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Anda belum memasukkan menu!");
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_pesanMouseClicked

    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here
        if(tbl_menu.getSelectionModel().isSelectionEmpty() == false || tbl_pesan.getSelectionModel().isSelectionEmpty() == false){
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
        if(tbl_menu.getSelectionModel().isSelectionEmpty() == false || tbl_pesan.getSelectionModel().isSelectionEmpty() == false){
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
        tbl_pesan.clearSelection();
        int baris = tbl_menu.rowAtPoint(evt.getPoint());
        String nama_menu = tbl_menu.getValueAt(baris,1).toString();
        txt_menu.setText(nama_menu);
        String harga = tbl_menu.getValueAt(baris, 3).toString();
        txt_harga.setText(harga);
        nilai = 1;
        String nilais = Integer.toString(nilai);
        txt_jml.setText(nilais);
        txt_total.setText(harga);
        setGambar(baris, 1);
        
    }//GEN-LAST:event_tbl_menuMouseClicked

    private void btn_tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseClicked
        // TODO add your handling code here:
        if(tbl_menu.getSelectionModel().isSelectionEmpty() == false || tbl_pesan.getSelectionModel().isSelectionEmpty() == false){
            if(Integer.parseInt(txt_jml.getText()) > 0){
                int baris;
                String id_menu;
                if(tbl_menu.getSelectionModel().isSelectionEmpty()){
                    baris = tbl_pesan.getSelectedRow();
                    id_menu = tbl_pesan.getValueAt(baris, 0).toString();
                }else{
                    baris = tbl_menu.getSelectedRow();
                    id_menu = tbl_menu.getValueAt(baris,0).toString();
                }

                String menu   = txt_menu.getText();
                String harga = txt_harga.getText();
                String jumlah = String.valueOf(nilai);
                String total  = txt_total.getText();
                
                for(int i = 0; i < tbl_pesan.getRowCount(); i++){
                    if(tbl_pesan.getValueAt(i, 0).equals(id_menu)){
                        DefaultTableModel model = (DefaultTableModel) this.tbl_pesan.getModel();
                        model.removeRow(i);
                    }
                }
                
                Object[] row = {id_menu, menu, harga, jumlah, total};
                DefaultTableModel model = (DefaultTableModel) tbl_pesan.getModel();
                model.addRow(row);
                hitungTotal();
                clearText();
            }else{
                JOptionPane.showMessageDialog(null, "Jumlah pesanan harus lebih dari 0!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Anda harus memilih menu terlebih dahulu!");
        }  
    }//GEN-LAST:event_btn_tambahMouseClicked

    private void btn_makananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_makananMouseClicked
        // TODO add your handling code here:
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
                dataGambar.put(rs.getString("id_menu"), rs.getString("gambar"));
            }
            rs.close();
            }
            catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_makananMouseClicked

    private void btn_minumanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minumanMouseClicked
        // TODO add your handling code here:
        DefaultTableModel table_data = new DefaultTableModel();
        table_data.addColumn("ID Menu");
        table_data.addColumn("Nama Menu");
        table_data.addColumn("Deskripsi");
        table_data.addColumn("Harga");
        tbl_menu.setModel(table_data);
        
        try{
            String kantin = Menu_Pilih_Kantin.kantin;
            rs = stm.executeQuery("SELECT * FROM menu INNER JOIN toko ON menu.id_toko = toko.id_toko INNER JOIN blok ON toko.id_blok = blok.id_blok where kategori = 'Minuman' and toko.id_blok ='"+kantin+"' and menu.isdelete = 0 and tersedia = 1");
            while (rs.next()){
                Object[] data = new Object[4];
                data[0] = rs.getString("id_menu");
                data[1] = rs.getString("nama_menu");
                data[2] = rs.getString("deskripsi");
                data[3] = rs.getString("harga");
                table_data.addRow(data);
                tbl_menu.setModel(table_data);
                dataGambar.put(rs.getString("id_menu"), rs.getString("gambar"));
            }
            rs.close();
            }
            catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_minumanMouseClicked

    private void btn_makananMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_makananMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_makananMouseEntered

    private void btn_hapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMouseClicked
        // TODO add your handling code here:
        if(tbl_pesan.getSelectionModel().isSelectionEmpty() == false){
            DefaultTableModel model = (DefaultTableModel) this.tbl_pesan.getModel();
            model.removeRow(tbl_pesan.getSelectedRow());
            hitungTotal();
            clear(0);
            
        }else{
            JOptionPane.showMessageDialog(null, "Anda harus memilih pesanan yang akan dihapus terlebih dahulu");
        }
    }//GEN-LAST:event_btn_hapusMouseClicked

    private void tbl_pesanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_pesanMouseClicked
        // TODO add your handling code here:
        tbl_menu.clearSelection();
        int row = tbl_pesan.getSelectedRow();
        txt_menu.setText((String) tbl_pesan.getValueAt(row, 1));
        txt_harga.setText((String) tbl_pesan.getValueAt(row, 2));
        txt_jml.setText((String) tbl_pesan.getValueAt(row, 3));
        txt_total.setText((String) tbl_pesan.getValueAt(row, 4));
        nilai = Integer.parseInt(tbl_pesan.getValueAt(row, 3).toString());
        setGambar(row, 2);
    }//GEN-LAST:event_tbl_pesanMouseClicked

    private void tbl_menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_menuMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_menuMouseEntered

    private void clearTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearTextMouseClicked
        // TODO add your handling code here:
        clear(1);
    }//GEN-LAST:event_clearTextMouseClicked

    private void txt_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_menuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_menuActionPerformed

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
    private javax.swing.JLabel clearText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JTable tbl_menu;
    private javax.swing.JTable tbl_pesan;
    private javax.swing.JLabel template;
    private javax.swing.JLabel tm_saldo;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_jml;
    private javax.swing.JTextField txt_menu;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
