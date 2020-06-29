/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.password.controller;

import ec.edu.espe.password.model.User;
import ec.edu.espe.password.util.SecurityUtil;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author DARIAN
 */
public class LogginView {

    private List<User> users;

    public LogginView(List<User> users) {
        this.users = users;
    }

    public User login() {
        JPasswordField pf = new JPasswordField();
        String name = JOptionPane.showInputDialog("Enter user name");
        int inputOption = (JOptionPane.showConfirmDialog(null, pf, "Enter your password",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE));
        String password = null;
        if (inputOption == JOptionPane.OK_OPTION) {
            password = SecurityUtil.cipherTest(new String(pf.getPassword()));
        }
        return validateUser(name, password);
    }

    public User validateUser(String name, String password) {
        User user;
        for (int i = 0; i < users.size(); i++) {
            user = users.get(i);
            if (name.equals(user.getName()) && (password.equals(user.getPassword()))) {
                return user;
            }
        }
        return null;
    }
}
