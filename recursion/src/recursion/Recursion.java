 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author devyo
 */
public class Recursion {

    public static int[] printArray(int[] x, int index) {

 
        
        if (index < 0) { // 
            return x;
        }
        System.out.println(x[index]);
        
        return printArray(x, index-1);
        
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 3, 4,};

        printArray(arr, arr.length-1 );
    }

}
