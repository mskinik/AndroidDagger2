package com.mustafasuleymankinik.androiddagger2;

import javax.inject.Inject;

public class James implements Student {

    @Inject
    public James()
    {

    }

    @Override
    public void inClass() {
        System.out.println("James is in Class");
    }

    @Override
    public void inGarden() {
        System.out.println("James is in Garden");
    }
}
