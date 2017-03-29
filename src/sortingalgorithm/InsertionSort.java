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
public class InsertionSort {

    public int[] insertionSort(int[] list) {
        int j, temp, key;
        for (int i = 1; i < list.length; i++) {
            key = list[i];
            j = i - 1;
            while (j >= 0 && key <= list[j]) {
                temp = list[j];
                list[j] = list[j + 1];
                list[j + 1] = temp;
                j--;
            }
        }
        return list;
    }

}
