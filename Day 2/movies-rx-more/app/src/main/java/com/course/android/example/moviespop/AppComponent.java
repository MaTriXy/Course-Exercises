package com.course.android.example.moviespop;

import com.course.android.example.moviespop.API.DataSourceComponent;
import com.course.android.example.moviespop.API.DataSourceModule;
import com.course.android.example.moviespop.Database.ProviderComponent;
import com.course.android.example.moviespop.Database.ProviderModule;
import com.course.android.example.moviespop.Repository.RepositoryComponent;
import com.course.android.example.moviespop.Repository.RepositoryModule;
import com.course.android.example.moviespop.UI.UiComponent;
import com.course.android.example.moviespop.UI.UiModule;

import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(
        modules = {
                AppModule.class,
                DataSourceModule.class,
                ProviderModule.class,
                RepositoryModule.class,
                UiModule.class
        }
)
public interface AppComponent extends DataSourceComponent, ProviderComponent, RepositoryComponent, UiComponent {
    void inject(PopularMoviesApplication application);
}
