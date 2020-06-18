
package ec.edu.espe.objectsandclasses.utils;


public class FileManager {
    public boolean createFile(String fileName){
        try{
            System.out.println("Creating file --> " + fileName);
            return true;
        }catch(Exception e){
            System.out.println("Creating file --> " + fileName + "FAILED...");
            return false;
        }
    }
    
    public boolean writeString(String data, String fileName){
        try{
            System.out.println("Writing "+ data + " in file: " + fileName);
            return true;
        }catch(Exception e){
            System.out.println("Writing "+ data + " in file: " + fileName + "FAILED....");
            return false;
        }
    }
    
    public String read(String fileName){
        String data;
        data = new String("");
        try{
            System.out.println("Reading data from " + fileName);
            data = "1, Lucy, white,2, false";
            return data;
        }catch(Exception e){
            System.out.println("Failing to read from " + fileName);
            return data;
        }
    }
}
