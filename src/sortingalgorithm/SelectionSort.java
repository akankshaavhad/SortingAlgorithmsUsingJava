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
public class SelectionSort {

    public int[] selectionSort(int[] list) {
        int minValue, minIndex, temp;
        for (int i = 0; i < list.length; i++) {
            minValue = list[i];
            minIndex = i;
            for (int j = i; j < list.length; j++) {
                if (list[j] < minValue) {
                    minValue = list[j];
                    minIndex = j;
                }
            }
            if (list[i] != minValue) {
                temp = list[i];
                list[i] = minValue;
                list[minIndex] = temp;
            }
        }
        return list;
    }

}
