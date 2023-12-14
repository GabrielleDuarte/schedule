package com.websystem.schedule.service;

import java.util.Optional;

import com.websystem.schedule.dto.TvShowDTO;
import com.websystem.schedule.model.TvShow;

import java.util.List;

public interface TvShowService {
    List<TvShowDTO> listTvShows();
      
    Optional<TvShow> getTvShowById(Long Id);

    void createTvShow(TvShow tvShow);
}

