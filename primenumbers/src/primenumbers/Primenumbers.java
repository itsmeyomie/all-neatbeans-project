/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumbers;

import java.util.Scanner;

/**
 *
 * @author devyo
 */
public class Primenumbers {
public static boolean isPrime(int num){
for(int i=2;i<num;i++){
   if(num%i==0)
     return false;

}
return true;
        
}
public static String primes(int num){
    

     String primes=",";
 for(int i=1;i<=num;i++){
        if(isPrime(i))
      primes=primes+i+",";
      



}return primes;
}

    public static void main(String[] args) {
      //display
     
     String x="";
     Scanner size=new Scanner(System.in);
     System.out.println("Enter number ");
     int numbers=size.nextInt();
    
     System.out.println("prime numbers are"+ primes(numbers));
    }
     
}
