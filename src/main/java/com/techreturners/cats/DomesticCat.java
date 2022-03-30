package com.techreturners.cats;

public class DomesticCat extends AbstractCat {
    public DomesticCat() {
        super(Cat.DOMESTIC, 23);
    }

    @Override
    public String eat() {
        return "Purrrrrrr";
    }
}
