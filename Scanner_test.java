package org.text;

import java.util.Scanner;

public class Scanner_test {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name:");
        String name = sc.nextLine();

        System.out.println("Enter the rollnumber:");
        int roll = sc.nextInt();

        System.out.println("Enter the phone number:");
        long nm = sc.nextLong();

        System.out.println("Enter the cgpa:");
        float per = sc.nextFloat();

        System.out.println("Enter the grade:");
        char grade = sc. next().charAt(0);




    }
}
