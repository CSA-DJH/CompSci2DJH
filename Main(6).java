/*
Daniel Herbowy
Chaparral Star Academy
Main v.1
Mr. Davis
4/28/2016
reads a file and compares it to an input of a password and username
 */
package main;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner user_input=new Scanner(System.in);
        int counter=0;
        while(counter<3) {
            
            Scanner reader= new Scanner(new File("users.txt"));
            System.out.print("Username: ");
            String username=user_input.nextLine();
            System.out.print("Password: ");
            String password=user_input.nextLine();
            passwordreader filereader=new passwordreader();
            
            if(filereader.readlines(reader, username, password)) {
                System.out.println("SUCCESSFUL, YOU ARE LOGGED IN!");
                System.exit(0);
            }
            else if(counter<2) {
                System.out.println("USERNAME OR PASSWORD INCORRECT! TRY AGAIN");
                counter++;
            }
            else {
                counter++;
            }
        }
        System.out.println("YOU HAVE TRIED TOO MANY TIMES!");
    }
}