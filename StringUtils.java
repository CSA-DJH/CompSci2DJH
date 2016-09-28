/*
Daniel Herbowy
Chaparral Star Academy
Book v.1
Mr. Davis
4/14/2016
goes through a string checking for a string

 */
package main;

public class StringUtils {
    static boolean included(String title, String title1) {
        
        if(title.trim().toUpperCase().contains(title1.trim().toUpperCase())) {
            
            return true;
        }
        return false;
    }
}
