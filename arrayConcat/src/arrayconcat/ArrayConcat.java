/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayconcat;

import java.util.Arrays;

/**
 *
 * @author devyo
 */
public class ArrayConcat {

    public static int[] arrayConcat(int[] array1, int[] array2) {

        int[] newArray = new int[array1.length + array2.length];

        for (int i = 0, j = 0; i < array1.length; i++, j++) {

            newArray[i] = array1[j];
        }

        for (int k = 0, l = array1.length; k < array2.length; k++, l++) {
            newArray[l] = array2[k];
        }

        return newArray;
    }

    public static int[] arrayConcate(int[] array1, int[] array2) {
        int i = 0, j = 0, k = 0, l = array1.length;
        int[] newArray = new int[array1.length + array2.length];

        while (i < array1.length) {

            newArray[i] = array1[j];
            i++;
            j++;
        }
        while (k < array2.length) {
            newArray[l] = array2[k];

            k++;
            l++;

        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 1};
        int[] arr2 = {5, 6, 7, 8, 9, 5,4};

        System.out.println(Arrays.toString(arrayConcate(arr1, arr2)));
    }

}
