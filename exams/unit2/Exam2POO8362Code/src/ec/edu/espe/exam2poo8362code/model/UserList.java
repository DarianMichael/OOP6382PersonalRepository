/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam2poo8362code.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class UserList implements Serializable{
    
    private ArrayList<User> users;

    public UserList(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    
    
}
