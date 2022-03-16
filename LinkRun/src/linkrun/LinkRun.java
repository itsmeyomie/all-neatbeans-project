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
public class LinkRun {

    static Node head;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        Node node1 = new Node(5);
        Node node2 = new Node(12);
        Node node3 = new Node(6);
        Node node4 = new Node(7);
        Node node5 = new Node(90);

        node1.setNextNode(node2);
        node2.setNextNode(node3);
        node3.setNextNode(node4);
        node4.setNextNode(node5);

        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtHead(3);
        list.insertAtHead(4);
        list.insertAtHead(5);

        list.insertAtPosition(3, 7);
        list.reverseList();

        System.out.println(list.toString());
        list.reverseList();
        System.out.println(list.toString());
    }

}
