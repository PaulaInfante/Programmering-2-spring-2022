package no.hiof.paulai.oblig2;

public class Planet {
    private String name;
    private double radius;
    private double mass;

    Planet (String name, double radius, double mass) {
        this.name=name;
        this.radius=radius;
        this.mass=mass;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }


    public double radiusInKm(){
        return radius * 71492;
    }

    public double radiusInMeters(){
        return radiusInKm() * 1000;}

    public double massInKg(){
        return mass * 1.898E27;
    }

    public double surfaceGravity() {
        return (6.67408E-11 * massInKg()) / Math.pow (radiusInMeters(), 2);
    }

    @Override
    public String toString() { return name + " has a radius of " +radius+ " and has a mass of "+ mass;}

}
