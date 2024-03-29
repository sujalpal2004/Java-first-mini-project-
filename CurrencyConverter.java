package com.mycompany.currencyconverter;

/**
 *
 * @author Sujal
 */
import java.util.Scanner;
public class CurrencyConverter {
      public static void convertToDollars(Double Amount){
                   double Dollars = Amount*83.36f;
                    System.out.println("Your amount in Dollars is :  " + Dollars);
               }
      public static void convertToYen(Double Amount){
          double Yen =Amount*1.82f;
          System.out.println("Your amount in Yen is : "+Yen);
      }
        public static void convertToEuros(Double Amount){
                   double Euros = Amount*89.90f;
                    System.out.println("Amount in Euros: " + Euros);
               }
         public static void convertToAustralianDollars(Double Amount){
                   double AustralianDollars = Amount*54.31f;
                    System.out.println("Amount in AustralianDollars: " + AustralianDollars);
               }
            public static void convertToPounds(Double Amount){
                   double Pounds= Amount*105;
                    System.out.println("Amount in Pounds: " +Pounds);
               }
         
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Currency Converter");
        Double Amount ;
        System.out.println("Enter the amount in Indian Rupees : ");
         Amount = scanner.nextDouble();
           System.out.println("Choose the currency in which you have to convert Indian Rupees : ");
          System.out.println("1. Dollars");
           System.out.println("2. Yen");
            System.out.println("3. Euros");
             System.out.println("4. AustralianDollars");
              System.out.println("5. Pounds");
               int Choice =scanner.nextInt();
               switch (Choice){
                   case 1 : 
                       convertToDollars(Amount);
                       break;
                         case 2 : 
                       convertToYen(Amount);
                       break;
                         case 3 : 
                       convertToEuros(Amount);
                       break;
                         case 4 : 
                       convertToAustralianDollars(Amount);
                       break;
                        case 5 : 
                       convertToPounds(Amount);
                       break;
                         default:
                             System.out.println("You have entered an Invalid Choice.");
                    
               }
             
                       
               
        
    }
}
