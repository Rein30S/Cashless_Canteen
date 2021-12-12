/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toko;

/**
 *
 * @author handy
 */
public class toko_login {
    public static String username;
    public static int saldo;
    public static int id_user;

    public static int getId_user() {
        return id_user;
    }

    public static void setId_user(int id_user) {
        toko_login.id_user = id_user;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        toko_login.username = username;
    }

    public static int getSaldo() {
        return saldo;
    }

    public static void setSaldo(int saldo) {
        toko_login.saldo = saldo;
    }
}
