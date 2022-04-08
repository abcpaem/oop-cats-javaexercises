package com.techreturners.cats;

public abstract class Cat implements CatBehaviour {
    private boolean isAsleep;
    private String setting;
    private int averageHeight;

    public Cat(String setting, int averageHeight) {
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
        return setting;
    }

    @Override
    public int getAverageHeight() {
        return averageHeight;
    }

    @Override
    public abstract String eat();
}
