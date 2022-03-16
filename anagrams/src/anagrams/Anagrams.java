/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagrams;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author devyo
 */
public class Anagrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);
        ArrayList<ArrayList<Integer>> lList = new ArrayList<>();
        lList.add(aList);

        for (ArrayList lists : lList) {
            System.out.println(lList);
        }
        for (Integer list : aList) {
            System.out.println(list);
        }
        
    }

}
