/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.pkg1;

import java.util.Scanner;

/**
 *
 * @author devyo
 */
public class Practice1 {
 
static double discount(double pd,int quantity ){
    double discount=((pd*quantity));
            return discount;
  }
     public static void main(String[] args) {
     
       Scanner mangoes=new Scanner(System.in);
       System.out.println("Enter Type");
       String type=mangoes.nextLine();
       System.out.println("Enter Quantity");
       int quantity=mangoes.nextInt();
       
       
       switch(type){
         case "small":
             if(quantity>10 && quantity<=19)
              System.out.println("total:"+((quantity*5)- discount(0.05,quantity*5)));
            
             else if(quantity==20)
              System.out.println("total:"+ ((quantity*5)-discount(0.1,quantity*5)));
             
             else if(quantity>20)
              System.out.println("total:"+ ((quantity*5)-discount(0.2,quantity*5)));
             
             else 
             System.out.println("total:"+ (quantity*5));
             break;
             
              case "medium":
             if(quantity>10 && quantity<=19)
              System.out.println("total:"+((quantity*15)- discount(0.05,quantity*15)));
            
             else if(quantity==20)
              System.out.println("total:"+ ((quantity*15)-discount(0.1,quantity*15)));
             
             else if(quantity>20)
              System.out.println("total:"+ ((quantity*15)-discount(0.2,quantity*15)));
             
             else 
             System.out.println("total:"+ (quantity*15));
             break;
             
              case "huge":
             if(quantity>10 && quantity<=19)
              System.out.println("total:"+((quantity*20)- discount(0.05,quantity*20)));
            
             else if(quantity==20)
              System.out.println("total:"+ ((quantity*20)-discount(0.1,quantity*20)));
             
             else if(quantity>20)
              System.out.println("total:"+ ((quantity*20)-discount(0.2,quantity*20)));
             
             else 
             System.out.println("total:"+ (quantity*20));
             break;
    }
    }
    }
    


