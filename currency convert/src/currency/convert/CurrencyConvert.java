/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currency.convert;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author devyo
 */
public class CurrencyConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double payment;
        try (Scanner scanner = new Scanner(System.in)) {
            payment = scanner.nextDouble();
        }

        Locale indiaLocale = new Locale("en", "IN");

        /* Create NumberFormats using Locales */
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat canada = NumberFormat.getCurrencyInstance(Locale.CANADA);
        NumberFormat korean = NumberFormat.getCurrencyInstance(Locale.KOREAN);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
        System.out.println("canada: " + canada.format(payment));
        System.out.println("korean: " + korean.format(payment));

    }
}
