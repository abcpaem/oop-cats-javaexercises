package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends Cat {
    private Random random;

    public DomesticCat() {
        this(new Random());
    }

    public DomesticCat(Random random) {
        super(Setting.DOMESTIC, 23);
        this.random = random;
    }

    @Override
    public String eat() {
        return "Purrrrrrr" + (random.nextBoolean() ? " It will do I suppose" : "");
    }
}
