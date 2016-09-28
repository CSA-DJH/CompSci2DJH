/*
Daniel Herbowy
Chaparral Star Academy
Gradedistribution v.1
Mr. Davis
4/17/2016
gets inputs and determines the ranking and acceptance rate of a score.
 */
package main;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("Type exam scores, -1 completes:");
        Scanner scanner = new Scanner(System.in);
        doSomething(scanner);
    }
    
    public static void doSomething(Scanner scanner) {
        int totinput=0;
        ArrayList<Integer> numbers =new ArrayList<Integer>();
        
        while(totinput!=-1) {
            totinput =scanner.nextInt();
            
            if(totinput>-1 && totinput<61) {
                numbers.add(totinput);
            }
            else{
                if(totinput!=-1){
                System.out.println("Invalid input");
            }
        }
        }
        double allScores=numbers.size();
        
        System.out.println("Grade Distribution: ");
        
        System.out.print("5: ");
        Starsprint(numbers, 61, 50);

        System.out.print("\n4: ");
        Starsprint(numbers, 50, 45);
        
        System.out.print("\n3: ");
        Starsprint(numbers, 45, 40);
        
        System.out.print("\n2: ");
        Starsprint(numbers, 40, 35);
        
        System.out.print("\n1: ");
        Starsprint(numbers, 35, 30);
        
        System.out.print("\n0: ");
        for(int i=0;i<numbers.size();i++) {
            if(numbers.get(i)<30) {
                System.out.print("*");
                numbers.remove(i);
            }
        }
        System.out.println("");
        double acceptance=((100*numbers.size()/allScores));
        System.out.println("Acceptance percentage: "+acceptance);
    }
    public static void Starsprint(ArrayList<Integer> numbers, int num1, int num2) {
        
        for (Integer number : numbers) {
            
            if (number < num1 && number >= num2) {
                System.out.print("*");
            }
        }
    }
}
