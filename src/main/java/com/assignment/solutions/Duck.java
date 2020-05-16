package com.assignment.solutions;

import com.assignment.behaviors.Flyable;
import com.assignment.behaviors.Swimmable;
import com.assignment.helper.Helper;
import com.assignment.utils.Constant;
import com.assignment.utils.Sound;

public class Duck extends Bird implements Swimmable, Flyable {

    public Duck() {
        super(new Helper(Sound.DUCK));
    }

    @Override
    public void canWalk() {
        super.canWalk();
    }

    public void canFly() {
        System.out.println(Constant.FLYING);
    }

    public void canSwim() {
        System.out.println(Constant.SWIMMING);
    }
}
