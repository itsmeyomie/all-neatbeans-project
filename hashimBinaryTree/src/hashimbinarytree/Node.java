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
public class Node {

    Node right;

    Node left;

    int key;

    public Node(int item) {

        this.key = item;

        left = right = null;

    }

}
