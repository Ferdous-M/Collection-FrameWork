package Comparator;

import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mahzabin", 85));
        students.add(new Student("Rahim", 70));
        students.add(new Student("Anika", 95));

        Comparator<Student> marksComparator =
                (s1, s2) -> s1.marks - s2.marks;

        Collections.sort(students, marksComparator);
        System.out.println(students);

        Comparator<Student> desc =
                (a, b) -> b.marks - a.marks;
        Collections.sort(students, desc);
        System.out.println(students);

        Comparator<Student> byName =
                (a, b) -> a.name.compareTo(b.name);
        Collections.sort(students, byName);
        System.out.println(students);
    }
}
