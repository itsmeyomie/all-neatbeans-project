/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysort;

import java.util.Arrays;

public class Arraysort {

    public static int[] sort(int[] list) {

        int[] arr = new int[list.length];
        int i = 0, j = 0, k = list.length - 1;

        while (i < list.length) {

            if (list[i] == 0) {
                arr[j] = list[i];
                j++;
            } else {
                arr[k] = list[i];
                k--;

            }
            i++;

        }
        return arr;
    }

    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5, 6, 0, 0, 0, 0};

        System.out.println(Arrays.toString(sort(array)));
    }

}
