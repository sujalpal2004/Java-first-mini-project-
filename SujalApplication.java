package com.mycompany.sujalapplication;
import java.util.Scanner;
public class SujalApplication {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
      //how to make an calculator in java
      System.out.println("Welcome to Basic Calculator!");
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the operation (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        double result = 0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("cannot be divide by zero");
                    return;
                }
                break;
            default:
                System.out.println("your have entered invalid operation");
                return;
        }

        System.out.println("Result: " + result);
        
     //how to make simple basic calculator using if , else statements
     System.out.println("Enter your first num1 :  ");
     double num1 = scanner.nextDouble();
     
     System.out.println("Enter your second num2 : ");
     double num2 = scanner.nextDouble();
     
     System.out.println("Enter your Operations (+, - , / ,*): ");
     char Operations = scanner.next().charAt(0);
     
     double Result = 0;
     if(Operations == '+')
     {
        Result = num1 + num2;
     }
     else if(Operations =='-')
     {
         Result = num1 -num2;
     }
     else if(Operations =='*')
     {
         Result = num1*num2;
     }
     else if(Operations =='/')
     {
         Result = num1/num2;
         return;
     }
     else{
         System.out.println("Invalid Operations");
         return;
     }
     System.out.println("Your  result is : "+Result);
    }
}
      
      
        
    
