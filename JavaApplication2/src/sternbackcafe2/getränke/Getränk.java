package sternbackcafe2.getränke;

import sternbackcafe2.zutaten.Zutat;

public abstract class Getränk extends Angebot {
    private Zutat[] zutaten;
    
    public Getränk(String description, double preis, Zutat...zutaten) {
        super(description, preis);
        this.zutaten = zutaten;
    }
    
    public Zutat[] getZutaten() {
        return this.zutaten;
    }
    
    @Override
    public double preis() {
        double p = super.preis();
        for (Zutat z : this.zutaten)
            p += z.preis();
        return p;
    }
}
