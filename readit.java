/*
Daniel Herbowy
Chaparral Star Academy
Analysis v.1
Mr. Davis
5/2/2016
prints the file
 */

import java.io.File;
import java.util.Scanner;
public class readit {
    
    readit() throws Exception {
        
        File file=new File("codes.txt");
        Scanner reader = new Scanner(file);
        while (reader.hasNext()) {
            String nextLine = reader.nextLine();
            System.out.println(nextLine);
        }
        Thread.sleep(10000);
        //System.exit(0);
    }
}
