package de.hsbi.swe;

public class Kugel implements Objekte3D {
    private double radius;

    public Kugel(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolumen() {
        return 4 / 3 * Math.PI * Math.pow(radius, 3);
    }
}
