/*
Daniel Herbowy
Mr Davis
Chaparral Star Academy
6/5/16
finalproject v.1
so far the base game is in place,
 */
package main;

/**
 *
 * @author dA
 */

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import static java.lang.Math.random;
import java.util.Random;
public class Main {


    public static void main(String[] args) throws Exception{


Scanner user_input=new Scanner(System.in);
    System.out.println("Hello!");
    
    System.out.print("What is your name? ");
    String user_name=user_input.nextLine();
    System.out.println("Hi "+user_name+"!");
    

            File file = new File("characters.txt");
            
            Scanner reader = new Scanner(file);
            
           System.out.println("The Classes are: Human, Brute, Bandito, Plebian");

           System.out.print("What class would you like to play as?(must be exact spelling) ");
    
    String characterpicked=user_input.nextLine();
   while (reader.hasNextLine()){
            String num1=reader.nextLine();
            
            if(num1.equals(characterpicked)) {
                System.out.println("You picked "+characterpicked);
                
            }
            
   }
   FileWriter fw = new FileWriter("finalprojectplayer.txt");
    

        
        
    if ("Human".equals(characterpicked)){
    


       System.out.println("What starting weapon would you like to choose?");
       
       System.out.println("Your options are: Chopping axe(1) or Wooden baseball bat(2) ");
       int weapon=user_input.nextInt();
       if (weapon==1){
           fw.write("Chopping axe");
           System.out.println("You picked Chopping axe");
           fw.close();
           
           
                   
       }else{
           if(weapon=='2'){
               fw.write("Wooden baseball bat");
              System.out.println("You picked Wooden baseball bat");
              fw.close();
           }
       }
    }
    
if ("Brute".equals(characterpicked)){
    

    
       System.out.println("What starting weapon would you like to choose?");
       
       System.out.println("Your options are: Sledgehammer(1) or Rock(2) ");
       int weapon=user_input.nextInt();
       if (weapon==1){
           
           fw.write("Sledgehammer");
           System.out.println("You picked sledgehammer");
           fw.close();
           
           
                   
       }else{
           if(weapon=='2'){
               fw.write("rock");
              System.out.println("You picked rock");
              fw.close();
           }
       }   
            }

if ("Bandito".equals(characterpicked)){
       System.out.println("What starting weapon would you like to choose?");
       
       System.out.println("Your options are: Switchblade(1) or Spike gloves(2) ");
       int weapon=user_input.nextInt();
       if (weapon==1){
           
           fw.write("Switchblade");
           System.out.println("You picked switchblade");
           fw.close();
                      
       }else{
           if(weapon=='2'){
               fw.write("Spike Gloves");
              System.out.println("You picked Spike Gloves");
              fw.close();
           }
       }   
            }
if ("Plebian".equals(characterpicked)){
       System.out.println("What starting weapon would you like to choose?");
       
       System.out.println("Your options are: fists(1) or fists(2) ");
       int weapon=user_input.nextInt();
       if (weapon==1){
           
           fw.write("Switchblade");
           System.out.println("You picked fists");
           fw.close();
                      
       }else{
           if(weapon=='2'){
               fw.write("Spike Gloves");
              System.out.println("You picked fists");
              fw.close();
           }
       }   
            }


    System.out.println("You were a farmer until one day the evil Spartals came to your farm to collect taxes. You grabbed the nearest weapon, and fended off the Spartals because you had enough of their repressive ways!");
    System.out.println("You swear to destroy the evil regime and bring justice to the land!!");
    System.out.println("And with that you set off to destroy down the evil king, Turtus.");
    

    System.out.println("Would you like to go to the city(1), or to the small town(2)?") ;     
    int town=user_input.nextInt();
        if (town==1){
        System.out.println("You decided to go towards the city.");
    }else{
        if (town==2){
        System.out.println("You decided to go towards the town.");

    }
}
    
    int totalhealth=100;
Random rand = new Random();  
int num11=rand.nextInt(2);
    if(num11==0){
        System.out.println("You made it into town safely");
    }else{
        if(num11==1){
            System.out.println("You were attacked on your way to town");

            

        int enemyhealth=35;
        
  
            while (enemyhealth>=0){
                int enemyattack=rand.nextInt(11);
                int playerattack=rand.nextInt(26);
                System.out.println("You attacked for "+playerattack+" damage");
                enemyhealth=(enemyhealth-playerattack);
                Thread.sleep(2000);
                System.out.println("The Spider attacked you for "+enemyattack+" damage !");
                totalhealth=(totalhealth-enemyattack);
                 Thread.sleep(2000);
                if (totalhealth<=0){
                    System.out.println("You died");
                System.exit(1);
                }
                
                System.out.println(totalhealth+" is your remaining health.");
             Thread.sleep(2000);
            
        
            
                    }
            System.out.println("You killed the spider!");
            System.out.println("You made it into town");
        }
    }

    System.out.println("Now that you are in town, would you like to heal(1) or move on toward the outpost(2)");
    int adventure=user_input.nextInt();
    if (adventure==1){
        System.out.println("You regain all of your health and begin moving towards the outpost");
        totalhealth=100;
    }else{
        System.out.println("You move towards the outpost");
}
    
            int enemyhealth=50;
 int random2=rand.nextInt(2);       
if (random2==0){  
    System.out.println("On you way to the outpost you were ambushed by hitmen");
            while (enemyhealth>=0){
                int enemyattack=rand.nextInt(11);
                int playerattack=rand.nextInt(26);
                System.out.println("You attacked for "+playerattack+" damage");
                enemyhealth=(enemyhealth-playerattack);
                Thread.sleep(2000);
                System.out.println("The hitmen attacked you for "+enemyattack+" damage !");
                totalhealth=(totalhealth-enemyattack);
                 Thread.sleep(2000);
                if (totalhealth<=0){
                    System.out.println("You died");
                System.exit(1);
                }
                
                System.out.println(totalhealth+" is your remaining health.");
             Thread.sleep(2000);
            
           
            
                    }
            System.out.println("You killed the hitmen!");
}else{
    if(random2==1){
        System.out.println("You ade it to the outpost without being attacked");
    }
}
    
    System.out.println("You are at the outpost, would you like to stealthly retreive the map to the castle(1), or fight for it(2)?");
    
       
    int attacking=user_input.nextInt();
    if (attacking==1){
        System.out.println("You stealthly reteive the map to the castle and start going towards it");
       
    }else{
        System.out.println("You attack the outpost");

    
            int enemyhealthpost=50;
       
while (enemyhealthpost>=0){
                int enemyattack=rand.nextInt(11);
                int playerattack=rand.nextInt(26);
                System.out.println("You attacked for "+playerattack+" damage");
                enemyhealthpost=(enemyhealthpost-playerattack);
                Thread.sleep(2000);
                System.out.println("The outpost solders attacked you for "+enemyattack+" damage !");
                totalhealth=(totalhealth-enemyattack);
                 Thread.sleep(2000);
                if (totalhealth<=0){
                    System.out.println("You died");
                System.exit(1);
                }
                
                System.out.println(totalhealth+" is your remaining health.");
             Thread.sleep(2000);
            
       
            
                    }
            System.out.println("You defeated the outpost!");
            System.out.println("You recover the map!");
            System.out.println("Would you like to use a health kit(1) or increase your damage(2)?");
                int advantage=user_input.nextInt();
    if (advantage==1){
        System.out.println("You regain all of your health and begin moving towards the castle");
        totalhealth=100;
    }else{
        System.out.println("You increase your damage and start moving towards the castle");
}
            
}
                int bosshealth=100;
       
while (bosshealth>=0){
                int enemyattack=rand.nextInt(11);
                int playerattack=rand.nextInt(26);
                System.out.println("You attacked for "+playerattack+" damage");
                bosshealth=(bosshealth-playerattack);
                Thread.sleep(2000);
                System.out.println("The King Turtus attacked you for "+enemyattack+" damage !");
                totalhealth=(totalhealth-enemyattack);
                 Thread.sleep(2000);
                if (totalhealth<=0){
                    System.out.println("You died");
                System.exit(1);
                }
                
                System.out.println(totalhealth+" is your remaining health.");
             Thread.sleep(2000);
            
           
            
                    }
            System.out.println("You defeated the King!");
    
    
    
}
    }
    
    
    
    
    

    




