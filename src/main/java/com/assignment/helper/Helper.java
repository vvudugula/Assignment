package com.assignment.helper;

import com.assignment.utils.Sound;

public class Helper {
    private Sound sound;

    public Helper(Sound sound) {
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(sound.getSound());
    }
}
