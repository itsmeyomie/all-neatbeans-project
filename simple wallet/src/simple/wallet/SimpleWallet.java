/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.wallet;

import java.util.Scanner;
public class SimpleWallet {
     
     // static int amount; not in use
     
static boolean  checkPassword(String pin){
       return pin.equals("admin");
  }

static int deposit(int amount,int balance){
       return balance+amount;       
    }   
static int withdraw(int amount, int balance){
return balance-amount;

    
       }   
    

    
    public static void main(String[] args) {
      int balance=2500; // class scope
        int Deposit=1;
        int Withdraw=2;
        int check_balance=3;
        int exit=4;
        
         
    Scanner wallet=new Scanner(System.in);
    System.out.println("Enter pin");
    String pin=wallet.nextLine();
    
    if(checkPassword(pin)){
          OUTER:
          while (true) {
              System.out.println("1.Deposit");
              System.out.println("2.Withdraw");
              System.out.println("3.Check Balance");
              System.out.println("4.Exit");
              int menu=wallet.nextInt();
              switch (menu) {
                  case 1:
                      {
                          System.out.println("Enter amount");
                          int amount=wallet.nextInt();
                          balance = deposit(amount,balance);
                          System.out.println("You have successfully deposited"+" "+amount+" "+"your balance is"+" "+balance);
                          break;
                      }
                  case 2:
                      {
                          System.out.println("Enter amount");
                          int amount=wallet.nextInt();
                          balance = withdraw(amount,balance);
                          if(amount<=balance){
                              System.out.println("You have successfully withdrawn"+" "+amount+" "+"your balance is"+" "+balance);
                          }
                          else{
                              System.out.println("your balance is insufficient");
                          }                 break;
                      }
                  case 3:
                      System.out.println("your balance is "+balance);
                      break;
                  case 4:
                      break ;
                  default:
                      break;
              }
              System.out.println("1.Go to previous menu");
              System.out.println("2.Exit");
              int previous_menu=wallet.nextInt();
              if(previous_menu==1){
                
              }else if(previous_menu==2){
                  break;
              } }
        }
    
   
      
    
}}