/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion.fibonaci;

import java.util.HashMap;

/**
 *
 * @author devyo
 */
public class RecursionFibonaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Integer, Integer> store = new HashMap<>();

        System.out.println("fib of the number is =" + fib(52, store));

    }

    public static int fib(int n, HashMap<Integer, Integer> store) {
        System.out.println("store=" + store);
        if (n <= 1) {
            return n;
        }
        if (store.containsKey(n)) {
            return store.get(n);
        }

        int value = fib(n - 1, store) + fib(n - 2, store);
        store.put(n, value);
        return value;
    }

}
