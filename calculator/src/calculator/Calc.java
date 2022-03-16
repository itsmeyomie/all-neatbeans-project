/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author devyo
 */
abstract public class Calc {
 

   
public static float add(float x,float y) {
       return x + y;
    }

 
  
  public static float multiply(float x,float y) {
        return x * y;
    }

  public static float divide(float x,float y) {
        return x / y;
    }

  public static float subtract(float x,float y) {
        return x - y;
    }
  }

