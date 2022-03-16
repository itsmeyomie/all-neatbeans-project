/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcdd;

import java.util.Scanner;

/**
 *
 * @author devyo
 */
public class Gcdd { 
public static int findGcd(int arr[]){
    

int gcd=1;

int min=arr[1];

for(int i=0;i<arr.length;i++){
    //edge case
     if(arr[i]==1){
        return 1;
      }
     if(arr[i]==0){
        return 0;
      }
     if(arr[i]<min){
         min=arr[i];
     }
}
   for(int i=1;i<=min;i++){  
      for(int j=0;j<arr.length;j++){
          if(arr[j] % i !=0){
           break;
          }
          else{
          if(j==arr.length-1){
          gcd=i;
          }
        }
          
      }
   }
 return gcd;
}
public static void main(String[] args) {
        
     //Enter amount of numbers to be tested
     Scanner size=new Scanner(System.in);
     System.out.println("Enter amount of numbers ");//array size
     int numbers=size.nextInt();
     int arr[]=new int[numbers];
     
     //Enter the numbers /=
     for(int i=0;i<numbers;i++){
     Scanner enter =new Scanner(System.in); 
     System.out.println("Enter  number "+(i+1)+" ");//elements in the array
     int number=enter.nextInt();
     arr[i]=number;
     }
    
     //find the gcd
     int gcd=findGcd(arr);
     
     //return gcd 
     
     System.out.println("gcd of numbers is "+gcd);
     
     
    }
    }
    

