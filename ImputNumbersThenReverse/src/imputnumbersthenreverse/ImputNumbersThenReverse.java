/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imputnumbersthenreverse;

import java.util.Scanner;

/**
 *
 * @author devyo
 */
public class ImputNumbersThenReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter  input  numbers");
       
        int number = scan.nextInt();

        int array[] = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scan.nextInt();
            System.out.println(i);
        }

        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        System.out.println("reversed numbers are-->");
        
        // Prints each sequential element in array a
        for (int i = array.length-1; i >=0; i--) {
            System.out.println(array[i]+" ");
        }
    }
}


