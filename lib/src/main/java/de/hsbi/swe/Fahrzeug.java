package de.hsbi.swe;

public class Fahrzeug {
    private String name;
    private String farbe;
    private static int instanzen = 0;

    public Fahrzeug(String name, String farbe) {
        this.name = name;
        this.farbe = farbe;
        instanzen++;
    }
    public static int getInstanzen() {
        return instanzen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
    public void zeigeAttribute() {
        System.out.println("Name: " + name);
        System.out.println("Farbe: " + farbe);
    }
}

