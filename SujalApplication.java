package com.mycompany.sujalapplication;
import java.util.Scanner;
public class SujalApplication {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*System.out.println("Enter Your age: ");
        int age = scanner.nextInt();
        System.out.println("Your age is: "+age);*/
        
        //How to calculate total marks and percentage of the subjects.
        
/*        System.out.println("Enter your marks of Physics: ");
        int Physics = scanner.nextInt();
        
         System.out.println("Enter your marks of Chemistry: ");
        int Chemistry= scanner.nextInt();
        
        System.out.println("Enter your marks of Maths: ");
        int Maths= scanner.nextInt();
        
        int TotalMarks = Physics + Chemistry + Maths;
        System.out.println("Your TotalMarks is : "+TotalMarks);
          float Percentage = (Physics + Chemistry + Maths/300)*100;
        System.out.println("Your Percentage is : "+Percentage);*/
        //using if , if-else conditions in statements in age wise discussions
      /*  System.out.println("Enter your age : ");
        int age = scanner.nextInt();
        if(age>18)
        {
            System.out.println("You are an  adult now");
        }
        else if(age>12 && age<18){
            System.out.println("You are a teenager now");
        }
        else
        {
        System.out.println("You are not an  adult");
        }*/
      
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
    /* System.out.println("Enter your first num1 :  ");
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
     System.out.println("Your  result is : "+Result);*/
    }
}
      
      
        
    
