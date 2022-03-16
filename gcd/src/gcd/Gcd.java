
package gcd;

import java.util.Scanner;

public class Gcd {
    
      
       
     public static void main (String[] args)
   {		
    
       int num ;
       //Empty String
       String  primeNumbers = "";

       for (int i = -1; i <= 20; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>0; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to 20 are :");
       System.out.println(primeNumbers);
   }
}