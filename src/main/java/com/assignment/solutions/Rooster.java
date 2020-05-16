package com.assignment.solutions;

import com.assignment.helper.Helper;
import com.assignment.helper.LanguageHelper;
import com.assignment.utils.LanguageEnums;
import com.assignment.utils.Sound;

public class Rooster extends Chicken {
    LanguageHelper languageHelper;
    Helper helper;
    LanguageEnums languageEnums;

    public Rooster() {
        this.helper = new Helper(Sound.ROOSTER);
    }

    public Rooster(LanguageEnums languageEnums) {
        this.helper = new Helper(Sound.ROOSTER);
        this.languageEnums = languageEnums;
    }

    @Override
    public void canFly() {
        super.canFly();
    }

    @Override
    public void callSound() {
        String translate = LanguageHelper.translate(Sound.ROOSTER.getSound(), languageEnums);
        System.out.println(translate);

    }
}
