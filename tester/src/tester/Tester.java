/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import java.util.Arrays;

/**
 *
 * @author devyo
 */
public class Tester {

    static int[] reverse(int arr[]) {

        int temp = 0;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {

            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(reverse(arr)));
        String subS = "";
        String name = "refreshments";

        subS = name.substring(2, 7);

        System.out.println("new string is " + subS);
    }
}
