package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();


        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Names in the ArrayList: " + names);

        names.add(1, "mahzabin");
        System.out.println("Names after adding new name: " + names);

        String firstName = names.get(0);
        System.out.println("First name: " + firstName);
        System.out.println("Names after adding new name at index 1: " + names.get(1));
        names.set(1, "Bob");
        System.out.println("Names after updating name at index 1: " + names.get(1));


        names.remove(1);
        names.remove("Alice");
        System.out.println("Names after removal: " + names);

        names.add("Bob");
        names.add("Charlie");

        for (String name : names) {
            System.out.println(name);
        }

        names.add("Bobo");
        names.add("DCharlie");
        Collections.sort(names);
        System.out.println("Names after sorting: " + names);
        names.clear();
        System.out.println("Names after removal: " + names);
    }
}
