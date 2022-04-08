package com.techreturners.cats;

interface CatBehaviour {
    String DOMESTIC = "domestic";
    String WILD = "wild";

    boolean isAsleep();

    void goToSleep();

    void wakeUp();

    String getSetting();

    int getAverageHeight();

    String eat();
}
