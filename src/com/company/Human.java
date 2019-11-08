package com.company;

public abstract class Human {
    public Human(boolean gender, String name, String surname, float height, float weight) {
        this.gender = gender;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    protected boolean gender;
    protected String name;
    protected String surname;
    protected float height;
    protected float weight;

    @Override
    public String toString() {
        return "Human{" +
                "gender=" + gender +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public abstract boolean speak(Human human);

    public abstract boolean endure(Human human);

    public  abstract Human haveRelationship(Human human);

    public boolean spendTimeTogether(Human human){
        if (this.height/100*10<(this.height-human.height)) {
            return Math.random() < 0.85;
        }
        return Math.random() < 0.95;
    }

}
