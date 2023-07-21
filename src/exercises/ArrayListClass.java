package exercises;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Pluto");
        planets.add("Jupiter");

        System.out.println(planets);
        System.out.println(planets.size());
        System.out.println(planets.contains("Pluto"));
        System.out.println(planets.indexOf("Mercury"));
        System.out.println(planets.indexOf("Vermilion"));

    }
}
