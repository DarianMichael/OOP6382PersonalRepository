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
//Client application class
public class SortApp {
    
    public static void main(String[] args) {
        System.out.println("Darian M. Martinez ESPE DCCO --> NRC: 6382\n");
        int data[] = {3, 6, 4, 6, 7, 8, 5, 6, 7, 5, 3, 3,9 ,14 ,3 ,2 ,43 ,11 ,58 ,22 ,12};
        SortingContext sc = new SortingContext();
        int sortedList[] = sc.sort(data);
        
        for(int list : sortedList){
            System.out.print(list + ", ");
        }
        
        int data1[] = {3, 56, 4, 6, 7, 8, 5, 26, 17, 85, 63, 23, 49, 14, 1};
        int sortedList1[] = sc.sort(data1);
        
        for(int list : sortedList1){
            System.out.print(list + ", ");
        }
        
        int data2[] = {9 , 14, 3, 2, 43, 11, 58, 22, 12, 55};
        int sortedList2[] = sc.sort(data2);
        
        for(int list : sortedList2){
            System.out.print(list + ", ");
        }
        
        int data3[] = {9 ,14 ,3 ,2 ,43 };
        int sortedList3[] = sc.sort(data3);
        
        for(int list : sortedList3){
            System.out.print(list + ", ");
        }
        }
}
