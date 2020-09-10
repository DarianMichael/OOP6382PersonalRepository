/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.DesignPattern.view;

import ec.edu.espe.DesignPattern.controller.SortingContext;


/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class SortApp {
    public static void main(String args[]){
        int data[] = {3,6,4,6,7,8,4,3,9,8};
        SortingContext sc = new SortingContext();
        sc.sort(data);
       
    }
  
        
    
    
}
