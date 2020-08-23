package com.mustafasuleymankinik.androiddagger2;

import dagger.Component;

@Component(modules = SchoolModule.class)
public interface SchoolComponent {
    void inject(MainActivity mainActivity);
}
