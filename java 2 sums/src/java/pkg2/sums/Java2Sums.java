/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.pkg2.sums;

import java.util.Arrays;

/**
 *
 * @author devyo
 */
public class Java2Sums {

    public static int[] twoSum(int[] nums, int target) {
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] + nums[i] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }

public static void main(String[] args) {
        int array[]={2,3,4,5,6,7};
        int target=9;
        

      System.out.println("what");
    }
    
}
