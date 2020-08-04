package io.neverstoplearning.advancedandroid.home;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import io.neverstoplearning.advancedandroid.di.ActivityScope;

@ActivityScope
@Subcomponent(modules = {
        MainScreenBindingModule.class,
})
public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {

        @Override
        public void seedInstance(MainActivity instance) {

        }
    }
}
