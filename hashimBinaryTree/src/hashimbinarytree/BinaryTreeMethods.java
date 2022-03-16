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
public class BinaryTreeMethods {

    Node root;

    BinaryTreeMethods() {

        root = null;

    }

    BinaryTreeMethods(int key) {

        root = new Node(key);
    }

    public Node search(int key) {

        return searchRecursively(root, key);

    }

    private Node searchRecursively(Node root, int key) {

        if (root == null || key == root.key) {

            return root;

        }

        if (root.key > key) {

            return searchRecursively(root.left, key);
        }

        return searchRecursively(root.right, key);

    }

    public void insert(int key) {

        root = insertRecursively(key, root);

    }

    private Node insertRecursively(int key, Node root) {

        if (root == null) {

            root = new Node(key);

            return root;

        }

        if (key < root.key) {

            root.left = insertRecursively(key, root.left);

        } else if (key > root.key) {

            root.right = insertRecursively(key, root.right);

        }

        return root;

    }

    public void inorderTraversal() {

        inorderTraversalRecursively(root);

    }

    private void inorderTraversalRecursively(Node root) {

        if (root != null) {

            inorderTraversalRecursively(root.left);

            System.out.print(root.key + "->");

            inorderTraversalRecursively(root.right);

        }

    }

}
