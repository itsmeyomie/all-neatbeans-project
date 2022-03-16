/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkylisty;

import java.util.LinkedList;

/**
 *
 * @author devyo
 */
public class Linkylisty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        linked link = new linked();

        link.insert(2);
        link.insert(3);
        link.insert(4);
        link.insert(5);
        link.insert(6);
        link.insert(7);
      
        
      link.midpoint();
      

        link.print();

    }

}
