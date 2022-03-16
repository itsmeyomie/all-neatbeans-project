/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.search.tree;

/**
 *
 * @author devyo
 */
public class BinarySearchTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BinarySearchMethods bst=new   BinarySearchMethods ();
       
       bst.insert(10);
       bst.insert(30);
       bst.insert(25);
       bst.insert(28);
       bst.insert(40);
       bst.insert(56);
       bst.insert(12);
       
      bst.inorderTraversal();
     
  
       
    }
    
}
