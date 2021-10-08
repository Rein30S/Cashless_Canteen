package koneksi;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class koneksi {
    public Connection conn;
    public Statement stm;
    
    public void config(){
        try{
            String dbUrl = "jdbc:mysql://localhost/cashlesscanteen";
            String username = "root";
            String password = "";
            conn = DriverManager.getConnection(dbUrl, username, password);
            stm = conn.createStatement();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
