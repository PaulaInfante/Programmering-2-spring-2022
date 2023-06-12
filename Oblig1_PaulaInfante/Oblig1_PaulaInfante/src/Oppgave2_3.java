public class Oppgave2_3 {
    public static void main(String[] args) {
    Planet planet = new Planet("Mars", 3889, 6.39E23);

        System.out.println("Planeten "+ planet.getName() +" har en radius på "+ planet.getRadius() + " km" + " og en masse på " + planet.getMass() + " kg");
    }
}
