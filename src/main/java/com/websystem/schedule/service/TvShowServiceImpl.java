package com.websystem.schedule.service;

import com.websystem.schedule.dto.TvShowDTO;
import org.springframework.stereotype.Service;
import com.websystem.schedule.model.TvShow;
import com.websystem.schedule.repository.TvShowRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.modelmapper.ModelMapper;

@Service
public class TvShowServiceImpl implements TvShowService{

    private final TvShowRepository tvShowRepository;

    public TvShowServiceImpl(TvShowRepository tvShowRepository) {
        super();
        this.tvShowRepository = tvShowRepository;
    }

    @Override
    public List<TvShowDTO> listTvShows() {
        var tvShows = tvShowRepository.findAll();
        ModelMapper modelMapper = new ModelMapper();
        List<TvShowDTO> tvShowsListPage= new ArrayList<>();

       for (TvShow tS : tvShows){
          TvShowDTO tSListPage = modelMapper.map(tS, TvShowDTO.class);
           tvShowsListPage.add(tSListPage);
        }
       return tvShowsListPage;
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
}
