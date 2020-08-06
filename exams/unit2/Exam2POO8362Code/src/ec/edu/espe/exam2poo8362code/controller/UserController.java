/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam2poo8362code.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.exam2poo8362code.libraries.JsonManager;
import ec.edu.espe.exam2poo8362code.libraries.SecurityPassword;
import ec.edu.espe.exam2poo8362code.model.User;
import java.util.ArrayList;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class UserController {
    
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    private String secretKey = "SDevelopers";
    
    public User Validate(String username, String password){
        ArrayList<Object> objects;
        
        ArrayList<User> users = new ArrayList<>();
        objects = JsonManager.readObjects();
        User user = null;
        for (int i = 0; i < objects.size(); i++) {
            User userJson;
            String jUser = gson.toJson(objects.get(i));
            userJson = gson.fromJson(jUser, User.class);
            
            users.add(userJson);
            
        }
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getUserName().equals(username) && 
                    SecurityPassword.deecnode(secretKey, users.get(i).getPassword()).equals(password)){
               user = users.get(i);
            }
        }
        return user;
    }
    
}
