/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

import java.util.Scanner;

/**
 *
 * @author devyo
 */
public class Date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date dateToday = new Date();
        System.out.println(dateToday);

        System.out.println(Integer.parseInt("5"));
        System.out.println(Double.parseDouble("13"));
        System.out.println(Float.parseFloat("34"));

        int income = 10000;
        boolean highIncome = (income > 100000);
        System.out.println(highIncome);

        String PlaneAlocation = income > 100000 ? "FirstClass" : "secondClass";

        System.out.println(PlaneAlocation);

        Scanner number = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number");

            int num = number.nextInt();
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (num % 5 == 0) {
                System.out.println("fizz");
            } else if (num % 3 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(num);
            }

        }
    }

}
