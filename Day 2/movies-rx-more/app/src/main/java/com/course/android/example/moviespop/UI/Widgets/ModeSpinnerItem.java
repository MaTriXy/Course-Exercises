package com.course.android.example.moviespop.UI.Widgets;

import com.course.android.example.moviespop.API.ModeOrder;

public class ModeSpinnerItem {
    String mTitle;
    ModeOrder mMode;

    public ModeSpinnerItem(String title, ModeOrder mode) {
        this.mTitle = title;
        this.mMode = mode;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public ModeOrder getMode() {
        return this.mMode;
    }
}