/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fib.with.hashmap;

import java.util.HashMap;

/**
 *
 * @author devyo
 */
public class FibWithHashmap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HashMap<Integer, Integer> store = new HashMap<>();

        System.out.println("fib of the number is =" + fib(20, store));

    }

    public static int fib(int n, HashMap<Integer, Integer> store) {
        System.out.println("store=" + store);
        int key = n;
        if (key <= 1) {
            return key;
        }
        if (store.containsKey(key)) {
            return store.get(key);
        }

        int value = fib(n - 1, store) + fib(n - 2, store);
        store.put(key, value);
        System.out.println("key="+key+" value="+value);
        return value;
    }

}
