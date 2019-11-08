package com.company;

public class Male extends Human {
    public Male(boolean gender, String name, String surname, float height, float weight) {
        super(gender, name, surname, height, weight);
    }

    @Override
    public boolean speak(Human human) {
        if (human.gender) {
            return Math.random() > 0.5;
        }
        return false;
    }

    @Override
    public boolean endure(Human human) {
        if (human.gender) {
            return Math.random() < 0.056;
        }
        return Math.random() < 0.7;
    }
    @Override
    public Human haveRelationship(Human human) {
        if (this.gender == human.gender) {
            return null;
        }
        if (this.speak(human) && this.endure(human) && this.spendTimeTogether(human)) {
            return Female.birth(this,human);
        } else {
            return null;
        }
    }
}
