package org.text;

public class child extends Polymorphism{

    @Override
    protected void Greentech(String name, int roll_no) {
        super.Greentech(name, roll_no);
    }

    public static void main(String[] args) {
        child ch = new child();
        ch.Greentech("dhmo",01);
        ch.Greentech(02);

    }
}
