package com.course.android.example.moviespop.Utilities;

import rx.subjects.PublishSubject;

public class ConstantValues {
    public static final String EXTRA_MOVIE = "movie_object";

    // REST API
    public static final String TMDB_API_KEY = "FILL_API_KEY_IN_HERE";
    public static final String ENDPOINT_URL = "http://api.themoviedb.org";

    // Thumbnail
    public static final String TMDB_IMAGE_URL = "http://image.tmdb.org/t/p/";

    public static final PublishSubject<MovieIdFavorite> FAVORITE_MOVIES_SUBJECT = PublishSubject.create();

    public static final String PREF_MOVIES_MODE = "pref_movies_list_mode";
    public static final String PREF_MOVIE_FAVORITES = "pref_movie_favorites";
}
