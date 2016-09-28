/*
Daniel Herbowy
Chaparral Star Academy
birdwathcers v.1
Mr. Davis
4/20/2016
makes birds, adds the ammout of times a bird was seen, and returns
 */
package main;

/**
 *
 * @author Daniel
 */
public class Bird {
    private String Name;
    private String Latinname;
    private int Ammount=0;
    
    public Bird(String name, String latinname) {
        this.Name=name;
        this.Latinname=latinname;
    }
    
    public void Found() {
        Ammount++;
    }
    @Override
    
    public String toString() {
        return (Name+" ("+Latinname+") "+Ammount+" observations");
    }
    
    public String getName() {
        return Name;
    }
        public String getLatinname() {
        return Latinname;
    }
}
