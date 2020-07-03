/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cyphersystem.controller;

import ec.edu.espe.cyphersystem.model.User;
import ec.edu.espe.cyphersystem.util.SecurityPassword;
import java.io.Console;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class LogginView {

    private static final Scanner dataEntry = new Scanner(System.in);

    private List<User> users;

    public LogginView(List<User> users) {
        this.users = users;
    }

    public User login() {

        Console console = System.console();
        System.out.println("Enter user name");
        String name = dataEntry.nextLine();
        System.out.println("Enter your password");
        String password = SecurityPassword.cipherText(dataEntry.nextLine());
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
        System.out.println("Username and password do not match, please try again...");
        return null;
    }
}
