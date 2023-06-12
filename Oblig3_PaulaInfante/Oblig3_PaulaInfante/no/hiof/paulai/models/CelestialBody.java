package no.hiof.paulai.models;

public abstract class CelestialBody {

    protected String name;
    protected double radius, mass;

    public final static double R_KM_TO_M = 1000;
    public final static double GRAVITATIONAL_CONSTANT = 6.67408E-11;

    public CelestialBody(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public abstract double radiusInKm();
    public abstract double massInKg();

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public double getRadius() {return radius;}

    public void setRadius(double radius) {this.radius = radius;}

    public double getMass() {return mass;}

    public void setMass(double mass) {this.mass = mass;}

}
