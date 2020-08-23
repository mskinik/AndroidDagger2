package com.mustafasuleymankinik.androiddagger2;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class SchoolModule {
private Context context;

    public SchoolModule(Application application) {
        this.context = application;
    }

    @Provides
    Context getContext()
    {
        return context;
    }

    @Provides
    Student getJames()
    {
        return new James();
    }

    @Provides
    Student getLemmy()
    {
        return new Lemmy();
    }

    @Provides
     School getSchool(James james,Lemmy lemmy)
    {
        return new School(james,lemmy);
    }
}
