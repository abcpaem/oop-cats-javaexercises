package com.techreturners.cats;

public class LionCat extends AbstractCat {
    public LionCat() {
        super(Cat.WILD, 1100);
    }

    @Override
    public String eat() {
        return "Roar!!!!";
    }
}
