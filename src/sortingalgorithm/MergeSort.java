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
public class MergeSort {
    
    public void mergeSort(int[] array) {
        mergesort(array, new int[array.length], 0, array.length - 1);
        System.out.print("merge Sort:- ");
        for (int k = 0; k <= array.length - 1; k++) {
            System.out.print(array[k]);
            System.out.print(" ");
        }
    }

    public void mergesort(int[] array, int[] temp, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) {
            return;
        }
        int middle = (leftStart + rightEnd) / 2;
        mergesort(array, temp, leftStart, middle);
        mergesort(array, temp, middle + 1, rightEnd);
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
        int leftEnd = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd) {
            if (array[left] <= array[right]) {
                temp[index] = array[left];
                left++;
            } else {
                temp[index] = array[right];
                right++;
            }
            index++;
        }

        System.arraycopy(array, left, temp, index, leftEnd - left + 1);
        System.arraycopy(array, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, array, leftStart, rightEnd - leftStart + 1);

        return array;
    }
}
