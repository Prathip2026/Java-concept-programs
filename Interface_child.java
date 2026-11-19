package org.text;

public class Interface_child implements Interface_parent,Interface_parent2{

    @Override
    public void phoneshop() {
        System.out.println("It is the biggest shop in the city");
    }

    @Override
    public void ios() {
        System.out.println("it is the iphone");

    }

    @Override
    public void android() {
        System.out.println("it is the my favorite phone is sumsung");

    }

    public static void main(String[] args) {
        Interface_child a = new Interface_child();
        a.phoneshop();
        a.ios();
        a.android();

    }
}
