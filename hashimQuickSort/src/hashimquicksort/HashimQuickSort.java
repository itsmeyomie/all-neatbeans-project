/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashimquicksort;

import java.util.Arrays;

/**
 *
 * @author devyo
 */
public class HashimQuickSort {

    public static void quickSort(int arr[], int begin, int end) {

        System.out.println("begin = " + begin);

        System.out.println("end = " + end);

        if (begin < end) {

            int j = partition(arr, begin, end);

            quickSort(arr, begin, j);

            quickSort(arr, j + 1, end);

        }

    }

    public static int partition(int[] arr, int begin, int end) {

        int i = begin;

        int j = end - 1;

        while (i < j) {

            if (arr[i] > arr[j]) {

                int temp = arr[j - 1];

                arr[j - 1] = arr[i];

                arr[i] = temp;

                int temp2 = arr[j];

                arr[j] = arr[j - 1];

                arr[j - 1] = temp2;

                j--;

            } else {

                i++;

            }

            System.out.println("Array = " + Arrays.toString(arr));

        }

        return j;

    }

    public static void swap(int i, int j) {

        int temp = i;

        i = j;

        j = temp;

    }

    public static void main(String[] args) {
        // TODO code application logic here

        int[] arr = {5,4,3,2,1};

        System.out.println("---------------------------------------");

        System.out.println("Usorted Array: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length);

        System.out.println("Sorted Array: " + Arrays.toString(arr));

        System.out.println("---------------------------------------");
    }

}
