/*
Daniel Herbowy
Chaparral Star Academy
Analysis v.1
Mr. Davis
4/26/2016
prints selected strings from a text files
 */
package main;


import java.io.File;
import java.util.Scanner;


public class Printer {
    

    Scanner reader = null;
    
     public Printer(String fileName) throws Exception {
        File file = new File(fileName);
        reader = new Scanner(file);
        
    }
    public void printLinesWhichContain(String word) {
        
        while (reader.hasNextLine()){
            String num1=reader.nextLine();
            
            if(num1.contains(word)) {
                System.out.println(num1);
            }
            
        }
    }
}