/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithm;

import java.util.Arrays;

/**
 *
 * @author aavha
 */
public class QuickSort {
    
    public void quicksort(int[] input,int start, int end){
        
        if(start>=end){
            return;
        }      
        int pindex=partition(input,start,end);
        quicksort(input,start,pindex-1);
        quicksort(input,pindex+1,end);      
    }
    
    
    
    public int partition(int[] input, int start, int end){
        // System.out.println(Arrays.toString(input));
        int pivot=input[end];       
        int pindex=start; 
        int temp=0;
        for(int i=start;i<end;i++){          
            if(input[i]<=pivot){
               // swap(input[i],input[pindex]);
               
                temp=input[i];
                input[i]=input[pindex];
                input[pindex]=temp;         
             
                pindex++;
            }
        } 
        //After going through the array we need to swap pivot element and Pindex element
        int test=input[pindex];
        input[pindex]=pivot;
        input[end]=test;
        //System.out.println(pindex);
        
        
        return pindex;       
    }
    
}
