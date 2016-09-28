/*
Daniel Herbowy
Chaparral Star Academy
Analysis v.1
Mr. Davis
4/26/2016
goes thrtough a file counting the characters and lines
 */
package main;

import java.io.File;
import java.util.Scanner;

public class Analysis {
    
  
    private int Totchars=0;
    private int Totline=0;
    
    Analysis(File file) throws Exception {
       
        Scanner reader = new Scanner(file);
        
        while (reader.hasNext()) {
            
            String nextLine = reader.nextLine();
            Totchars+=nextLine.length();
            
            ++Totline;
        }
        reader.close();
    }
    public int lines() {
        return Totline;
    }
    public int characters() {
        return Totchars+Totline;
    }
}
