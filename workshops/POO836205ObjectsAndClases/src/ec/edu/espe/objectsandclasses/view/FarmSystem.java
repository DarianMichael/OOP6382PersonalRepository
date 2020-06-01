
package ec.edu.espe.objectsandclasses.view;

import ec.edu.espe.objectsandclasses.model.Chicken;
import ec.edu.espe.objectsandclasses.utils.FileManager;

public class FarmSystem {
    public static void main(String[] args) {
        String fileName = "Chickens.csv";
        Chicken chicken;
        chicken = new Chicken(1, "Lucy", "white", 2, false);
        System.out.println("Martinez Darian --> 05ObjectsAndClasses");
        System.out.println(chicken);
        
        FileManager fileManager = new FileManager();
        
        fileManager.createFile(fileName);
        fileManager.writeString(chicken.generateCsvData(), fileName);
        fileManager.read(fileName);
    }
}
