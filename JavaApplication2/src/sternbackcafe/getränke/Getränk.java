package sternbackcafe.getränke;

public abstract class Getränk {
    private String description;
    private double preis;
    
    public Getränk(String description, double preis) {
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
