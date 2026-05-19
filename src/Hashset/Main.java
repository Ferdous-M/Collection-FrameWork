package Hashset;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("a"); // Duplicate, will not be added
        hashSet.add("b");

        System.out.println(hashSet);
    }
}
