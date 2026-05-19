package Hashset;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<Integer>();

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(3); // Duplicate, will not be added
        hashSet.add(2);

        for(Integer element : hashSet) {
            System.out.println(element);
        }

        hashSet.remove(3);
        System.out.println(hashSet);
        System.out.println(hashSet.contains(3));
        System.out.println(hashSet.size());
        System.out.println(hashSet.isEmpty());
        hashSet.clear();
        System.out.println(hashSet.isEmpty());
    }
}
