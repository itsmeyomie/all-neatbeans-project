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
public class BinarySearchMethods {

    Node root;

    public BinarySearchMethods() {
        root = null;
    }

    public void insert(int value) {
        root = insertRecursively(root, value);
    }

    private Node insertRecursively(Node root, int value) {

        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertRecursively(root.left, value);
        } else if (value > root.value) {
            root.right = insertRecursively(root.right, value);
        }
        return root;
    }

    public void search(int key) {
        int value = key;
        root = searchRecursively(root, value);

    }

    private Node searchRecursively(Node root, int value) {
        if (root == null || value == root.value) {
            return root;

        }
        if (root.value > value) {

            return searchRecursively(root.left, value);
        }
          System.out.println(value+"found");
        return searchRecursively(root.right, value);

    }

    public void inorderTraversal() {

        inorderTraversalRecursively(root);

    }

    private void inorderTraversalRecursively(Node root) {

        if (root != null) {

            inorderTraversalRecursively(root.left);

            System.out.print(root.value + "->");

            inorderTraversalRecursively(root.right);

        }

    }

}
