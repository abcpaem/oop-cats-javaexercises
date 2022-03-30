package com.techreturners.cats;

interface Cat {
    String DOMESTIC = "domestic";
    String WILD = "wild";

    boolean isAsleep();

    void goToSleep();

    void wakeUp();

    String getSetting();

    int getAverageHeight();

    String eat();
}
