package com.techreturners.cats;

public class AbstractCat implements Cat {
    private boolean isAsleep;
    private String setting;

    public AbstractCat(String setting) {
        this.isAsleep = false;
        this.setting = setting;
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

    @Override
    public String getSetting() {
        return setting;
    }
}
