package com.techreturners.cats.testhelper;

import java.util.Random;

public class RandomStub extends Random {
    private Boolean value;

    public RandomStub(Boolean value) {
        this.value = value;
    }

    @Override
    public boolean nextBoolean() {
        return this.value;
    }
}
