/*
Daniel Herbowy
Chaparral Star Academy
Book v.1
Mr. Davis
4/14/2016
defines the title, publisher, year, and returns them
 */
package main;

public class Book {
    String title;
    String publisher;
    int year;
    
    Book(String title, String publisher, int year) {
        this.title=title;
        this.publisher=publisher;
        this.year=year;
    }

    int year() {
        return year;
    }
    
    String title() {
        return title;
    }
    
    String publisher() {
        return publisher;
    }
    
    @Override
    public String toString() {
        return String.format("%s, %s, %s",title,publisher,year);
    }
}
