/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.patterndesing.templatemethod;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class BeverageTest {

    public static void main(String[] args) {
        System.out.println("Darian M. Martinez ESPE DCCO --> NRC: 6382");
        Tea tea = new Tea();
        Coffe coffe = new Coffe();
        System.out.println("\nMaking tea..");
        tea.prepareRecipe();

        System.out.println("\nMaking coffe..");
        coffe.prepareRecipe();
    }
}
