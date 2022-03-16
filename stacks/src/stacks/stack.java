/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

/**
 *
 * @author devyo
 */
public class stack {

    int stack[] = new int[6];
    int top = 0;

    public void push(int data) {
        stack[top] = data;
        top++;

    }

    public void print() {
        for (int st : stack) {
            System.out.println(st + " ");
        }
    }

    public int pop() {
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }

}
