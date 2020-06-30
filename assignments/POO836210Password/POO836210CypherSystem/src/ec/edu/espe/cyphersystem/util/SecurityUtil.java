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
public class SecurityUtil {
    
    public static String cipherTest(String rawPassword){
        String myHash;
        StringBuilder stringBuilder = new StringBuilder();
        char [] arrayPassword = rawPassword.toCharArray();
        for (int i = 0; i < arrayPassword.length; i++) {
            stringBuilder.append(Integer.toString(arrayPassword[i] + 1));
        }
        return myHash = stringBuilder.toString();
    }
}
