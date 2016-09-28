
/*
Daniel Herbowy
Chaparral Star Academy
Mr. Davis 
4/21/2016
GuessingGame v.1
makes an AI that guesses the number by halfing an array
 */
package main;

import java.util.Scanner;
public class GuessingGame {
    private Scanner user_input;
    public GuessingGame() {
        this.user_input = new Scanner(System.in);
    }
    public void play(int lowerLimit, int upperLimit) {
        instructions(upperLimit, lowerLimit);
        int guessednum=lowerLimit+(upperLimit-lowerLimit)/2;
        
        while (lowerLimit <= upperLimit) {
            guessednum=lowerLimit+(upperLimit-lowerLimit)/2;
            System.out.println("Is your number greater than "+guessednum +"(y/n)");
            String answer=user_input.next();
            
            if (answer.equals("n")) {
                
                if(guessednum-1==lowerLimit) {
                    guessednum=lowerLimit;
                    upperLimit=lowerLimit;
                }
                upperLimit=guessednum-1;
            } 
            else 
            
                if (answer.equals("y")) { 
                
                    if(guessednum+1==upperLimit) {
                    guessednum=upperLimit;
                    lowerLimit=upperLimit;
                }
                lowerLimit=guessednum+1;
            }
        }
        System.out.println("The number you're thinking of is "+guessednum);
    }
    
    public boolean isGreaterThan(int value) {
        System.out.println("Is your number greater than "+value);
        String answer=user_input.next();
        if (answer.equals("n")) {
            return false;
        }
        else 
        
            if (answer.equals("y")) { 
            return true;
        }
        return false;
    }
    public int average(int firstNumber, int secondNumber) {
        return (firstNumber+secondNumber)/2;
    }


    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + " and " + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking of with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
        System.out.println("");
    }

    public static int howManyTimesHalvable(int number) {

        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}