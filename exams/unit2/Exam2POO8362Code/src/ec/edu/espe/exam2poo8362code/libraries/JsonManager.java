/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam2poo8362code.libraries;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import ec.edu.espe.exam2poo8362code.model.User;
import ec.edu.espe.exam2poo8362code.model.UserList;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class JsonManager {
    
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void addToFile(User object) {
        ArrayList<User> users = new ArrayList<>();
        users.add(object);
        UserList userList = new UserList(users);
        
        try(FileWriter fw = new FileWriter("User1.json")){
        gson.toJson(userList, fw);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "User not entered successfully..", "FAILURE", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    public static ArrayList<Object> readObjects() {
        JsonParser parser = new JsonParser();
        UserList userList = new UserList(new ArrayList<>());
        ArrayList<Object> objects = new ArrayList<>();
        try (Reader reader = new FileReader("User1.json")){
            userList = gson.fromJson(reader, UserList.class);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "File not Found....", "FAILURE", JOptionPane.ERROR_MESSAGE);
        }
        
        for(User user : userList.getUsers()){
            objects.add(user);
        }

        return objects;
    }
}
