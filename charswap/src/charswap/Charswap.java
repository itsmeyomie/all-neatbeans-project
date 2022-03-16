/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charswap;

import java.util.Arrays;

/**
 *
 * @author devyo
 */
public class Charswap {

    public static void swap(int arr) {
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 0, 1, 1, 1};

        int i = 0;
        int j = arr.length - 1;
        int temp = 0;

        while (true) {

            if (j - i == 1) {

                if (arr[j] == 0 && arr[i] != 0) {
                    temp = arr[i];
                }
                arr[i] = arr[j];
                arr[j] = temp;

                break;

            }
            if (i == j) {
                break;
            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] != 0) {
                j--;
            }
            if (arr[j] == 0 && arr[i] != 0) {

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
