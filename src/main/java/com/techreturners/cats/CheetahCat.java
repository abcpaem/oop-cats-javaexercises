package com.techreturners.cats;

public class CheetahCat extends AbstractCat {
    public CheetahCat() {
        super(Cat.WILD, 1000);
    }

    @Override
    public String eat() {
        return "Zzzzzzz";
    }
}
