package com.course.android.example.moviespop;

import android.app.Application;
import android.content.Context;

import com.course.android.example.moviespop.API.DataSourceModule;
import com.course.android.example.moviespop.Database.ProviderModule;
import com.course.android.example.moviespop.Repository.RepositoryModule;
import com.course.android.example.moviespop.UI.UiModule;
import timber.log.Timber;

public class PopularMoviesApplication extends Application {
    protected AppComponent component;

    public static AppComponent appComponent(Context context) {
        return get(context).getComponent();
    }

    public AppComponent getComponent() {
        return component;
    }

    public static PopularMoviesApplication get(Context context) {
        return (PopularMoviesApplication) context.getApplicationContext();
    }

    @Override public void onCreate() {
        super.onCreate();
        setupComponent();
        Timber.plant(new Timber.DebugTree());
    }

    protected void setupComponent() {
        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .dataSourceModule(new DataSourceModule())
                .providerModule(new ProviderModule())
                .repositoryModule(new RepositoryModule())
                .uiModule(new UiModule())
                .build();
    }
}
