/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac;

import java.time.LocalDate;

/**
 *
 * @author devyo
 */
public class Prac {

    public static String findDay(int month, int day, int year) {

        int d = day;
        int m = month;
        int y = year;

        LocalDate date = LocalDate.of(y, m, d);

        return date.getDayOfWeek().toString();

    }

    public static void main(String[] args) {
        findDay(2021,8,21);
    }

}
