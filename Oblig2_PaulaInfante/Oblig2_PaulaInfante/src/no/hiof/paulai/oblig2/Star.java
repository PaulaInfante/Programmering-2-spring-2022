package no.hiof.paulai.oblig2;

public class Star {
    private String name;
    private double radius;
    private double mass;
    private double effectiveTemp;

    Star (String name, double radius, double mass, double effectiveTemp){
        this.name = name;
        this.radius =radius;
        this.mass = mass;
        this.effectiveTemp = effectiveTemp;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public double getRadius() {return radius;}

    public void setRadius(double radius) {this.radius = radius;}

    public double getMass() {return mass;}

    public void setMass(double mass) {this.mass = mass;}

    public double getEffectiveTemp() {return effectiveTemp;}

    public void setEffectiveTemp(double effectiveTemp) {this.effectiveTemp = effectiveTemp;}

    public double massInKg() {
        return mass * 1.98892E30;
    }

    public double radiusInKm() {
        return radius * 695700;
    }

    @Override
    public String toString(){
        return name+" has a radius of "+radius+" a mass of "+mass+" and an effective temperature of "+ effectiveTemp;
    }

}
