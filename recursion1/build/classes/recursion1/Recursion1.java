/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion1;

import java.util.Scanner;

/**
 *
 * @author devyo
 */
public class Recursion1 {

    public static int factorial(int n) {

        if (n < 2) {
            return 1;
        } else {

            return n * factorial(n - 1);
        }

    }

    public static void sayHi(int times) {
        if (times < 1) {
            System.out.println("done");
        } else {
            System.out.println("hi");

            sayHi(times - 1);
        }

    }

    public static int printBackwards(int num) {
        if (num < 2) {

            return num;

        } else {
            System.out.println(num);
            return printBackwards(num - 1);

        }

    }

    public static boolean palindromCheck(String s) {

        if (s.length() <= 1) {
            return true;
        } else if (s.charAt(0) != s.charAt(s.length() - 1)) {
            System.out.println(s);
            return false;

        }
        System.out.println(s);
        return palindromCheck(s.substring(1, s.length() - 1));
    }

    public static boolean palindromCheck2(String s) {

        return palindromCheck2(s, 0, s.length() - 1);

    }

    public static boolean palindromCheck2(String s, int i, int j) {
        if (j <= i) {

            return true;
        } else if (s.charAt(i) != s.charAt(j)) {
            System.out.println(s);
            return false;

        } else {

            return palindromCheck2(s, i + 1, j - 1);

        }
    }

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        System.out.println(factorial(n));
        sayHi(n);
        System.out.println(printBackwards(n));
        String name = "doooood";

        System.out.println(palindromCheck(name));
        System.out.println(palindromCheck2(name));

    }

}
