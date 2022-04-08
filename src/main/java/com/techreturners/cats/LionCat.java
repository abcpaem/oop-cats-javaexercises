package com.techreturners.cats;

public class LionCat extends Cat {
    public LionCat() {
        super(Setting.WILD, 1100);
    }

    @Override
    public String eat() {
        return "Roar!!!!";
    }
}
