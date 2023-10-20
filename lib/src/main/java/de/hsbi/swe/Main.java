// Aufgabe 1.1
package de.hsbi.swe;

public class Main {
    public static void main(String[] args) {
        Motorrad m = new Motorrad("BMW","blau", true, false);
        m.zeigeAttribute(); m.starteMotor(); m.starteMotor();

        Motorrad x = new Motorrad("Yamaha YZF-R1", "rot", false, true);
        x.zeigeAttribute(); x.starteMotor(); x.starteMotor();

        Fahrzeug x1 = new Fahrzeug("Roller", "babyblau");
        x1.zeigeAttribute();

        int anzahlFahrzeuge = Fahrzeug.getInstanzen();
        System.out.println("Die Anzah der Fahrzeuge beträgt: " + anzahlFahrzeuge);
    }
}

//Aufgabe 1.2