/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgreturn.an.even.array;

import java.util.Arrays;

/**
 *
 * @author devyo
 */
public class ReturnAnEvenArray {

    static void even(int num) {

        int j = 0;
        int[] evenNumberArray = new int[(num / 2) - 1];

        for (int i = 1; i < num; i++) {
            if (i % 2 == 0) {
                evenNumberArray[j] = i;
                j++;
                i++;
            }

        }
        System.out.println(Arrays.toString(evenNumberArray));
    }

    public static void main(String[] args) {
        int num = 100;
        even(num);

    }

}
