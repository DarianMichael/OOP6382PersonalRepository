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
public class MergeSort implements ISortingStrategy {

    @Override
    public int[] sort(int[] data, int begin, int end) {
        if (begin < end) {
            //Find the midpoint of the vector.
            int middle = (begin + end) / 2;

            //Divide the first and second half (called recursively).
            sort(data, begin, middle);
            sort(data, middle + 1, end);

            //Join the halves.
            merge(data, begin, middle, end);
        }
        return data;
    }

    public void merge(int[] data, int begin, int middle, int end) {
        //Find the size of the sub-vectors to join them.
        int n1 = middle - begin + 1;
        int n2 = end - middle;

        //Temporary vectors
        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        //Copy the data to the temporary arrays.
        for (int i = 0; i < n1; i++) {
            leftArray[i] = data[begin + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = data[middle + j + 1];
        }
        /* Join the temporary vectors. */

        //Initial indices of the first and second sub-vector.
        int i = 0, j = 0;

        //Initial index of sub-vector data [].
        int k = begin;

        //Ordering.
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                data[k] = leftArray[i];
                i++;
            } else {
                data[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            data[k] = leftArray[i];
            i++;
            k++;
        }
        //Copy the remaining elements of rightArray [].
        while (j < n2) {
            data[k] = rightArray[j];
            j++;
            k++;
        }
    }

}
