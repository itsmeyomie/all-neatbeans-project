/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

import java.util.Arrays;

/**
 *
 * @author devyo
 */
public class InsertionSort {

    public static int[] insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];
            System.out.println(current);

            int position = i - 1;

            while (position >= 0 && arr[position] > current) {

                arr[position + 1] = arr[position];          //9, 4, 3, 1, 2

                position = position - 1;
                
                System.out.println(Arrays.toString(arr));
            }

            arr[position + 1] = current;
            

        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 4, 1};
        String array = Arrays.toString(insertionSort(arr));
        
        System.out.println(array);

    }
}
