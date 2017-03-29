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
     * @param args the command line arguments
     */
    public int[] bubbleSort(int[] list){
        int temp=0;
        for(int i=0;i<=list.length-1;i++){
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
    
    public static void main(String[] args) {
        // TODO code application logic here
        SortingAlgorithm sm=new SortingAlgorithm();
        int[] a={9,6,4,1, 7, 8, 3, 9};
        int[] output=sm.bubbleSort(a);
        for(int k=0;k<=output.length-1;k++){
            System.out.print(output[k]);
            System.out.print(" ");
        }
        
    }
    
}
