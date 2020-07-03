/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cyphersystem.view;

import ec.edu.espe.cyphersystem.controller.LogginView;
import ec.edu.espe.cyphersystem.model.Role;
import ec.edu.espe.cyphersystem.model.User;
import ec.edu.espe.filemanagerlibrary.FileManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class SystemManager {
    
    public static void main(String[] args) throws IOException {
        UserMenu userMenu = UserMenu.getInstance();
        FileManager fileManager = FileManager.getInstance();
        List<User> users = new ArrayList<>();
        List<String> listUsers = new ArrayList<>();
        LogginView logginView;

        listUsers = (fileManager.read("Users.csv"));
        Iterator<String> it = listUsers.iterator();
        while (it.hasNext()) {
            String current = it.next().trim();
            if(current.isEmpty()){
                continue;
            }
            String[] temp = current.split(",");
            String name = temp[0];
            String password = temp[1];
            String role = temp[2];
            User user = new User(name, password, Role.valueOf(role));
            users.add(user);
       
        }
        logginView = new LogginView(users);
        User loginUser;
        do {
            loginUser = logginView.login();
        } while (loginUser == null);
        userMenu.menu(loginUser);
    }
}
