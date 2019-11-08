package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Human h1= createHuman();
        Human h2= createHuman();

        Human result = h1.haveRelationship(h2);
        System.out.println(result);
    }

    private static Human createHuman() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type the gender:");
        boolean gender = scan.nextBoolean();
        System.out.print("Type the name:");
        String name = scan.next();
        System.out.print("Type the surname:");
        String surname = scan.next();
        System.out.print("Type the height:");
        float height = scan.nextFloat();
        System.out.print("Type the weight:");
        float weight = scan.nextFloat();
        Human h;
        if (gender) {
            h = new Male(gender, name, surname, height, weight);
        } else {
            h = new Female(gender, name, surname, height, weight);
        }
        return h;
    }
}
