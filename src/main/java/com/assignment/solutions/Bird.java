package com.assignment.solutions;

import com.assignment.behaviors.Flyable;
import com.assignment.behaviors.Speakable;
import com.assignment.behaviors.Walkable;
import com.assignment.helper.Helper;
import com.assignment.utils.Constant;
import com.assignment.utils.Sound;

public class Bird extends Animal implements Walkable, Speakable, Flyable {

    private Helper helper;

    public Bird() {
        this.helper = new Helper(Sound.DEFAULT);
    }

    public Bird(Helper helper) {
        this.helper = helper;
    }

    public void callSound() {
        helper.makeSound();
    }

    public void canWalk() {
        System.out.println(Constant.WALKING);
    }


    public void canFly() {
        System.out.println(Constant.FLYING);
    }
}
