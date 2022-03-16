/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap.ex;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author devyo
 */
public class HashmapEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // getting a pair that sums up to some no in the array
        int arr[] = {2, 3, 9, 5,4};

        HashMap<Integer, Integer> pair = new HashMap<>();
        int target = 7;
        int array[] = new int[2]; //079362039

        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int value = i;
            int diff = (target - key);

            if (pair.containsKey(diff)) {
                array[0] = i;
                array[1] = pair.get(diff);

            }
            pair.put(key, value);
        }

        System.out.println(Arrays.toString(array));
        System.out.println(pair);

    }

}
