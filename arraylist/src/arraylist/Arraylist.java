/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;

/**
 *
 * @author devyo
 */
public class Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String>strings=new ArrayList<>();
       
     String name="boy";
     String name1="girl";
     String name2="child";
     String name3="adult";
     
     
     strings.add(name);
     strings.add(name1);
     strings.add(name2);
     strings.add(name3);
     
        System.out.println(strings.get(3));;
    }
    
}
