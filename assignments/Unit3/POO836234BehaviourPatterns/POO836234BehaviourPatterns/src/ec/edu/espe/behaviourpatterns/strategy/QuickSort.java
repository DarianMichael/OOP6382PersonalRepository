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
public class QuickSort implements ISortingStrategy {

    @Override
    public int[] sort(int[] data, int begin, int end) {
        
        if (begin < end) {
            int partitionIndex = partition(data, begin, end);

            sort(data, begin, partitionIndex - 1);
            sort(data, partitionIndex + 1, end);
        }
        return data;
    }
    

    private int partition(int[] data, int begin, int end) {
        int pivot = data[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (data[j] <= pivot) {
                i++;

                int swapTemp = data[i];
                data[i] = data[j];
                data[j] = swapTemp;
            }
        }

        int swapTemp = data[i + 1];
        data[i + 1] = data[end];
        data[end] = swapTemp;

        return i + 1;
    }

}
