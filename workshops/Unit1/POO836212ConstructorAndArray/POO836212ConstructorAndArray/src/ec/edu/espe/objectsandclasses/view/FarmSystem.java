package ec.edu.espe.objectsandclasses.view;

import ec.edu.espe.objectsandclasses.model.Chicken;
import ec.edu.espe.objectsandclasses.utils.FileManager;

public class FarmSystem {

    public static void main(String[] args) {
        String fileName = "Chickens.csv";
        Chicken chicken;
        chicken = new Chicken(1, "Lucy", "white", 2, false);
        System.out.println("");
        System.out.println("Martinez Darian --> 05ObjectsAndClasses");
        System.out.println("chicken is intsantiated using the parametrized constructor" + chicken);
        System.out.println("");

        Chicken chicken2;
        chicken2 = new Chicken(2, "Maria", "black", 2, true);

        /*FileManager fileManager = new FileManager();
        
        fileManager.createFile(fileName);
        fileManager.writeString(chicken.generateCsvData(), fileName);
        fileManager.read(fileName);*/
        /*chicken.id = 4;
        chicken.name = "Lucia";*/
        chicken.setId(0);
        chicken.setName("Lucia");

        Chicken chicken3 = new Chicken();
        System.out.println("chicken 3(using the o-args constructor)--->" + chicken3);

        Chicken chicken4 = new Chicken("Maruja", "brown", 1, false);
        System.out.println("chicken 4--->" + chicken4);

        Chicken chicken5 = new Chicken("Maria", "black", 1, false);
        System.out.println("chicken 5--->" + chicken5);
        
        Chicken chicken6 = new Chicken("Junior", "white", 2, false);
        System.out.println("chicken 6--->" + chicken6);

        System.out.println("indexCounter---> " + chicken4.getIndexCounter());
        System.out.println("indexCounter for chicken1---> " + chicken.getIndexCounter());
        System.out.println("");
        
        int coopMaxSize = 20;
        int coopMaxSize2 = 5;
        
        Chicken[] chickens = new Chicken[coopMaxSize];
        
        for (int i = 0; i < coopMaxSize; i++) {
            chickens[i] = new Chicken("chicken"+(i+1),"grey"+i,i+1,false);
        }
        
        for (int i = 0; i < coopMaxSize; i++) {
            System.out.println(chickens[i]);
        }
        
        Chicken[] chickens1 = new Chicken[coopMaxSize2];
        
        for (int i = 0; i < coopMaxSize2; i++) {
            chickens1[i] = new Chicken("chicken"+(i+1),"grey"+i,i+1,false);
        }
        
        for (int i = 0; i < coopMaxSize2; i++) {
            System.out.println(chickens1[i]);
        }
        
        short addend1 = 20000;
        short addend2 = 20000;
        short total = (short) (addend1 + addend2);
        System.out.println(total);
    }
}
