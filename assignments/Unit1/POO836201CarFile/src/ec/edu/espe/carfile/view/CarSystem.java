
package ec.edu.espe.carfile.view;

import ec.edu.espe.carfile.controller.Archive;
import java.io.IOException;


public class CarSystem {
    public static void main(String[] args) throws IOException{
        
        Archive file = new Archive();
        file.createFile();
        file.createBinaryData();
    }
}
