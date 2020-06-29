/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.password.controller;

import ec.edu.espe.password.model.Role;
import ec.edu.espe.password.model.User;
import ec.edu.espe.password.util.SecurityUtil;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author DARIAN
 */
public class SingUpView {

    public String[] roles = {"ADMINISTRATOR", "CASHIER"};

    private String password;
    private String confirmationPassword;
    private static SingUpView singUpView;

    private SingUpView() {

    }

    public static SingUpView getInstance() {
        if (singUpView == null) {
            return singUpView = new SingUpView();
        }
        return singUpView;
    }

    public User createUser() {
        JFrame jframe = new JFrame();
        String name = JOptionPane.showInputDialog(" Enter user name");
        do {
            password = SecurityUtil.cipherTest(new String(JOptionPane.showInputDialog("Enter your password")));
            confirmationPassword = SecurityUtil.cipherTest(new String(JOptionPane.showInputDialog("Confirm your password")));
            
        } while (!password.equals(confirmationPassword));
        String role = (String) JOptionPane.showInputDialog(jframe, "Roles", "Enter your role",
                JOptionPane.QUESTION_MESSAGE, null, roles, roles[1]);
        User user = new User(name, password, Role.valueOf(role));
        return user;
    }

}
