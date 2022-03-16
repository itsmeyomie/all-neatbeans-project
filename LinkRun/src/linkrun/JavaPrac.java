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
public class JavaPrac {

    protected Node head;

    public Node InsertHead(Node newNode) {
        if (head != null) {
            newNode.setNextNode(head);
            this.head = newNode;
        }
        return head;
    }

    public Node deleteHead() {
        head = head.getNextNode();
        return head;

    }

    public Node getPosition(int position) {
        int counter = 0;
        Node current = head;
        while (true) {
            if (counter != position) {
                current.getNextNode();
                counter++;

            }
            return current;

        }
    }
}
