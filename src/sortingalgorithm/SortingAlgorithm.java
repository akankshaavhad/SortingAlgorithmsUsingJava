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

    public static void main(String[] args) {
        // TODO code application logic here
        BubbleSort bubbleSort=new BubbleSort();
        int[] a = {9, 6, 4, 1, 7, 8, 10, 23, 3, 9};
        int[] outputbubble = bubbleSort.bubbleSort(a);
        System.out.print("Bubble Sort:- ");
        for (int k = 0; k <= outputbubble.length - 1; k++) {
            System.out.print(outputbubble[k]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("=============================================");
        int[] ainsert = {9, 6, 4, 1, 7, 8, 10, 23, 3, 9};
        InsertionSort insertionSort=new InsertionSort();
        int[] outputinsertion = insertionSort.insertionSort(ainsert);
        System.out.print("Insertion Sort:- ");
        for (int k = 0; k <= outputinsertion.length - 1; k++) {
            System.out.print(outputinsertion[k]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("=============================================");
        int[] aselect = {9, 6, 4, 1, 7, 8, 10, 23, 3, 9};
        SelectionSort selectionSort=new SelectionSort();
        int[] outputselection = selectionSort.selectionSort(aselect);
        System.out.print("Selection Sort:- ");
        for (int k = 0; k <= outputselection.length - 1; k++) {
            System.out.print(outputselection[k]);
            System.out.print(" ");
        }

        System.out.println();
        System.out.println("=============================================");
        MergeSort mergeSort=new MergeSort();
        int[] amerge = {9, 6, 4, 1, 7, 8, 10, 23, 3, 9};
        mergeSort.mergeSort(amerge);

    }

}
