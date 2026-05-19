package Set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);

        System.out.println(set);
    }
}
