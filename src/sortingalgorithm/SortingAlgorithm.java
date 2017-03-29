/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithm;

/**
 *
 * @author aavha
 */
public class SortingAlgorithm {

    /**
     * @param list containing integer value
     */
    public int[] bubbleSort(int[] list){
        int temp=0;
        for(int i=0;i<list.length-1;i++){
            for(int j=0;j<list.length-1-i;j++){
                if(list[j]>list[j+1]){
                    temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
        }    
        return list;
    }
    
    public int[] insertionSort(int[] list){
        int temp, key;
        for(int i=1;i<list.length;i++){
            key=list[i];
            int j=i-1;
            while(j<0 && key<list[j]){
                    temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                    j--;
            }
            
        }
        return list;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        SortingAlgorithm sm=new SortingAlgorithm();
        int[] a={9,6,4,1, 7, 8, 3, 9};
        int[] outputbubble=sm.bubbleSort(a);
        System.out.print("Bubble Sort:- ");
        for(int k=0;k<=outputbubble.length-1;k++){
            System.out.print(outputbubble[k]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("=============================================");
        int[] outputinsertion=sm.insertionSort(a);
        System.out.print("Insertion Sort:- ");
        for(int k=0;k<=outputinsertion.length-1;k++){
            System.out.print(outputinsertion[k]);
            System.out.print(" ");
        }
    }
    
}
