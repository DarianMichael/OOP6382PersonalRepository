/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.microphone.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class MicrophoneList implements Serializable{
    
    private List<Microphone> microphones;

    public MicrophoneList(List<Microphone> microphones) {
        this.microphones = new ArrayList<>(microphones);
    }

    public List<Microphone> getMicrophones() {
        return microphones;
    }

    public void setMicrophones(List<Microphone> microphones) {
        this.microphones = microphones;
    }

}
