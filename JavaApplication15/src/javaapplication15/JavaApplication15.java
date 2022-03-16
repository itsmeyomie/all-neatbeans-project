/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author devyo
 */
public class JavaApplication15 {

    static int[] rotLeft(int[] a, int d) {

        int r[] = new int[a.length];

        System.out.println("d % a.length = " + d % a.length);

        System.out.println("d = " + d);

        if (d >= a.length && d % a.length == 0) {

            r = a;

            return r;

        } else {

            d = d % a.length;

            for (int i = 0, j = d; i < a.length && j < a.length; i++, j++) {

                r[i] = a[j];

            }

            for (int i = a.length - d, j = 0; i < a.length && j < a.length; i++, j++) {

                r[i] = a[j];

            }

            System.out.println("r = " + Arrays.toString(r));

        }

        return r;

    }

    public static void main(String[] args) {

// TODO code application logic here
        int ar[] = {1, 2, 3, 4, 5};

        System.out.println("rotated array = " + Arrays.toString(rotLeft(ar, 11)));

    }

}
