/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashexx;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author devyo
 */
public class Hashexx {

    public static HashMap occurenceMap(String name) {
        HashMap<Character, Integer> ocMap = new HashMap<>();
        for (int i = 0; i < name.length(); i++) {

            char key = name.charAt(i);
            int value = 1;
            if (ocMap.containsKey(key)) {
                value = value + ocMap.get(key);

            }
            ocMap.put(key, value);

        }
        return ocMap;
    }

    public static void main(String[] args) {

        HashMap<Character, Integer> ocMap = occurenceMap("refreshments");

        for (Map.Entry entry : ocMap.entrySet()) {
            System.out.println("this element " + entry.getKey() + " occurs " + entry.getValue() + " time(s)");

        }
    }

}
