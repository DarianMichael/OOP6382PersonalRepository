/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.patterndesing.abstractfactory;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class ClientApp {

    public static void main(String[] args) {
        System.out.println("Darian M. Martinez ESPE DCCO --> NRC: 6382");
        GUIFactory aFactory = GUIFactory.getFactory();
        Button aButton = aFactory.createButton();
        aButton.caption = "Play";
        aButton.paint();
    }
}
