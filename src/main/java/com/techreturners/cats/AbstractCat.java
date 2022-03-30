package com.techreturners.cats;

public class AbstractCat implements Cat {
    private boolean isAsleep;

    public void Cat() {
        this.isAsleep = false;
    }

    @Override
    public boolean isAsleep() {
        return isAsleep;
    }

    @Override
    public void goToSleep() {
        isAsleep = true;
    }

    @Override
    public void wakeUp() {
        isAsleep = false;
    }
}
