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
public class Stacks {

    public static void main(String[] args) {
        stack stacks = new stack();
        stacks.push(20);
        stacks.push(30);
        stacks.push(40);
        stacks.push(50);

        stacks.print();
        stacks.pop();
        stacks.pop();
        System.out.println("     ");
        stacks.print();
    }

}
