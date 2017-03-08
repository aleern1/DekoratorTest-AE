package sternbackcafe2.getränke;

public abstract class Angebot {
    private String description;
    private double preis;
    
    public Angebot(String description, double preis) {
        this.description = description;
        this.preis = preis;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public double preis() {
        return this.preis;
    }
}
