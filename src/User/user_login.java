/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author ASUS
 */
public class user_login {
    
    public static int saldo;
    public static String username;
    public static String id_user;
    
    public static void setsaldo(int saldo){
        user_login.saldo = saldo;
    }

    public static String getId_user() {
        return id_user;
    }

    public static void setId_user(String id_user) {
        user_login.id_user = id_user;
    }
    
    public static int getsaldo(){
        return saldo;
    }
    
    public static void setusername(String username){
        user_login.username = username;
    }
    
    public static String getusername(){
        return username;
    }
    
}