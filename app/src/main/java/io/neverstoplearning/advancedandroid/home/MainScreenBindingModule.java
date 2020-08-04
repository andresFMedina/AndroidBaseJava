package io.neverstoplearning.advancedandroid.home;

import com.bluelinelabs.conductor.Controller;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import io.neverstoplearning.advancedandroid.di.ControllerKey;
import io.neverstoplearning.advancedandroid.trending.TrendingReposComponent;
import io.neverstoplearning.advancedandroid.trending.TrendingReposController;

@Module(subcomponents = {
        TrendingReposComponent.class,
})
public abstract class MainScreenBindingModule {

    @Binds
    @IntoMap
    @ControllerKey(TrendingReposController.class)
    abstract AndroidInjector.Factory<? extends Controller> bindTrendingReposInjector(TrendingReposComponent.Builder builder);
}
