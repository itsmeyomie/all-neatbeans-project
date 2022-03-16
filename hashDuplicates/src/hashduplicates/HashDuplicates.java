/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashduplicates;

import java.util.HashMap;

/**
 *
 * @author devyo
 */
public class HashDuplicates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "manny";
        //

        HashMap<Character, Integer> removeDups = new HashMap<>();

        String result = "";
        for (int i = 0; i < name.length(); i++) {

            char key = name.charAt(i);
            int value = i;

            if (!removeDups.containsKey(key)) {

                removeDups.put(key, value);
                result = result + key;
            }

        }

        System.out.println(result);
        System.out.println(removeDups);
     
    }
}
