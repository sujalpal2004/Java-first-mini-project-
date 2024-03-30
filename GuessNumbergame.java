package com.mycompany.guessnumbergame;
import java.util.Scanner;
import java.util.Random;
public class GuessNumbergame {
    private final int numberToGuess;
    private int guessedNumber;
    
    public GuessNumbergame(){
        Random random =new Random();
        this.numberToGuess = random.nextInt(5);
    }
    public int getguessedNumber(){
        return guessedNumber;
    }
    public void setguessedNumber(int guessedNumber){
        this.guessedNumber = guessedNumber;
    }
    public boolean isCorrectGuess(){
        return guessedNumber == numberToGuess;
    }
    public static void main(String[] args) {
        GuessNumbergame game =new  GuessNumbergame();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Guess the Number game!");
        System.out.println("Guess a number between 1 and 5");
        
        while(true){
            System.out.println("Enter the number you have guessed : ");
            int guess =scanner.nextInt();
            game.setguessedNumber(guess);
            
            if(game.isCorrectGuess()){
                System.out.println("Congratulations ! You have guessed the correct number");
            }
            else{
                System.out.println("Incorrect guess.Better luck next time");
            }
        }
        
        
    }
}
