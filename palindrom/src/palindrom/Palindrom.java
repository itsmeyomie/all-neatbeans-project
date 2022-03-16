 
package palindrom;

import java.util.Scanner;


public class Palindrom {

public static String palindromCheck(String name){ 
    
for (int i = 0, j = (name.length()-1); i<=(name.length()/2)&&j >((name.length()-1)/2) ; i++,j--) {
          if( name.charAt(i)!=name.charAt(j)){
  
      return "Not A Palindrom";
          }}
      return "A Palindrom!";
    }
    public static void main(String[] args) {
        while(true){
        // String input
     Scanner word=new Scanner(System.in);
     System.out.println("Enter a string to check if palindrom");
     String theword=word.nextLine();
         //display
     System.out.println(palindromCheck(theword));
}
}}