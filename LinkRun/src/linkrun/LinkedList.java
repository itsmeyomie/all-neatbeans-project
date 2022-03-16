/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkrun;

/**
 *
 * @author devyo
 */
public class LinkedList {

    private Node head;

    public int length() {

        int len = 0;

        Node current = this.head;

        while (current != null) {

            current = current.getNextNode();
            len++;
        }

        return len;

    }

    public void reverseList() {

        Node current = this.head;

        Node previous = null;

        Node next = null;

        while (current != null) {

            next = current.getNextNode();

            current.setNextNode(previous);

            previous = current;

            current = next;

        }

        head = previous;

    }

    public Node search(int value) {

        Node current = this.head;

        while (current != null) {

            if (current.getData() == value) {

                return current;

            }

            current = current.getNextNode();

        }

        return null;

    }

    public void deleteAtPosition(int position) {
        int counter = 0;

        Node current = this.head;
        while (counter != position - 1) {

            current = current.getNextNode();
            counter++;

        }
        current.setNextNode(current.getNextNode().getNextNode());
    }

    public void insertAtHead(int data) {

        Node newNode = new Node(data);
        newNode.setNextNode(head);
        head = newNode;

    }

    public void deleteHead() {
        if (head.getNextNode() != null) {

            Node current = head;

            head = current.getNextNode();

        } else {
            head = null;
        }
    }

    public Node insertAtPosition(int position, int data) {
        int counter = 1;

        Node current = head;
        Node newNode = new Node(data);

        if (head == null) {
            return null;
        }

        while (current.getNextNode() != null) {
            if (counter == position - 1) {
                Node tempNode = current.getNextNode();
                newNode.setNextNode(tempNode);
                current.setNextNode(newNode);
                return head;
            }

            current = current.getNextNode();
            counter++;
        }

        return head;
    }

    public Node insertATtail(Node newNode) {

        if (head == null) {
            return newNode;
        }
        Node current = this.head;

        while (current.getNextNode() != null) {
            current = current.getNextNode();
        }

        current.setNextNode(newNode);
        return head;

    }

    public Node deleteTail() {
        Node current = this.head;
        if (head == null) {
            return null;
        }

        if (head.getNextNode() == null) {
            deleteHead();
            return null;
        }
        while (current.getNextNode().getNextNode() != null) {
            current = current.getNextNode();
        }
        current.setNextNode(null);

        return head;
    }

    @Override
    public String toString() {

        String result = "[";

        Node current = this.head;

        while (current != null) {

            result += current.toString() + "->";

            current = current.getNextNode();
        }
        result += "]";

        return "LinkedList: " + result;
    }

}
