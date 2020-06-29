/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.password.view;

import ec.edu.espe.filemanagerlibrary.FileManager;
import ec.edu.espe.password.controller.SingUpView;
import ec.edu.espe.password.model.Role;
import ec.edu.espe.password.model.User;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author DARIAN
 */
public class UserMenu {

    private static UserMenu userMenu;
    private User loggedUser;

    private UserMenu() {

    }

    public static UserMenu getInstance() {
        if (userMenu == null) {
            userMenu = new UserMenu();
        }
        return userMenu;
    }

    public void menu(User loggedUser) throws IOException {
        int option = 0;
        do {
            if (loggedUser.getRole().equals(Role.ADMINISTRATOR)) {
                option = Integer.parseInt(JOptionPane.showInputDialog("Choose the option\n" + "1.-Sing UP\n" + "2.-Exit"));
                if (option == 2) {
                    option = 3;
                }
            } else if (loggedUser.getRole().equals(Role.CASHIER)) {
                option = Integer.parseInt(JOptionPane.showInputDialog("Choose the option\n" + "1.-Sale\n" + "2.-Exit"));
                if (option == 1) {
                    option = 2;
                } else if (option == 2) {
                    option = 3;
                    //JOptionPane.showMessageDialog(null, "Option incorrect");
                }
            }

            switch (option) {
                case 1:
                    User userRegisted = SingUpView.getInstance().createUser();
                    String userFile = userRegisted.toString();
                    FileManager.getInstance().writeRecord(userFile, "Users.csv");
                    break;

                case 2:
                    System.out.println("Sale");
                    System.out.println("Cajero trabajando");
                    break;

                case 3:
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "The option is not valid");

            }
        } while (option != 3);

    }

}
