package no.hiof.paulai;

import no.hiof.paulai.models.Planet;
import no.hiof.paulai.models.PlanetSystem;
import no.hiof.paulai.models.Star;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Oppretter Star-objektet som representerer solsystemets sol
        Star sun = new Star("Sun", 1.0, 1.0, 5777);

        // Oppretter en rekke med planet-objekter
        Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4,0.387, 0.206, 88, sun);
        Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859, 0.723, 0.007, 225, sun);
        Planet earth = new Planet("Earth", 0.08911486599899289, 0.003146469968387777, 1, 0.017, 365, sun);
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4, 1.524, 0.093, 687, sun);
        Planet jupiter = new Planet("Jupiter", 1.0, 1.0, 5.20440,0.049, 4380, sun);
        Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275,9.5826, 0.057, 10585, sun);
        Planet uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773, 19.2184, 0.046, 30660, sun);
        Planet neptune = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066, 30.11, 0.010, 60225, sun);

        // Legger til planet-objektene i en arrayliste
        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(mercury);
        planets.add(venus);
        planets.add(earth);
        planets.add(mars);
        planets.add(jupiter);
        planets.add(saturn);
        planets.add(uranus);
        planets.add(neptune);

        // Oppretter planetsystemet "Solar system"
        PlanetSystem planetSystem = new PlanetSystem("Solar system", sun, planets);


        //Oppg. 2.2

        System.out.println(planetSystem.getPlanet("Mars"));

        //Oppg. 2.6
        System.out.println(earth.getName() + " has a distance of  " + earth.distanceToCentralBodyInRadians(0) + "km to the " +
                earth.getCentralCelestialBody().getName() + " at 0 degrees ");
        System.out.println(earth.getName() + " has a distance of  " + earth.distanceToCentralBodyInRadians(90) + "km to the " +
                earth.getCentralCelestialBody().getName() + " at 90 degrees ");
        System.out.println(earth.getName() + " has a distance of  " + earth.distanceToCentralBodyInRadians(180) + "km to the " +
                earth.getCentralCelestialBody().getName() + " at 180 degrees ");
        System.out.println(earth.getName() + " has a distance of  " + earth.distanceToCentralBodyInRadians(270) + "km to the " +
                earth.getCentralCelestialBody().getName() + " at 270 degrees ");
        System.out.println(earth.getName() + " has a distance of  " + earth.distanceToCentralBodyInRadians(360) + "km to the " +
                earth.getCentralCelestialBody().getName() + " at 360 degrees ");

        System.out.println("At a distance of " + earth.distanceToCentralBody(0) +"km, " + earth.getName() +
                " has a velocity of " + earth.orbitingVelocity(0) + "km/s");
        System.out.println("At a distance of " + earth.distanceToCentralBody(45) +"km, " + earth.getName() +
                " has a velocity of " + earth.orbitingVelocity(45) + "km/s");
        System.out.println("At a distance of " + earth.distanceToCentralBody(90) +"km, " + earth.getName() +
                " has a velocity of " + earth.orbitingVelocity(90) + "km/s");
        System.out.println("At a distance of " + earth.distanceToCentralBody(135) +"km, " + earth.getName() +
                " has a velocity of " + earth.orbitingVelocity(135) + "km/s");
        System.out.println("At a distance of " + earth.distanceToCentralBody(180) +"km, " + earth.getName() +
                " has a velocity of " + earth.orbitingVelocity(180) + "km/s");

    }
}
