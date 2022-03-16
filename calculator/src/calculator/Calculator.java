/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
 
public class Calculator {

   
    
    public static void main(String[] args) {

  Scientificcalculator one=new Scientificcalculator();
  System.out.println( one.Squareroot(64));
  
  TemperatureCalculator first=new TemperatureCalculator();
   System.out.println(first.tempConverter(7));
   
     Scientificcalculator  sec=new  Scientificcalculator ();
   System.out.println(sec.multiply(5,7));
  
    }

  
}
