/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cyphersystem.util;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class SecurityPassword {
    
    public static String cipherText(String rawPassword){
        char token;
        char[] tokens = new char[rawPassword.length()];
        int value;
        
        for(int i = 0; i < rawPassword.length(); i++){
            token = rawPassword.charAt(i);
            value = (int)token + 1;  
            token = (char)value;
            tokens[i] = token;
     
        }
          rawPassword = String.valueOf(tokens);        
        
         return rawPassword;
    }
    
    public static String decipherText(String rawPassword){

        char token;
        char[] tokens = new char[rawPassword.length()];
        int value;
        
        for(int i =0; i < rawPassword.length(); i++){
            token = rawPassword.charAt(i);
            value = (int)token - 1;  
            token = (char)value;
            tokens[i] = token;
     
        }
         rawPassword = String.valueOf(tokens);   
        
        return rawPassword;
    }
   
}
