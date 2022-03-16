/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.rotation;

import java.util.Arrays;

public class ArrayRotation {

    public static int[] reverse(int arr[], int i, int j) {
        int temp = 0;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    static int[] rotateArr(int arr[], int times) {
        times = times % arr.length;

        reverse(arr, 0, arr.length - 1);//54321
        reverse(arr, 0, times - 1);//45321
        reverse(arr, times, arr.length - 1);//45123

        return arr;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotateArr(arr, 2)));

    }

}
