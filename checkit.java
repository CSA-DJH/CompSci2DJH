/*
Daniel Herbowy
Chaparral Star Academy
Analysis v.1
Mr. Davis
5/2/2016
checks if there is a password for the one entered
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class checkit {
    checkit() throws Exception {
        
        File file=new File("codes.txt");
        Scanner fileReader = new Scanner(file);
        Scanner reader = new Scanner(System.in);
        System.out.println("please enter the password: ");
        String input=reader.nextLine();
        
        while (fileReader.hasNext()) {
            String nextLine = fileReader.nextLine();
            
            if(input.equals(nextLine)) {
                System.out.println("LOGIN COMPLETE");
                PrintWriter writer= new PrintWriter("codes.txt");
                writer.write("");
                System.exit(0);
            }
            else{
                System.out.println("That is incorrect");
            }
        }
        Thread.sleep(1000);
    }
}
