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
 * @author ASUS
 */
public class Detail_Toko extends javax.swing.JFrame {

    /**
     * Creates new form Detail_Toko
     */
    Connection conn;
    Statement stm;
    ResultSet rs;
    int id;
    public Detail_Toko() {
        initComponents();
        koneksi DB = new koneksi();
        DB.config();
        conn = DB.conn;
        stm = DB.stm;
    }
    
    public void setData(int id){
        this.id = id;
        try{
            rs = stm.executeQuery("SELECT * FROM toko INNER JOIN user ON toko.id_user = user.id_user WHERE toko.id_toko ='"+id+"'");
            rs.next();
            labelNamaPemilik.setText(rs.getString("nama_pemilik_toko"));
            labelNamaToko.setText(rs.getString("nama_toko"));
            labelSaldo.setText(rs.getString("saldo"));
            
            int blok = Integer.parseInt(rs.getString("id_blok"));
            
            rs = stm.executeQuery("SELECT * FROM blok LEFT JOIN toko ON blok.ID_BLOK = toko.ID_BLOK WHERE toko.ID_BLOK IS NULL OR blok.ID_BLOK ="+blok+" ORDER BY blok.id_blok ASC");
            
            cbBlok.removeAllItems();
            
            while(rs.next()){
                String dataNomorKantin = rs.getString("id_blok");
                cbBlok.addItem(dataNomorKantin);    
            }    
            
            for(int i = 0; i < cbBlok.getItemCount(); i++){
                if(blok == Integer.parseInt(cbBlok.getItemAt(i))){
                    cbBlok.setSelectedIndex(i);
                }
            }
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Nama Menu");
            model.addColumn("Kategori");
            model.addColumn("Harga");
            model.addColumn("Tersedia");
            tabelMenu.setModel(model);
            
            try{
                rs = stm.executeQuery("SELECT * FROM menu INNER JOIN toko ON menu.id_toko = toko.id_toko WHERE toko.id_toko ='"+id+"'");
                while(rs.next()){
                    Object[] data = new Object[4];
                    data[0] = rs.getString("nama_menu");
                    data[1] = rs.getString("kategori");
                    data[2] = rs.getString("harga");
                    data[3] = rs.getString("tersedia");
                    model.addRow(data);
                    tabelMenu.setModel(model);
                }
                rs.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
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

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMenu = new javax.swing.JTable();
        cbBlok = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelSaldo = new javax.swing.JLabel();
        labelNamaToko = new javax.swing.JLabel();
        labelNamaPemilik = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 100, 30));

        tabelMenu.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelMenu);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 350, 190));

        cbBlok.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbBlok, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 227, 130, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 330, 350, 190));

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 40, 40));

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 40, 40));

        labelSaldo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelSaldo.setText("Saldo");
        getContentPane().add(labelSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 285, -1, -1));

        labelNamaToko.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelNamaToko.setText("Nama Toko");
        getContentPane().add(labelNamaToko, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 285, -1, -1));

        labelNamaPemilik.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelNamaPemilik.setText("Nama Pemilik");
        getContentPane().add(labelNamaPemilik, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 225, -1, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Admin/Detail Toko.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        setSize(new java.awt.Dimension(916, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        ListToko lt = new ListToko();
        lt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        String idBlok = cbBlok.getSelectedItem().toString();
        
        try {
            int result = stm.executeUpdate("UPDATE toko SET id_blok = '"+idBlok+"' WHERE id_toko = '"+id+"'");
            
            if(result == 1){
                JOptionPane.showMessageDialog(null, "Data berhasil di-update.");
                setData(id);
            }else{
                JOptionPane.showMessageDialog(null, "Data gagal di-update.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(Detail_Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Detail_Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Detail_Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Detail_Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Detail_Toko().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JComboBox<String> cbBlok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelNamaPemilik;
    private javax.swing.JLabel labelNamaToko;
    private javax.swing.JLabel labelSaldo;
    private javax.swing.JTable tabelMenu;
    // End of variables declaration//GEN-END:variables
}