/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

public class TemperatureCalculator extends Calc {
        
    public  float tempConverter(float x){
    
     return add(multiply( x,divide(9,5)),32);
    
    }
}
