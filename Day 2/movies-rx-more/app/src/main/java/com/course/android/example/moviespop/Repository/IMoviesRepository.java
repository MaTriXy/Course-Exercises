package com.course.android.example.moviespop.Repository;

import com.course.android.example.moviespop.API.ModeOrder;
import com.course.android.example.moviespop.Model.MovieEntity;
import com.course.android.example.moviespop.Model.ReviewEntity;
import com.course.android.example.moviespop.Model.TrailerEntity;

import java.util.List;
import java.util.Set;

import rx.Observable;

public interface IMoviesRepository {
    Observable<List<MovieEntity>> movies();
    Observable<List<MovieEntity>> movies(ModeOrder order, int page);
    Observable<Set<Long>> moviesId();

    void add(MovieEntity entity);
    void remove(MovieEntity entity);

    Observable<List<TrailerEntity>> trailers(long id);
    Observable<List<ReviewEntity>> reviews(long id);
}
