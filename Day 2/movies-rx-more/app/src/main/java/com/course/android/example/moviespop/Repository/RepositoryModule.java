package com.course.android.example.moviespop.Repository;

import android.content.ContentResolver;
import com.course.android.example.moviespop.API.TMDbAPI;
import com.squareup.sqlbrite.BriteContentResolver;

import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule {
    @Provides
    public IMoviesRepository providesMoviesRepository(TMDbAPI api, ContentResolver contentResolver,
                                                      BriteContentResolver briteContentResolver) {
        return new MoviesRepository(api, contentResolver, briteContentResolver);
    }
}
