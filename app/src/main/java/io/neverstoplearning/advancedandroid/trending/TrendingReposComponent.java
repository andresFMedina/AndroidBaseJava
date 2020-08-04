package io.neverstoplearning.advancedandroid.trending;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import io.neverstoplearning.advancedandroid.di.ScreenScope;

@ScreenScope
@Subcomponent
public interface TrendingReposComponent extends AndroidInjector<TrendingReposController> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TrendingReposController> {

    }
}
