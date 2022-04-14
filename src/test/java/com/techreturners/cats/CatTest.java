package com.techreturners.cats;

import com.techreturners.cats.testhelper.RandomStub;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void checkCatIsAwake() {
        CatBehaviour domesticCat = new DomesticCat();
        assertFalse("Cat should be awake by default", domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanGoToSleep() {
        CatBehaviour domesticCat = new DomesticCat();
        domesticCat.goToSleep();
        assertTrue("Cat should be snoozing", domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanWakep() {
        CatBehaviour domesticCat = new DomesticCat();
        domesticCat.goToSleep();
        domesticCat.wakeUp();
        assertFalse("Cat should be awake now", domesticCat.isAsleep());
    }

    @Test
    public void checkCatSetting() {
        CatBehaviour domesticCat = new DomesticCat();
        assertEquals("domestic", domesticCat.getSetting());
    }

    @Test
    public void checkCatHeight() {
        CatBehaviour domesticCat = new DomesticCat();
        assertEquals(23, domesticCat.getAverageHeight());
    }

    @Test
    public void checkLionHeight() {
        CatBehaviour lionCat = new LionCat();
        assertEquals(1100, lionCat.getAverageHeight());
    }


    @Test
    public void feedTheLion() {
        CatBehaviour lionCat = new LionCat();
        assertEquals("Roar!!!!", lionCat.eat());
    }

    @Test
    public void feedTheCheetah() {
        CatBehaviour cheetahCat = new CheetahCat();
        assertEquals("Zzzzzzz", cheetahCat.eat());
    }

    @Test
    public void feedTheCat() {
        CatBehaviour domesticCat = new DomesticCat();
        assertTrue(domesticCat.eat().contains("Purrrrrrr"));
    }

    @Test
    public void feedTheCatRandomComment() {
        Random randomStub = new RandomStub(true);
        CatBehaviour domesticCat = new DomesticCat();

        assertTrue(domesticCat.eat(randomStub).equals("Purrrrrrr It will do I suppose"));
    }
}
