/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordcheck;

import java.util.Scanner;

/**
 *
 * @author devyo
 */
public class Passwordcheck {

    Scanner pw = new Scanner(System.in);

    public void checkPassword() {

        System.out.println("Enter password");
        String password = pw.nextLine();

        if (password.equals("yomie")) {
            System.out.println("CORRECT PASSWORD WELCOME..");
        } else if (!password.equals("yomie")) {
            for (int i = 0; i < 2; i++) {
                System.out.println("INCORRECT PASSWORD TRY AGAIN!!");
                password = pw.nextLine();

                if (password.equals("yomie")) {
                    System.out.println("CORRECT PASSWORD WELCOME!");
                    break;
                } else if (i == 1 && !password.equals("yomie")) {
                    System.out.println("ERROR WRONG PASSWORD EXITING...");
                }

            }

        }

    }

    public static void main(String[] args) {

        new Passwordcheck().checkPassword();

    }

}
