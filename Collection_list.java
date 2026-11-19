package org.text;

import java.util.*;

public class Collection_list {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<Integer>();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.add(60);

        System.out.println(a);
        int s = a.size();
        System.out.println(s); //it is the find the size of the list.


        boolean b = a.contains(40);
        System.out.println(b);

        int g = a.get(3);
        System.out.println(g);

        int i = a.indexOf(40);
        System.out.println(i);

        int r = a.remove(2);
        System.out.println(r);

        System.out.println(a);

       boolean re = a.removeAll(a);
        System.out.println(re);

        System.out.println(a);

       boolean b1 = a.retainAll(a);

        System.out.println(b1);
        System.out.println(a);


        }

    }
