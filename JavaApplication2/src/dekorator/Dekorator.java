package dekorator;

import sternbackcafe2.getränke.Espresso;
import sternbackcafe2.getränke.Getränk;
import sternbackcafe2.zutaten.Milch;

public class Dekorator {

    public static void main(String[] args) {
        Getränk g = new Espresso(new Milch());
        System.out.println(g.getDescription());
        System.out.println(g.preis() + " €");
    }
    
}
