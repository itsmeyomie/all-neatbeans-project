/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.util.Arrays;

public class Mergesort {

    public static void mergesort(int arr[], int len) {

        if (arr.length < 2) {

            return;
        }

        int mid = len / 2;
        int left[] = new int[mid];
        int right[] = new int[len - mid];

        for (int i = 0; i < mid; i++) {

            left[i] = arr[i];

        }

        for (int i = mid; i < len; i++) {

            right[i - mid] = arr[i];
        }

        mergesort(left, mid);
        mergesort(right, len - mid);
        merge(arr, left, right, mid, len - mid);

    }

    public static int[] merge(int arr[], int left[], int right[], int l, int r) {
        int i = 0, j = 0, k = 0;

        while (i < l && j < r) {

            if (left[i] < right[j]) {

                arr[k] = left[i];
                k++;
                i++;

            } else {

                arr[k] = right[j];
                k++;
                j++;
            }

        }

        while (i < l) {

            arr[k] = left[i];
            k++;
            i++;
        }

        while (j < r) {

            arr[k] = right[j];
            k++;
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {6, 4, 5, 9, 3, 2, 1};

        mergesort(arr, arr.length);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

}
