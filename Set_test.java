package org.text;
import java.util.*;

public class Set_test {

    public static void main(String[] args) {

        Set <Integer> a = new HashSet<>();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.add(60);

        System.out.println(a);

        Set<Integer> b = new HashSet<>();
        b.add(100);
        b.add(null);
        b.add(200);
        b.add(300);
        b.add(500);

        System.out.println(b);

        System.out.println("After  add all");

        a.addAll(b);
        System.out.println(b);

    }
}
