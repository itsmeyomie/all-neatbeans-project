/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romantointeger;

import java.util.HashMap;

/**
 *
 * @author devyo
 */
public class RomanToInteger {

    public static int romanToInt(String s) {
        int result = 0;
        int pVal = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            int val = map.get(s.charAt(i));
            result += val;

            if (pVal < val) {
                result -= 2 * pVal;
            }
            pVal = val;
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "IVV";
        System.out.println(romanToInt(s));
    }

}
