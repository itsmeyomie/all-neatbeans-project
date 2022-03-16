/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Arrays;

/**
 *
 * @author devyo
 */
public class BubbleSort {
//4,5,3,2,1
    public static int[] bubbleSort(int[] array) {
        int count=0 ;
        boolean sorted;
        for (int i = 0; i < array.length; i++) {
            sorted = true;
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                    sorted = false;
                    count=count+1;

                    System.out.println(count);
                }
            }
            if (sorted) {
                System.out.println("sorted");
                return array;

            }
        }
        return array;
    }

    private static void swap(int array[], int index1, int index2) {

        int temp;

        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {4,5,3,2,1};
        //4,3,2,1,5

        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

}
