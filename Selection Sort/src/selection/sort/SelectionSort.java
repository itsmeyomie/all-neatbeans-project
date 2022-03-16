/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selection.sort;

/**
 *
 * @author devyo
 */
public class SelectionSort {

    public static int selectionSort(int arr[]) {

        int min = 0;
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (min < arr[j]) {

                    arr[j] = min;
                    
                    minIndex = j;

                }

            }

        }

        return minIndex;
    }

    public static void main(String[] args) {
        int arr[] = {11, 12, 13, 14, 15, 16, 17, 22, 33, 56};

        System.out.println(selectionSort(arr));
    }

}
