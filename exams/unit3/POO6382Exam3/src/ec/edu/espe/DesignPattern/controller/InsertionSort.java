/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.DesignPattern.controller;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class InsertionSort implements SortingStrategy {

    public int[] sort(int data[]) {
        int n = data.length;
        for (int i = 1; i < n; ++i) {
            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }
        showOrderedArray(data);
        return data;
    }

    private void showOrderedArray(int[] data) {
        System.out.println("--INSERTION SORT--");
        for (int list : data) {
            System.out.print(list + ", ");
        }
    }

}
