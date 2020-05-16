package com.assignment.solutions;

import com.assignment.behaviors.Flyable;
import com.assignment.behaviors.Speakable;
import com.assignment.behaviors.Walkable;
import com.assignment.helper.Helper;
import com.assignment.utils.Constant;

public class Insect extends Animal implements Flyable, Walkable, Speakable {
    private Helper singHelper;

    public Insect(Helper singHelper) {
        this.singHelper = singHelper;
    }

    public void canFly() {
        System.out.println(Constant.FLYING);
    }

    public void callSound() {
        singHelper.makeSound();
    }

    public void canWalk() {
        System.out.println(Constant.WALKING);
    }
}
