/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.password.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author DARIAN
 */
public class SecurityUtil {

    //private static final String SECRET_KEY = "S_Developers";
    
    private SecurityUtil() {

    }

    public static String cipherTest(String rawPassword) {

        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(SecurityUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        md.update(rawPassword.getBytes());
        byte[] digest = md.digest();
        String myHash = DatatypeConverter.printHexBinary(digest).toUpperCase();
        return myHash;
    }
}
