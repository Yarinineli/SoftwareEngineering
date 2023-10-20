package de.hsbi.swe;

public class Motorrad extends Fahrzeug {
    private boolean satteltasche;
    private boolean statusMotor;

    public Motorrad(String name, String farbe, boolean satteltasche, boolean statusMotor) {
        super(name, farbe);
        this.satteltasche = satteltasche;
        this.statusMotor = statusMotor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Motorrad)) return false;

        Motorrad motorrad = (Motorrad) o;

        if (isSatteltasche() != motorrad.isSatteltasche()) return false;
        if (isStatusMotor() != motorrad.isStatusMotor()) return false;
        if (!getName().equals(motorrad.getName())) return false;
        return getFarbe().equals(motorrad.getFarbe());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getFarbe().hashCode();
        result = 31 * result + (isSatteltasche() ? 1 : 0);
        result = 31 * result + (isStatusMotor() ? 1 : 0);
        return result;
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

    public boolean isSatteltasche() {
        return satteltasche;
    }

    public void setSatteltasche(boolean satteltasche) {
        this.satteltasche = satteltasche;
    }

    public boolean isStatusMotor() {
        return statusMotor;
    }

    public void setStatusMotor(boolean statusMotor) {
        this.statusMotor = statusMotor;
    }

    public void zeigeAttribute() {
        super.zeigeAttribute();
        if (satteltasche) {
            System.out.println("Satteltasche vorhanden");
        } else {
            System.out.println("Keine Satteltasche vorhanden");
        }
        if (statusMotor) {
            System.out.println("Motor ist an");
        } else {
            System.out.println("Motor ist aus");
        }
    }

    public void starteMotor() {
        if (statusMotor) {
            System.out.println("Motor läuft bereits");
        } else
            System.out.println("Motor wurde jetzt gestartet, jefe");
        statusMotor = true;

    }

    public void stoppeMotor() {
        if (statusMotor) {
            statusMotor = false;
        } else {
            System.out.println("Motor war gar nicht im Betrieb");
        }
    }

    private String name;
    private String farbe;
}
