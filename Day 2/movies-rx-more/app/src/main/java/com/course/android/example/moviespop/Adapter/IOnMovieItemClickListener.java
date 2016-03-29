package com.course.android.example.moviespop.Adapter;

import android.view.View;

import com.course.android.example.moviespop.Model.MovieEntity;

public interface IOnMovieItemClickListener {
    void onClicked(MovieEntity entity, View view, int position);

    IOnMovieItemClickListener EMPTY = new IOnMovieItemClickListener() {
        @Override
        public void onClicked(MovieEntity entity, View view, int index) {}
    };
}