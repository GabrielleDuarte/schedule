package com.websystem.schedule.service;

import java.util.Optional;

import com.websystem.schedule.model.TvShow;

public interface TvShowService {
    public Optional<TvShow> getTvShowById(Long Id);
} 