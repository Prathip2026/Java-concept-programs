package org.text;

public class Constructor {

    public Constructor(int age, String name){
        System.out.println(age);
        System.out.println(name);
    }

    public Constructor(int age , String name,float mark){
        System.out.println(age);
        System.out.println(name);
        System.out.println(mark);

    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor(21,"Prathip");
        Constructor c2 = new Constructor(22,"Tharakesh",3);

    }
}


