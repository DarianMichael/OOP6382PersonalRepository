/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cyphersystem.view;

import ec.edu.espe.cyphersystem.controller.SignUpView;
import ec.edu.espe.cyphersystem.model.Role;
import ec.edu.espe.cyphersystem.model.User;
import ec.edu.espe.filemanagerlibrary.FileManager;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class UserMenu {

    private static UserMenu userMenu;
    private User loggedUser;
    private static final Scanner dataEntry = new Scanner(System.in);

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
                System.out.println("Choose the option");
                System.out.println("1.-Sing UP");
                System.out.println("2.-Exit");
                option = dataEntry.nextInt();
                if (option == 2) {
                    option = 3;
                }
            } else if (loggedUser.getRole().equals(Role.CASHIER)) {
                System.out.println("Choose the option");
                System.out.println("1.-1.-Sale");
                System.out.println("2.-Exit");
                option = dataEntry.nextInt();
                if (option == 1) {
                    option = 2;
                } else if (option == 2) {
                    option = 3;
                }
            }

            switch (option) {
                case 1:
                    User userRegisted = SignUpView.getInstance().createUser();
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
                    System.out.println("The option is not valid");

            }
        } while (option != 3);

    }
}
