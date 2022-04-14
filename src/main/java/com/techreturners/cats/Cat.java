package com.techreturners.cats;

import java.util.Random;

public abstract class Cat implements CatBehaviour {
    public enum Setting {DOMESTIC, WILD}

    private boolean isAsleep;
    private Setting setting;
    private int averageHeight;

    public Cat(Setting setting, int averageHeight) {
        this.isAsleep = false;
        this.setting = setting;
        this.averageHeight = averageHeight;
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
        return setting.name().toLowerCase();
    }

    @Override
    public int getAverageHeight() {
        return averageHeight;
    }

    @Override
    public abstract String eat();

    @Override
    public String eat(Random random) { return this.eat(); };
}
