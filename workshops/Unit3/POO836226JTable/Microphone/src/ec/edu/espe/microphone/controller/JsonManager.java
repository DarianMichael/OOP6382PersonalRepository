/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.microphone.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.microphone.model.Microphone;
import ec.edu.espe.microphone.model.MicrophoneList;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class JsonManager {
    
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    public MicrophoneList readJson (String nameFile){
        MicrophoneList microphones = new MicrophoneList(new ArrayList<>());
        //List<Microphone> listMicrophone= new ArrayList<>();
        try (Reader fr = new FileReader(nameFile)) {
            microphones = gson.fromJson(fr, MicrophoneList.class);
        } catch (IOException e) {

        }
        /*for(Microphone mic : microphones.getMicrophones()){
            listMicrophone.add(mic);
        }*/
        return microphones;
    }
}
