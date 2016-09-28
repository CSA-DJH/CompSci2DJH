

/*
Daniel Herbowy
Chaparral Star Academy
Mr. Davis 
4/21/2016
GuessingGame v.1

runs the game twicce

 */
package main;

public class Main {

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        game.play(1,10);
        game.play(1,100);
    }
    
}
