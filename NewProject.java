/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.newproject;

/**
 *
 * @author Sujal
 */
import java.util.Scanner;
public class NewProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
       double balance = 50000;
       System.out.println("You have balance :"+balance);
       int choice;
        System.out.println("Welcome to ATM Interface");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
             switch (choice) {
                case 1:
                    checkBalance();
                    break;
              /* case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;*/
                            
                case 4:
                    System.out.println("Thank you for using ATM Interface. Visit again!");
                    break;
                default:
                    System.out.println("PLease enter a valid choice . You have entered a invalid choice");
            }
                       scanner.close();
                            
                        }
                             public static void checkBalance(){
                                 
       
       
        
        
        
    }
}
