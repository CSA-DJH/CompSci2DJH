/*
Daniel Herbowy
Chaparral Star Academy
ReadAFile v.1
Mr. Davis
4/24/2016
prints all lines of a text file
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            
            Scanner reader = new Scanner(file);
            
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            
            reader.close();
        } catch (FileNotFoundException x) {
            return;
        }
    }
}