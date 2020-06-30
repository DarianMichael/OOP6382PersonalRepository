/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cyphersystem.controller;

import ec.edu.espe.cyphersystem.model.Role;
import ec.edu.espe.cyphersystem.model.User;
import ec.edu.espe.cyphersystem.util.SecurityUtil;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class SignUpView {
    
    private static final Scanner dataEntry = new Scanner(System.in);
     
    public String[] roles = {"ADMINISTRATOR", "CASHIER"};

    private String password;
    private String confirmationPassword;
    private static SignUpView signUpView;

    private SignUpView() {

    }

    public static SignUpView getInstance() {
        if (signUpView == null) {
            return signUpView = new SignUpView();
        }
        return signUpView;
    }

    public User createUser() {
        JFrame jframe = new JFrame();
        System.out.println("Enter user name: ");
        String name = dataEntry.nextLine();
        do {
            System.out.println("Enter your password: ");
            password = SecurityUtil.cipherTest(dataEntry.nextLine());
            System.out.println("Confirm your password: ");
            confirmationPassword = SecurityUtil.cipherTest(dataEntry.nextLine());
        } while (!password.equals(confirmationPassword));
        System.out.println("ADMINISTRATOR or CASHIER");
        String role = dataEntry.nextLine();
        try {
            Role roleEnum = Role.valueOf(role);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Invalid value the role : " + role);
        }
        User user = new User(name, password, Role.valueOf(role));
        return user;
    }
}
