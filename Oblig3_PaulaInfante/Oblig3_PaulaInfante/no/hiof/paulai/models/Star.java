package no.hiof.paulai.models;

public class Star extends CelestialBody {

    public static final double MSUN_IN_KG= 1.98892E30;
    public static final double RSUN_IN_KM= 695700;

    private int effectiveTemp;

    public Star(String name, double radius, double mass, int effectiveTemp) {

        super(name, radius, mass);
        this.effectiveTemp = effectiveTemp;

    }

    public double radiusInKm() {
        return radius * RSUN_IN_KM;
    }

    public double massInKg() {
        return mass * MSUN_IN_KG;
    }

    public double getSurfaceGravity() {
        return (6.67408E-11 * massInKg()) / Math.pow(radiusInKm()*1000, 2);
    }

    @Override
    public String toString() {
        return "The star " + name + " has a radius of " + radius +
                " Rsun, and a mass of " + mass + " Msun. It's effective temperature is " +
                effectiveTemp + " kelvin.";
    }


    public int getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp(int effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }
}
