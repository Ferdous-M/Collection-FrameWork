package Arraylist;

import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();


        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Names in the ArrayList: " + names);


        String firstName = names.get(0);
        System.out.println("First name: " + firstName);

     
        names.remove(1);
        System.out.println("Names after removal: " + names);
    }
    }
