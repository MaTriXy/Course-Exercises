package com.course.android.example.moviespop.UI;

import com.course.android.example.moviespop.UI.Fragments.DetailMovieFragment;
import com.course.android.example.moviespop.UI.Fragments.MoviesListFragment;

public interface UiComponent {
    void inject(MoviesListFragment fragment);
    void inject(DetailMovieFragment fragment);
}
