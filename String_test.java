package org.text;

public class String_test {

    public static void main (String[] args){

        String s1 = "Welcome to the Java World";
        String s2 = "Welcome to the Java World";
        String s3 = "welcome to the java World";

        int a = s1.length();          // length method it is used to count the character
        System.out.println(a);

        boolean b = s1.equals(s2);     // equals to compare the value s1 and s2
        System.out.println(b);

        boolean c = s1.equalsIgnoreCase(s3); // to ignore the both content it are same
                                            // but uppercase and lower case not a problem
        System.out.println(c);

        String d = s1.toLowerCase();       // it is given String  is give me the small letter
        System.out.println(d);

        String e = s1.toUpperCase();      // it is given String is give me the capital letter
        System.out.println(e);

        int f = s1.charAt(0);
        System.out.println(f);

        int g = s1.indexOf(e);
        System.out.println(g);



    }
}
