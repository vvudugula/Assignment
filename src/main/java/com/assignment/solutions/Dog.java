package com.assignment.solutions;

import com.assignment.helper.Helper;
import com.assignment.utils.Sound;

public class Dog extends Mammal {
    public Dog() {
        super((new Helper(Sound.DOG)));
    }

    public Dog(Helper singHelper) {
        super(singHelper);
    }
}
