package no.hiof.paulai.models;

public class Planet extends NaturalSatellite {



    public Planet(String name, double radius, double mass, double semiMajorAxis,
                  double eccentricity, double orbitalPeriod, CelestialBody centralCelestialBody) {

        super (name, radius, mass, semiMajorAxis, eccentricity, orbitalPeriod, centralCelestialBody);
    }


    @Override
    public String toString() {
        return "The planet " + name + " has a radius of " + radius +
                " Rjup, and a mass of " + mass + " Mjup.";
    }

}
