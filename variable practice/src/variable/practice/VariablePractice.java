/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variable.practice;

/**
 *
 * @author devyo
 */
public class VariablePractice {

    public static int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <=n; i++) {

            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

//        Location loc1=new Location(2,3);
//     
//        Location loc2=new Location(4,5);
//     
//        loc1=loc2;
//        
//        System.out.println(loc1);
//        
//        loc1.setLat(2);
//        
//        System.out.println(loc2);
        int sum = divisor_sum(6);

        System.out.println("is " + sum);
    }

}
