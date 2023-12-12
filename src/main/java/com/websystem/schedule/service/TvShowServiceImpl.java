package com.websystem.schedule.service;

import com.websystem.schedule.model.TvShow;
import com.websystem.schedule.repository.TvShowRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TvShowServiceImpl implements TvShowService{

    private final TvShowRepository tvShowRepository;

    public TvShowServiceImpl(TvShowRepository tvShowRepository) {
        this.tvShowRepository = tvShowRepository;
    }

    @Override
    public List<TvShow> listTvShows() {
       return tvShowRepository.findAll();
    }
}
