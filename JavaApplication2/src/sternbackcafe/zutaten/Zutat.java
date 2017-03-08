package sternbackcafe.zutaten;

import sternbackcafe.getränke.Getränk;

public class Zutat extends Getränk {
    private Getränk decorating;
    
    public Zutat(Getränk decorating, String description, double preis) {
        super(description, preis);
        this.decorating = decorating;
    }
    
    @Override
    public double preis() {
        return (this.decorating != null ? this.decorating.preis() : 0) + super.preis();
    }
    
}
