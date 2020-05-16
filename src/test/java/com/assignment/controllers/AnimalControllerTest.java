package com.assignment.controllers;

import org.junit.jupiter.api.Test;

import com.assignment.controllers.AnimalController;
import com.assignment.solutions.*;

import static org.junit.jupiter.api.Assertions.*;

class AnimalControllerTest {
    @Test
    void getFlyingAnimalCount() {
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Frog(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };
        int flyingAnimalCount = new AnimalController().getFlyingAnimalCount(animals);
        assertEquals(flyingAnimalCount, 6);
    }

}