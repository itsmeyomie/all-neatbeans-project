/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayscopy;

import java.util.Arrays;

/**
 *
 * @author devyo
 */
public class ArraysCopy {

    public static int[] copyArray(int[] arr) {

         int array[] = new int[arr.length*2];
    for (int i = 0, j = 0, k = arr.length; i < arr.length; i++, j++,k++) {
            array[j] = arr[i];
            array[k] = arr[i];
            
          
        }
        return array;
    }

    public static void main(String[] args) {
       int []array={1,2,3,4,5,6,7,8,9};
       
        System.out.println(Arrays.toString(copyArray(array)));
    }
    
}
