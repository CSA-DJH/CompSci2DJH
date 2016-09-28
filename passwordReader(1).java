/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
public class passwordReader {
     {
    }
    boolean read2Lines(Scanner reader, String username, String password) throws Exception {
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