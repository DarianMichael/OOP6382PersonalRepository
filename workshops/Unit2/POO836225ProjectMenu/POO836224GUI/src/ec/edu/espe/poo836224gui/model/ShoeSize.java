/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.poo836224gui.model;

import java.io.Serializable;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class ShoeSize implements Serializable{
    
    private String description;

    public ShoeSize(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
