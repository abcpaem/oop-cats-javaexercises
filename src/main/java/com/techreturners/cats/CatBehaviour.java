package com.techreturners.cats;

import java.util.Random;

interface CatBehaviour {

    boolean isAsleep();

    void goToSleep();

    void wakeUp();

    String getSetting();

    int getAverageHeight();

    String eat();

    String eat(Random random);
}
