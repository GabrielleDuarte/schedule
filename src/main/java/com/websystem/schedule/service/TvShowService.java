package com.websystem.schedule.service;

import java.util.Optional;
import com.websystem.schedule.model.TvShow;

import java.util.List;

public interface TvShowService {
    public List<TvShow> listTvShows();
      
    public Optional<TvShow> getTvShowById(Long Id);
}

