/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashex2;

import java.util.HashMap;

/**
 *
 * @author devyo
 */
public class Hashex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
         Integer[] array = {2,3,5,9};
         int len = array.length;
         HashMap<Integer, Integer> list = new HashMap<>();
         int sum = 0;



        for(int i = 0, j = i + 1; i < j && j < len;) {
             sum = array[i] + array[j];
             list.put(i, sum);
             if(list.containsValue(array[j])){
                 System.out.println(array[j] + " is in the array");
             }
             i++;
             j++;

         }
     }
}

