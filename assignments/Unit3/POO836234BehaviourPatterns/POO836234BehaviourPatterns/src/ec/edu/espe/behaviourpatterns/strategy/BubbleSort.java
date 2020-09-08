/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.behaviourpatterns.strategy;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class BubbleSort implements SortingStrategy{

    @Override
    public int[] sort(int[] data) {
        for(int i = data.length - 1;i > 0; i-- ){
            for(int j = 0; j < i; j++){
                if(data[j] > data[j + 1]){
                    swap(data, j, j + 1);
                }
            }
        }
        return data;
    }

    private void swap(int[] data, int j, int i) {
        int value = data[i];
        data[i] = data[j];
        data[j] = value;
    }
    
}
