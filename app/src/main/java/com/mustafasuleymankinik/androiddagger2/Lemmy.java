package com.mustafasuleymankinik.androiddagger2;

import javax.inject.Inject;

public class Lemmy implements Student {

    @Inject
    public Lemmy()
    {

    }

    @Override
    public void inClass() {
        System.out.println("Lemmy is in Class");
    }

    @Override
    public void inGarden() {
        System.out.println("Lemmy is in Garden");
    }
}
