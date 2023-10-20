package de.hsbi.swe;

public class Rechteck implements Objekte2D {
    private double länge;
    private double breite;

    public Rechteck(double länge, double breite) {
        this.länge = länge;
        this.breite = breite;
    }


    public double getLänge() {
        return länge;
    }

    public void setLänge(double länge) {
        this.länge = länge;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    @Override
    public double getFläche() {
        return länge * breite;
    }
}
