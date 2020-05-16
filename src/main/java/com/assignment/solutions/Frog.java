package com.assignment.solutions;

import com.assignment.behaviors.Speakable;
import com.assignment.behaviors.Swimmable;
import com.assignment.behaviors.Walkable;
import com.assignment.helper.Helper;
import com.assignment.utils.Constant;
import com.assignment.utils.Sound;

public class Frog extends Animal implements Swimmable, Walkable, Speakable {
    Helper helper;

    public Frog() {
    	helper = new Helper(Sound.DEFAULT);
    }

    public Frog(Helper helper) {
    	this.helper = helper;
    }

    public void callSound() {
    	helper.makeSound();
    }

    public void canSwim() {
        System.out.println(Constant.SWIMMING);
    }

    public void canWalk() {
        System.out.println(Constant.WALKING);
    }
}
