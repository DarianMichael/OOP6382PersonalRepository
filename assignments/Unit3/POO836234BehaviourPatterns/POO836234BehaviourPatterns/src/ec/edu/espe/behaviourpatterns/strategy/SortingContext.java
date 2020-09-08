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
//the context class
public class SortingContext {
    
    private SortingStrategy ss;
    private ISortingStrategy iss;
    
    public int[] sort (int data[]){
        int size = data.length;
        if(size > 0 && size < 15){
            ss = setSortStrategy(size);
            return ss.sort(data);
        }else if(size >= 15){
            iss = setISortStrategy(size);
            return iss.sort(data, 0, data.length -1);
        }
        return data;
    }
    
    //choose the sort strategy depending on
    //data size; separate the selection of the
    //algorithm from the implementation
    
    public SortingStrategy setSortStrategy (int n){
        if(n > 0 && n < 10){
            System.out.println("\nMethod Bubble Sort");
            ss = new BubbleSort();
        }
        
        if(n >= 10 && n < 15){
            System.out.println("\nMethod Insertion Sort");
            ss = new InsertionSort();
        }
        return ss;
    }
    
    public ISortingStrategy setISortStrategy (int n){
        if(n >= 15 && n < 20){
            System.out.println("\nMethod Quick Sort");
            iss = new QuickSort();
        }
        
        if(n >= 20){
            System.out.println("\nMethod Merge Sort");
            iss = new MergeSort();
        }
        return iss;
    }
}
