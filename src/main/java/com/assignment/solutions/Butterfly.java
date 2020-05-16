package com.assignment.solutions;

import com.assignment.behaviors.Flyable;
import com.assignment.behaviors.NotFlyable;
import com.assignment.behaviors.NotSpeakable;
import com.assignment.behaviors.Speakable;
import com.assignment.helper.Helper;
import com.assignment.utils.Constant;
import com.assignment.utils.Sound;

public class Butterfly extends Insect {
    private Insect state = new CaterpillarState(new Helper(Sound.CATERPILLAR));

    public Butterfly() {
        super(new Helper(Sound.CATERPILLAR));
    }

    public void transform() {
        state = new ButterflyState(new Helper(Sound.NO_SOUND));
    }

    @Override
    public void canFly() {
        state.canFly();
    }

    @Override
    public void callSound() {
        state.callSound();
    }

    @Override
    public void canWalk() {
        state.canWalk();
    }

    private class ButterflyState extends Insect implements Flyable, NotSpeakable {

        public ButterflyState(Helper singHelper) {
            super(singHelper);
        }

        @Override
        public void callSound() {
            super.callSound();
        }

        @Override
        public void canFly() {
            super.canFly();
        }
    }

    private class CaterpillarState extends Insect implements Speakable, NotFlyable {

        public CaterpillarState(Helper singHelper) {
			super(singHelper);
		}

        @Override
        public void callSound() {
            super.callSound();
        }

        @Override
        public void canFly() {
            System.out.println(Constant.CANT_FLY);
        }
    }
}
