package com.assignment.solutions;

import com.assignment.behaviors.BodyType;
import com.assignment.behaviors.Swimmable;
import com.assignment.utils.Constant;

public class Fish extends Animal implements Swimmable, BodyType {
    public void canSwim() {
        System.out.println(Constant.SWIMMING);
    }

    public String bodySize() {
        return null;
    }

    public String bodyColor() {
        return null;
    }
}
