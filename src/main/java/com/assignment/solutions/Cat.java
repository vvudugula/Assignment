package com.assignment.solutions;

import com.assignment.helper.Helper;
import com.assignment.utils.Sound;

public class Cat extends Mammal {
    public Cat() {
        super(new Helper(Sound.CAT));
    }

    public Cat(Helper singHelper) {
        super(singHelper);
    }
}
