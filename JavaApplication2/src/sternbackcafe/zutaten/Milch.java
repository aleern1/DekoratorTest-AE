package sternbackcafe.zutaten;

import sternbackcafe.getränke.Getränk;

public class Milch extends Zutat {
    public Milch(Getränk decorating) {
        super(decorating, "Milch", 0.75);
    }
}
