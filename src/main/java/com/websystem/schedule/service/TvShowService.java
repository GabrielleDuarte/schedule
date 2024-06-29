package com.websystem.schedule.service;

import java.util.Optional;

import com.websystem.schedule.dto.TVShowDTO;
import com.websystem.schedule.model.TvShow;

import java.util.List;

public interface TvShowService {
    List<TvShow> listTvShows();
      
    Optional<TvShow> getTvShowById(Long Id);

    void createTvShow(TvShow tvShow);

    List<TvShow> searchByName(String name);

    void updateTVShow(TVShowDTO tvShow);

    void deleteTVShow(Long id);
}

