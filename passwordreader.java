/*
Daniel Herbowy
Chaparral Star Academy
passwordreader v.1
Mr. Davis
4/28/2016
reads a file nad checks if the input is the same
 */
package main;
import java.util.Scanner;
public class passwordreader {
     {
    }
    boolean readlines(Scanner reader, String username, String password) throws Exception {
        while (reader.hasNextLine()) {
            
            String fileline1=reader.nextLine();
            String fileline2=reader.nextLine();
            
            if(fileline1.equals(username)) {
                
                if(fileline2.equals(password)) {
                    return true;
                }
            }
        }
        reader.close();
        return false;
    }
}