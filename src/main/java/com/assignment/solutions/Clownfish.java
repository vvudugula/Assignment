package com.assignment.solutions;

import com.assignment.utils.Constant;

public class Clownfish extends Fish {


    @Override
    public String bodySize() {
        return "small";
    }

    @Override
    public String bodyColor() {
        return "orange";
    }

    public void makeJoke() {
        System.out.println(Constant.JOKES);
    }
}
