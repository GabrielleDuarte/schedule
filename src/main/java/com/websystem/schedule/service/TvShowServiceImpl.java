package com.websystem.schedule.service;

import org.springframework.stereotype.Service;
import com.websystem.schedule.model.TvShow;
import com.websystem.schedule.repository.TvShowRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TvShowServiceImpl implements TvShowService{

    private final TvShowRepository tvShowRepository;

    public TvShowServiceImpl(TvShowRepository tvShowRepository) {
        super();
        this.tvShowRepository = tvShowRepository;
    }

    @Override
    public List<TvShow> listTvShows() {
        var tvShows = tvShowRepository.findAll();
       return tvShows;
    }

    @Override
    public Optional<TvShow> getTvShowById(Long Id) {
        return Optional.ofNullable(tvShowRepository.findById(Id)
                .orElseThrow(() -> new IllegalStateException("The tv show equivalent to the id:" + Id + " does not exist")));
    }

    @Override
    public void createTvShow(TvShow tvShow) {
        tvShowRepository.save(tvShow);
    }

    @Override
    public List<TvShow> searchByName(String name) {
        return tvShowRepository.findByName(name);
    }
}
