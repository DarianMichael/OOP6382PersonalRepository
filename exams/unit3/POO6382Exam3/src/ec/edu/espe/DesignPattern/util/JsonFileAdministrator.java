/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.DesignPattern.util;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JsonFileAdministrator {
    
    static Gson gson = new Gson();
    BufferedWriter bw;
        
    
    public  ArrayList<Object> readObjects(String nameClass){
        JsonParser parser = new JsonParser();
        ArrayList<Object> objects = new ArrayList<>();
        try{
            File f=new File(nameClass+".json");
            if(f.exists())
            {
                FileReader fr = new FileReader(f);
                JsonElement dates = parser.parse(fr);
                JsonArray jArray = dates.getAsJsonArray();
                for (int i = 0; i < jArray.size(); i++) {
                    String jString = jArray.get(i).getAsJsonObject().toString();
                    Object object = gson.fromJson(jString, Object.class);
                    objects.add(object);
                }
                
                fr.close();
            
            }
        }catch(Exception e){
            System.out.println("Archive not found");}
        
        return objects;
        
    }
    
    public  void addToFile(int [] numbers, String nameFile) {
        
        //JsonArray jArray = new JsonArray();
        String jsonStringFile;
        jsonStringFile = gson.toJson(numbers);
        
        try {
            bw = openFileForWrite(nameFile);
            bw.write(jsonStringFile);
            bw.flush();
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(JsonFileAdministrator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fileInitializer(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    private BufferedWriter openFileForWrite(String fileName) throws IOException {
        fileInitializer(fileName);
        return new BufferedWriter(new FileWriter(fileName, true));
    }
    
}
