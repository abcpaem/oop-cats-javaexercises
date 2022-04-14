package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends Cat {
    public DomesticCat() {
        super(Setting.DOMESTIC, 23);
    }

    @Override
    public String eat() {
        return eat(new Random());
    }

    @Override
    public String eat(Random random) {
        return "Purrrrrrr" + (random.nextBoolean() ? " It will do I suppose" : "");
    }
}
