// Aufgabe 1.1
package de.hsbi.swe;

public class Main {
    public static void main(String[] args) {
        Motorrad m = new Motorrad("BMW", "blau", true, false);
        m.zeigeAttribute();
        m.starteMotor();
        m.starteMotor();

        Motorrad x = new Motorrad("Yamaha YZF-R1", "rot", false, true);
        x.zeigeAttribute();
        x.starteMotor();
        x.starteMotor();

        Fahrzeug x1 = new Fahrzeug("Roller", "babyblau");
        x1.zeigeAttribute();

        int anzahlFahrzeuge = Fahrzeug.getInstanzen();
        System.out.println("Die Anzahl der Fahrzeuge beträgt: " + anzahlFahrzeuge);

        Kreis k1 = new Kreis(20);
        double kreisFläche = k1.getFläche();
        System.out.println("Das ist die Fläche des Kreises: " + kreisFläche + "mm^2");

        Kugel K1 = new Kugel(20);
        double kugelVolumen = K1.getVolumen();
        System.out.println("Das ist das Volumen des Kreises: " + kugelVolumen + "mm^3");

        Rechteck r1 = new Rechteck(10, 20);
        double rechteckFläche = r1.getFläche();
        System.out.println("Das ist die Fläche des Rechtecks: " + rechteckFläche + "mm^2");
    }
}

//Aufgabe 1.2