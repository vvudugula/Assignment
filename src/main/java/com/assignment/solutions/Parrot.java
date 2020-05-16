package com.assignment.solutions;

import com.assignment.behaviors.Flyable;
import com.assignment.helper.Helper;
import com.assignment.utils.Constant;
import com.assignment.utils.Sound;

public class Parrot extends Bird implements Flyable {
    public Parrot() {
        super(new Helper(Sound.DEFAULT));
    }

    public Parrot(Helper helper) {
        super(helper);
    }

    public void canFly() {
        System.out.println(Constant.FLYING);
    }
}
