package vector;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Vector<String> fruits = new Vector<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println(fruits);

        System.out.println(fruits.get(1));

        fruits.remove("Banana");

        System.out.println(fruits);
    }
}