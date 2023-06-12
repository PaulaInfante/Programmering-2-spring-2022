package no.hiof.paulai.oblig2;
import no.hiof.paulai.oblig2.PlanetSystem;

public class Main {
    public static void main(String[] args) {

        Star sun = new Star("Sun",1.0, 1.0, 5777);
        Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4);
        Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859);
        Planet earth = new Planet("Earth", 0.08911486599899289, 0.003146469968387777);
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4);
        Planet jupiter = new Planet("Jupiter", 1.0, 1.0);
        Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275);
        Planet uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773);
        Planet neptune = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066);

        PlanetSystem solarSystem = new PlanetSystem("Solar system", sun, new Planet[]{mercury,venus,earth,mars,jupiter,saturn,uranus,neptune});

        //oppgave 2.3
        System.out.println(solarSystem.toString());

        //oppgave 2.4
        System.out.println(saturn.getName() +" has a radius of "+ saturn.radiusInKm()+"km and a mass of " + saturn.massInKg()+"kg.");
        System.out.println(sun.getName() +" has a radius of "+ sun.radiusInKm()+"km and a mass of " + sun.massInKg()+"kg.");

        //Oppgave 2.5
        System.out.println(neptune.getName()+" has a gravity of "+neptune.surfaceGravity()+"m/s^2");

        //oppgave 2.6
        System.out.println("Smallest planet: "+ solarSystem.smallPlanet());
        System.out.println("Largest planet: " + solarSystem.bigPlanet());
    }
}
