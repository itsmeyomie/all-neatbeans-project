/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalc;

import java.util.Scanner;


public class Simplecalc {
    public static int add(int x, int y) {
        return x + y;
    }

   public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return x / y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }
   
   static void compute(String action,int first,int second){
        switch (action) {
            case "+":
                System.out.println(add(first, second));
                break;
            case "-":
                System.out.println(subtract(first, second));
                break;
            case "x":
                System.out.println(multiply(first, second));
                break;
            case "/":
                System.out.println(divide(first, second));
                break;
            default:
                System.out.println("Wrong Input, Try again ...");
            }
    }  

       static void calculator() {       
        while (true) {
            Scanner num = new Scanner(System.in);
            System.out.println("Enter first number");
            int first = num.nextInt();

            System.out.println("Enter second number");
            int second = num.nextInt();

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter action");
            String action = scan.nextLine();
            //compute user values
            compute(action,first,second);           
        }
    }

    public static void main(String[] args) {
        calculator();      
    }
}