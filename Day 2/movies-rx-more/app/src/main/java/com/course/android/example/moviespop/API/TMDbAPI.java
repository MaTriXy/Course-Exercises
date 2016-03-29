package com.course.android.example.moviespop.API;

import com.course.android.example.moviespop.Model.MoviesPageEntity;
import com.course.android.example.moviespop.Model.ReviewsPageEntity;
import com.course.android.example.moviespop.Model.TrailersEntity;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface TMDbAPI {
    @GET("/discover/movie") Observable<MoviesPageEntity> movies(@Query("sort_by") ModeOrder order,
                                                                @Query("page") int page);

    @GET("/movie/{id}/reviews") Observable<ReviewsPageEntity> reviews(@Path("id") long id,
                                                                      @Query("page") int page);

    @GET("/movie/{id}/videos") Observable<TrailersEntity> trailers(@Path("id") long id);
}
