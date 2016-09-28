/*
Daniel Herbowy
Chaparral Star Academy
4/29/2016
Mr. Davis
writeCheck v.1
asks for an input which is then written to a file.
*/
package main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main { 
    
    public static void main(String[] args) throws IOException { 
        
        Scanner user_input= new Scanner(System.in);
        System.out.print("What would you like to write to the file?: ");
        
        FileWriter fw = new FileWriter("file.txt");
        fw.write(user_input.nextLine());
        
        System.out.println("Your text has been successfully written to the file!");
        fw.close();
    } 
} 
