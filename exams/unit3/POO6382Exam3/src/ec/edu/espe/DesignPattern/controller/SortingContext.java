/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.DesignPattern.controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class SortingContext {

    private SortingStrategy ss;

    public int[] sort(int[] data) {
        int size = data.length;
        ss = setSortStrategy(size, data);
        return ss.sort(data);
    }

    public SortingStrategy setSortStrategy(int n, int data[]) {

        if (n >= 0 && n <= 3) {
            ss = new BubbleSort();
            JOptionPane.showMessageDialog(null, "Using Bubble Sort");
        } else if (n >= 4 && n <= 7) {
            ss = new InsertionSort();
            JOptionPane.showMessageDialog(null, "Using Insertion Sort");
        } else if (n >= 7) {
            ss = new QuickSort();
            JOptionPane.showMessageDialog(null, "Using Quick Sort");
        }

        return ss;
    }
}
