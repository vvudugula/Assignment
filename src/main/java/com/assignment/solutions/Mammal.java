package com.assignment.solutions;

import com.assignment.behaviors.Speakable;
import com.assignment.behaviors.Walkable;
import com.assignment.helper.Helper;
import com.assignment.utils.Constant;
import com.assignment.utils.Sound;

public abstract class Mammal extends Animal implements Walkable, Speakable {
    private Helper helper;

    public Mammal() {
        this.helper = new Helper(Sound.DEFAULT);
    }

    public Mammal(Helper helper) {
        this.helper = helper;
    }

    public void callSound() {
        helper.makeSound();
    }

    public void canWalk() {
        System.out.println(Constant.WALKING);
    }
}
