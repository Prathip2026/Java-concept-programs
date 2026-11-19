package org.text;

public class Childabstract extends Parentabstract {

    @Override
    public void apple() {
        System.out.println("it is the red colour");
    }

    public static void main(String[] args) {
        Childabstract ch = new Childabstract();
        ch.orange();
        ch.apple();
    }
}
