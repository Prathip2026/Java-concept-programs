package org.text;

public class Polymorphism {

    public void Greentech(int roll_no){
        System.out.println("Green technology");

    }

    private void Greentech(int roll_no, String name){
        System.out.println(roll_no+ " " +name);


    }

    protected void Greentech(String name, int roll_no){
        System.out.println(name);
        System.out.println(roll_no);

    }

    public static void main(String[] args) {
        Polymorphism po = new Polymorphism();
        po.Greentech(01);
        po.Greentech(01,"praveen");
        po.Greentech("prathip",02);

    }
}

