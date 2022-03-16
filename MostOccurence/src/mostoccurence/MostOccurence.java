/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostoccurence;

import java.util.HashMap;

/**
 *
 * @author devyo
 */
public class MostOccurence {

    public static int occurence(int arr[]) {
        int maxKey = 0;
        int maxValue = 0;

        int count = 0;

        HashMap<Integer, Integer> ocMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            // check if the current value is in the map
            int key = arr[i];
            if (ocMap.containsKey(key)) {
                int value = ocMap.get(key) + 1;
                
                if (value > maxValue) {
                    maxValue = value;
                    maxKey = key;
                }


                
                if (ocMap.containsValue(maxValue)) {

                    if (value == maxValue) {
                        maxValue = 0;
                        maxKey = 0;
                    }
                }

                ocMap.put(key, value);
            } else {
                ocMap.put(key, 1);
            }

            if (arr.length == 1) {
                maxKey = key;

            }
        }
        return maxKey;
    }

    public static void main(String[] args) {

        int arr[] = {3,3,4,4,5,5,5};
        System.out.println(occurence(arr));

    }

}
