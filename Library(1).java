/*
Daniel Herbowy
Chaparral Star Academy
library v.1
Mr. Davis
4/14/2016
goes through the arrylist checking for publisher,title, and year and the returns them.
 */
package main;

import java.util.ArrayList;
import static java.util.Arrays.asList;
public class Library {
    
    public ArrayList<Book> booklist=new ArrayList<Book>(asList());
    
        public void addBook(Book newBook) {
        booklist.add(newBook);
    }

    public ArrayList<Book> searchByTitle(String title) {
        
        ArrayList<Book> List=new ArrayList<Book>(asList());
        
            for(Book book : booklist) {
        
                if(StringUtils.included(book.title(), title)) {
                    List.add(book);
            }
        }
             return List;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
      
        ArrayList<Book> List=new ArrayList<Book>(asList());
        
            for(Book book : booklist) {
        
                if(StringUtils.included(book.publisher(), publisher)) {
                    List.add(book);
            }
        }
            return List;
    }

    ArrayList<Book> searchByYear(int year) {
       
        ArrayList<Book> List=new ArrayList<Book>(asList());
        
            for(Book book : booklist) {
        
                if(book.year()==year) {
                    List.add(book);
            }
        }
            return List;
    }

    public void printBooks() {
        
        for(Book book : booklist) {
            System.out.printf("%s\n",book);
        }
    }
}
