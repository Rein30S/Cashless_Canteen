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
    
    public static void setsaldo(int saldo){
        user_login.saldo = saldo;
    }
    
    public static int getsaldo(){
        return saldo;
    }
}
