/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner user_input=new Scanner(System.in);
        int incorrectcounter=0;
        while(incorrectcounter<3) {
            Scanner reader= new Scanner(new File("users.txt"));
            System.out.print("Username: ");
            String username=user_input.nextLine();
            System.out.print("Password: ");
            String password=user_input.nextLine();
            passwordReader filereader=new passwordReader();
            if(filereader.read2Lines(reader, username, password)) {
                System.out.println("SUCCESSFUL, YOU ARE LOGGED IN!");
                System.exit(0);
            }
            else if(incorrectcounter<2) {
                System.out.println("USERNAME OR PASSWORD INCORRECT! TRY AGAIN");
                incorrectcounter++;
            } else {
                incorrectcounter++;
            }
        }
        System.out.println("YOU HAVE TRIED TOO MANY TIMES!");
    }
}