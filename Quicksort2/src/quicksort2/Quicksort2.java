/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort2;

import java.util.Arrays;

/**
 *
 * @author devyo
 */
public class Quicksort2 {

    public static int[] sort(int arr[]) {

        quicksort(arr, 0, arr.length - 1);

        return arr;

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    private static void quicksort(int arr[], int from, int to) {
        if (from >= to) {
            return;
        }
        int pivot = arr[to];
        int counter = from;

        for (int i = from; i < to; i++) {
            if (arr[i] <= pivot) {
                swap(arr, i, counter);
                counter++;
                System.out.println(counter);
            }
            System.out.println(Arrays.toString(arr));
        }
        swap(arr, counter, to);
        quicksort(arr, from, counter - 1);
        quicksort(arr, counter + 1, to);
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 1, 2,3};

        System.out.println(Arrays.toString(sort(array)));
        System.out.println("freedom");

    }

}
