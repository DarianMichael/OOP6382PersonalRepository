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
public class Supplier implements Serializable{
    
    private String companyName;
    private String lotNumber;
    private String description;
    private TypeOfShoes typeOfShoes;
    private ShoeSize shoeSize;

    public Supplier(String companyName, String lotNumber, String description, TypeOfShoes typeOfShoes, ShoeSize shoeSize) {
        this.companyName = companyName;
        this.lotNumber = lotNumber;
        this.description = description;
        this.typeOfShoes = typeOfShoes;
        this.shoeSize = shoeSize;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeOfShoes getTypeOfShoes() {
        return typeOfShoes;
    }

    public void setTypeOfShoes(TypeOfShoes typeOfShoes) {
        this.typeOfShoes = typeOfShoes;
    }

    public ShoeSize getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(ShoeSize shoeSize) {
        this.shoeSize = shoeSize;
    }

    @Override
    public String toString() {
        return "Supplier{" + "companyName=" + companyName + ", lotNumber=" + lotNumber + ", description=" + description + ", typeOfShoes=" + typeOfShoes + ", shoeSize=" + shoeSize + '}';
    }
    
    
}
