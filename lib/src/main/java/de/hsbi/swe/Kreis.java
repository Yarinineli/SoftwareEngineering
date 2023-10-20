package de.hsbi.swe;

public class Kreis implements Objekte2D {
    private double radius;

    public Kreis(double radius) {
        this.radius = radius;
    }

    @Override
    public double getFläche() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
