package sternbackcafe2.getränke;

import sternbackcafe2.zutaten.Zutat;

public class Espresso extends Getränk {
    
    public Espresso(Zutat...zutaten) {
        super("Espresso", 3.99, zutaten);
    }
    
}
