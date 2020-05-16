package com.assignment.solutions;

import com.assignment.behaviors.NotFlyable;
import com.assignment.helper.Helper;
import com.assignment.utils.Constant;
import com.assignment.utils.Sound;

public class Chicken extends Bird implements NotFlyable {
    public Chicken() {
        super(new Helper(Sound.CHICKEN));
    }

    public Chicken(Helper singHelper) {
        super(singHelper);
    }

    @Override
    public void canWalk() {
        super.canWalk();
    }

    @Override
    public void canFly() {
        System.out.println(Constant.CANT_FLY);
    }
}
