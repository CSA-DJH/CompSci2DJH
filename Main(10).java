/*
Daniel Herbowy
Chaparral Star Academy
birdwathcers v.1
Mr. Davis
4/20/2016
adds birds to a list, adds the number of times a bird was observed, shows the stats of entered birds, shows stats of one bird, and quits
 */
package main;
import java.util.Scanner;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner user_input= new Scanner(System.in);
        
        List<Bird> birdlist= new ArrayList<Bird>(asList());
        String answer="";
       
        while(!answer.equals("quit")) {
            System.out.print("? ");
            answer=user_input.next().toLowerCase().trim();
            
            if(answer.equals("add")) {
                System.out.print("Name: ");
                
                String birdname=user_input.next().toLowerCase().trim();
                System.out.print("Latin Name: ");
                
                Bird bird=new Bird(birdname, user_input.next().toLowerCase().trim());
                birdlist.add(bird);
            }
            
            if(answer.equals("statistics")) {
                
                for(int i=0;i<birdlist.size();i++) {
                    System.out.printf("%s\n",birdlist.get(i));
                }
            }
            if(answer.equals("observation")) {
                System.out.print("What was observed:? ");
                String birdsname=user_input.next().toLowerCase().trim();
                boolean num1=false;
                for(int i=0;i<birdlist.size();i++) {
                    
                    if(birdlist.get(i).getName().equals(birdsname)) {
                        birdlist.get(i).Found();
                        num1=true;
                    } 
                  
                }
                if (num1==false){
                    System.out.println("Is not a bird! ");
                }
                    
                
            }
            if(answer.equals("show")) {
                System.out.print("What? ");
                String birdsname=user_input.next().toLowerCase().trim();
                
                for(int i=0;i<birdlist.size();i++) {
                    
                    if(birdlist.get(i).getName().equals(birdsname)) {
                        System.out.printf("%s\n",birdlist.get(i));
                    } 
                    else {
                        System.out.println("Bird not found! ");
                    }
                }
            }
        }
    }
}

