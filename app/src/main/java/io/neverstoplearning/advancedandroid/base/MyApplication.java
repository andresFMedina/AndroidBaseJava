package io.neverstoplearning.advancedandroid.base;

import android.app.Application;

import javax.inject.Inject;

import io.neverstoplearning.advancedandroid.di.ActivityInjector;

public class MyApplication extends Application {

    @Inject ActivityInjector activityInjector;

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        component.inject(this);
    }

    public ActivityInjector getActivityInjector() {
        return activityInjector;
    }
}
