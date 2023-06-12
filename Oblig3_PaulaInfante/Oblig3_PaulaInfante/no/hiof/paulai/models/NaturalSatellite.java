package no.hiof.paulai.models;

public abstract class NaturalSatellite extends CelestialBody{

    private double semiMajorAxis, eccentricity, orbitalPeriod;
    private CelestialBody centralCelestialBody;

    public final static double AstronomicalUnits_IN_KM = 149597871;


    public static final double MJUP_IN_KG = 1.898E27;
    public static final double RJUP_IN_KM = 71492;

    public NaturalSatellite(String name, double radius, double mass, double semiMajorAxis,
                            double eccentricity, double orbitalPeriod, CelestialBody centralCelestialBody) {
        super(name,radius,mass);
        this.semiMajorAxis = semiMajorAxis;
        this.eccentricity = eccentricity;
        this.orbitalPeriod = orbitalPeriod;
        this.centralCelestialBody = centralCelestialBody;
    }

    public double distanceToCentralBody(double degrees) {
    return distanceToCentralBodyInRadians(Math.toRadians(degrees));
    }

    public double distanceToCentralBodyInRadians(double radians) {
        double distanceForAU = ((semiMajorAxis * (1-Math.pow(eccentricity,2))) / (1 + eccentricity * Math.cos(radians)));
        return distanceForAU * AstronomicalUnits_IN_KM;
    }

    public double orbitingVelocity(double distance) {
        return Math.sqrt((CelestialBody.GRAVITATIONAL_CONSTANT * centralCelestialBody.getMass()) /  (distance*R_KM_TO_M));
    }

    public double getSemiMajorAxis() {return semiMajorAxis;}

    public void setSemiMajorAxis(double semiMajorAxis) {this.semiMajorAxis = semiMajorAxis;}

    public double getEccentricity() {return eccentricity;}

    public void setEccentricity(double eccentricity) {this.eccentricity = eccentricity;}

    public double getOrbitalPeriod() {return orbitalPeriod;}

    public void setOrbitalPeriod(double orbitalPeriod) {this.orbitalPeriod = orbitalPeriod;}

    public CelestialBody getCentralCelestialBody() {return centralCelestialBody;}

    public void setCentralCelestialBody(CelestialBody centralCelestialBody) {this.centralCelestialBody = centralCelestialBody;
    }
    public double radiusInKm() {
        return radius * RJUP_IN_KM;
    }

    public double massInKg() {
        return mass * MJUP_IN_KG;
    }

    public double radiusInRearth() {
        return radiusInKm()/6371;
    }

    public double massInMearth() {
        return massInKg()/5.972E24;
    }

    public double getSurfaceGravity() {
        return (6.67408E-11 * massInKg()) / Math.pow(radiusInKm()*1000, 2);
    }

}
