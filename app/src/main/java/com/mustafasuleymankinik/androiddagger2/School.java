package com.mustafasuleymankinik.androiddagger2;

import javax.inject.Inject;

public class School {
    James james;
    Lemmy lemmy;

    @Inject
    public School(James james, Lemmy lemmy)
    {
        this.james=james;
        this.lemmy=lemmy;
    }
    public void timeOut()
    {
        james.inGarden();
        lemmy.inGarden();
    }
    public void lessonTime()
    {
        james.inClass();
        lemmy.inClass();

    }
}
