/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teslinkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author devyo
 */
public class TesLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        LinkedList<String>link1=new LinkedList<>();
        link1.add("Apples");
        link1.add("Mangoes");
        link1.add("Bananas");
        link1.add("Oranges");
        link1.add("Berries");
        
        link1.add(3, "pineapples");
        link1.get(0);
        
        
     Iterator<String> iterator;
        iterator = link1.iterator();
      while(iterator.hasNext()){
       if(iterator.next().equals("Mangoes")){
         
          System.out.println("we got em mangoes");
       }
      }
        Queue<String>q=new LinkedList<>();
        q.add("hamisi");
        q.add("rama");
        q.add("amani");
        
          Iterator<String> iterator1=q.iterator();
          while(iterator1.hasNext()){
         System.out.println(iterator1.next()+" ");
          }
          q.peek();
        System.out.println("my names is"+q.peek());
    }
    
}
