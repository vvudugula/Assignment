package com.assignment.solutions;

import com.assignment.behaviors.Swimmable;
import com.assignment.utils.Constant;

public class Dolphin extends Animal implements Swimmable {
    public void canSwim() {
        System.out.println(Constant.SWIMMING);
    }
}
