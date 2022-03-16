/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkylisty;

public class linked {

    node head;

    public void insert(int data) {
        node currentNode = head;
        node newNode = new node(data);

        if (head == null) {
            head = newNode;
        } else {

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void print() {
        node currentNode = head;

        while (currentNode.next != null) {

            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;

        }
        System.out.print(currentNode.data + "->");

    }

    public void insertAtPosition(int data, int position) {

        node newNode = new node(data);
        node currentNode = head;

        for (int i = 0; i < position - 1; i++) {
            currentNode = currentNode.next;

        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;

    }

    public void InsertAtHead(int data) {
        node currentNode = new node(data);
        currentNode.next = head;
        head = currentNode;

    }

    public void deleteAtpostion(int position) {
        int count = 0;
        node currentNode = head;

        while (count != position) {

            currentNode = currentNode.next;
            count++;
        }

        currentNode.next = currentNode.next.next;

    }

    public void midpoint() {
        node current = head;
        node current2 = head;
     

        while (current2!= null && current2.next != null) {
            current2 = current2.next.next;
            current = current.next;

        }
        System.out.println(current.data);

    }

}
