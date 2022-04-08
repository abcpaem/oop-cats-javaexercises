package com.techreturners.cats;

public class CheetahCat extends Cat {
    public CheetahCat() {
        super(Setting.WILD, 1000);
    }

    @Override
    public String eat() {
        return "Zzzzzzz";
    }
}
