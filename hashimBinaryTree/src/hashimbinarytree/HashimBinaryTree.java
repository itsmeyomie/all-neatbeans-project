/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashimbinarytree;

/**
 *
 * @author devyo
 */
public class HashimBinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BinaryTreeMethods tree = new BinaryTreeMethods();
        

        tree.insert(75);
        tree.insert(65);
        tree.insert(55);
        tree.insert(45);
        tree.insert(85);
        tree.insert(95);
        tree.insert(85);
        tree.insert(105);
        tree.insert(100);
        tree.insert(1);

        tree.inorderTraversal();
        
        System.out.println( "\n"+tree.search(45)); 

    }

}
