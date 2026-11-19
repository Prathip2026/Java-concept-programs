package org.text;
import java.util.*;
import java.util.HashMap;

public class Collection_map {

    public static void main(String[] args) {

        Map<Integer, String> a = new HashMap<>();

        a.put(1,"Prathip");
        a.put(2,"Praveen");
        a.put(3,"vicky");

        System.out.println(a);

        // gethashmap

        String s = a.get(2);           // shortcut are present ctrl + alt + v
        System.out.println(s);

        boolean b = a.containsKey(2);
        System.out.println(b);

        Set<Map.Entry<Integer, String>> entries = a.entrySet();
        System.out.println(entries);

        Map<Integer, Double> ma = new LinkedHashMap<>();
        ma.put(1,23.4);
        ma.put(2,3.2);
        ma.put(null , 4.5);
        ma.put(5 , 7.2);
        System.out.println(ma);

        Map<Integer, Character> ch = new TreeMap<>();
        ch.put(1,'M');
        ch.put(3,'f');
        ch.put(2,'t');
        ch.put(4,null);
        ch.put(6, null);
        ch.put(5,null);
        System.out.println(ch);

    }
}
