/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.pkg3;

import java.util.Scanner;


public class Practice3 {

static int getAverage(int marks){
int average=marks/5;
return average;

}
 

static char getGrading(int avarage){
char Grade = 0 ; 
   
if(avarage>=80&& avarage<=100){
  
Grade = 'A';
}
 else if(avarage>=70&& avarage<=79){
  
Grade = 'B';
 }
 else if(avarage>=60&& avarage<=69){
  
Grade = 'C';
 }
 else if(avarage>=41&& avarage<=59){
  
Grade = 'D';
 }
 else if(avarage>=0&&avarage<=40){
  
Grade = 'E';
 }
    return Grade;
 }
static String getPromotion(int avarage){
    
    if(avarage>40){
   return " YES" ;
    }
 
   return " NO";
}

static void calc(){
  Scanner mark=new Scanner(System.in);
      System.out.println("Enter marks");
      int marks=mark.nextInt();

 

     System.out.println("Average:"+getAverage(marks));
     System.out.println("Grade:"+getGrading(getAverage(marks)));
     System.out.println("promoted"+getPromotion(getAverage(marks)));
      



}
  

    public static void main(String[] args) {
            calc();
            
            }}


