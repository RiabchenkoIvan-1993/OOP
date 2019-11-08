package com.company;

import java.util.Scanner;

public class Female extends Human {
    public Female(boolean gender, String name, String surname, float height, float weight) {
        super(gender, name, surname, height, weight);
    }

    @Override
    public boolean speak(Human human) {
        return true;
    }

    @Override
    public boolean endure(Human human) {
        if (human.gender) {
            return Math.random() < 0.7;
        }
        return Math.random() < 0.05;
    }

    @Override
    public Human haveRelationship(Human human) {
        if (this.gender == human.gender) {
            return null;
        }
        if (this.speak(human) && this.endure(human) && this.spendTimeTogether(human)) {
            return birth(human, this);
        } else {
            return null;
        }
    }

    public static Human birth(Human male, Human female) {
        boolean nextGender = Math.random() < 0.5;

        System.out.print("Type the name:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        if (nextGender) {
            float height = male.height + (male.height - female.height) / 10;
            float weight = male.weight + (male.weight - female.weight) / 10;
            Human child = new Male(true, name, male.surname, height, weight);
            return child;
        } else {
            float height = female.height + (female.height - male.height) / 10;
            float weight = female.weight + (female.weight - male.weight) / 10;
            Human child = new Male(true, name, male.surname, height, weight);
            return child;
        }
    }

}
