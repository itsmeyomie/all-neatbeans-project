/*
 * To change this license header, choose License Headers c Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palind;

/**
 *
 * @author devyo
 */
public class Palind {

    public static Boolean palindrom(int x) {
        String name = String.valueOf(x);

        for (int i = 0, j = (name.length() - 1); i <= (name.length() / 2) && j > ((name.length() - 1) / 2); i++, j--) {
            if (name.charAt(i) != name.charAt(j)) {
                return false;

            } 
     
        }
        return true;
    }
    

    public static void main(String[] args) {

        int x = 122;

        System.out.println(palindrom(x));
    }
}
