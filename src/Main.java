public class Main {
    public static void main(String[] args) {
        Planet planet = new Planet("Mars", 1000.0, 1.4, PlanetType.ROCK_PLANET);
        System.out.println(planet.toString());
    }
}