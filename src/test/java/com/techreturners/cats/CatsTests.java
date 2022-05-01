package com.techreturners.cats;

import com.techreturners.cats.testhelper.RandomStub;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class CatsTests {
    CatBehaviour domesticCat = new DomesticCat();
    CatBehaviour lionCat = new LionCat();
    CatBehaviour cheetahCat = new CheetahCat();

    @Test
    public void checkCatIsAwake() {
        assertFalse(domesticCat.isAsleep(), "Cat should be awake by default");
    }

    @Test
    public void checkCatCanGoToSleep() {
        domesticCat.goToSleep();
        assertTrue(domesticCat.isAsleep(), "Cat should be snoozing");
    }

    @Test
    public void checkCatCanWakep() {
        domesticCat.goToSleep();
        domesticCat.wakeUp();
        assertFalse(domesticCat.isAsleep(), "Cat should be awake now");
    }

    @Test
    public void checkCatSetting() {
        assertEquals("domestic", domesticCat.getSetting());
    }

    @Test
    public void checkCatHeight() {
        assertEquals(23, domesticCat.getAverageHeight());
    }

    @Test
    public void checkLionHeight() {
        assertEquals(1100, lionCat.getAverageHeight());
    }


    @Test
    public void feedTheLion() {
        assertEquals("Roar!!!!", lionCat.eat());
    }

    @Test
    public void feedTheCheetah() {
        assertEquals("Zzzzzzz", cheetahCat.eat());
    }

    @Test
    public void feedTheCat() {
        assertTrue(domesticCat.eat().contains("Purrrrrrr"));
    }

    @Test
    public void feedTheCatRandomComment() {
        Random randomStub = new RandomStub(true);
        CatBehaviour domesticCat = new DomesticCat(randomStub);

        assertTrue(domesticCat.eat().equals("Purrrrrrr It will do I suppose"));
    }
}
