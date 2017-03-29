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
        int j,temp, key;
        for(int i=1;i<list.length;i++){
            key=list[i];
            j=i-1;
            while(j>=0 && key<=list[j]){
                    temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                    j--;
            }
            
        }
        return list;
    }
    
    public int[] selectionSort(int[] list){
        int minValue,minIndex,temp;
        for(int i=0;i<list.length;i++){
            minValue=list[i];
            minIndex=i;
            for(int j=i;j<list.length;j++){
                if(list[j]<minValue){
                   minValue=list[j];
                   minIndex=j;
                }
            }
             if(list[i]!=minValue){
                    temp=list[i];
                    list[i]=minValue;
                    list[minIndex]=temp;
                }
                
               
        }
        
        return list;
    }
    
    public void mergeSort(int[] array){
        mergesort(array, new int[array.length],0,array.length-1);   
        System.out.print("merge Sort:- ");
        for(int k=0;k<=array.length-1;k++){
            System.out.print(array[k]);
            System.out.print(" ");
        }
    }
    
    public void mergesort(int[] array, int[]temp, int leftStart, int rightEnd){
        if(leftStart>=rightEnd){
           return;
        }
        int middle = (leftStart+rightEnd)/2;
        mergesort(array,temp,leftStart,middle);
        mergesort(array,temp,middle+1,rightEnd);
        mergeElement(array, temp, leftStart, rightEnd);
        /*for(int k=leftStart;k<=rightEnd;k++){
            System.out.print(array[k]);
            System.out.print(" ");
        }
        System.out.println("\nLeft" +leftStart);
        System.out.println("Right" +rightEnd);
        */
        
    }
     private int[] mergeElement(int[] array, int[] temp, int leftStart, int rightEnd) {
         int leftEnd=   (leftStart+rightEnd)/2;
         int rightStart=leftEnd+1;
         
         int left=leftStart;
         int right=rightStart;
         int index=leftStart;
         
         while(left<=leftEnd && right<=rightEnd){
             if(array[left]<=array[right]){
                 temp[index]=array[left];
                 left++;
             }else{
                 temp[index]=array[right];
                 right++;
             }
             index++;
         }
         
         System.arraycopy(array, left, temp, index,leftEnd-left+1);
         System.arraycopy(array, right, temp, index, rightEnd-right+1);
         System.arraycopy(temp, leftStart, array, leftStart, rightEnd-leftStart+1);
         
         return array;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        SortingAlgorithm sm=new SortingAlgorithm();
        int[] a={9,6,4,1, 7, 8, 10, 23, 3, 9};
        int[] outputbubble=sm.bubbleSort(a);
        System.out.print("Bubble Sort:- ");
        for(int k=0;k<=outputbubble.length-1;k++){
            System.out.print(outputbubble[k]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("=============================================");
        int[] ainsert={9,6,4,1, 7, 8, 10, 23, 3, 9};
        int[] outputinsertion=sm.insertionSort(ainsert);
        System.out.print("Insertion Sort:- ");
        for(int k=0;k<=outputinsertion.length-1;k++){
            System.out.print(outputinsertion[k]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("=============================================");
        int[] aselect={9,6,4,1, 7, 8, 10, 23, 3, 9};
        int[] outputselection=sm.selectionSort(aselect);
        System.out.print("Selection Sort:- ");
        for(int k=0;k<=outputselection.length-1;k++){
            System.out.print(outputselection[k]);
            System.out.print(" ");
        }
        
        System.out.println();
        System.out.println("=============================================");
        int[] amerge={9,6,4,1, 7, 8, 10, 23, 3, 9};
        sm.mergeSort(amerge);
        
    }
        
   
    
}
