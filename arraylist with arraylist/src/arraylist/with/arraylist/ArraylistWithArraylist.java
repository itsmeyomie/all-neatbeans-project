/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist.with.arraylist;

import java.util.ArrayList;

/**
 *
 * @author devyo
 */
public class ArraylistWithArraylist {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> backeryList = new ArrayList<>();

        backeryList.add("pasta");
        backeryList.add("garlic bread");
        backeryList.add("donuts");

 

        ArrayList<String> produceList = new ArrayList<>();

        produceList.add("tomato");
        produceList.add("kales");
        produceList.add("onions");

//        System.out.println(produceList);
        ArrayList<String> drink = new ArrayList<>();
        drink.add("fanta");
        drink.add("coke");
        drink.add("sprite");

        groceryList.add(drink);
        groceryList.add(produceList);
        groceryList.add(backeryList);

        System.out.println(groceryList);
        System.out.println("..........");
        
        System.out.println(groceryList.get(2).get(2));
        System.out.println("..........");
        
        System.out.println(groceryList.get(1));
        
    }
}
