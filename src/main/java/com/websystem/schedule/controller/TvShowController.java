package com.websystem.schedule.controller;

import com.websystem.schedule.dto.TvShowDTO;
import com.websystem.schedule.model.TvShow;
import com.websystem.schedule.service.TvShowService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tvshow")//localhots:8000/tvshow/detail/1
public class TvShowController {
    private TvShowService tvShowService;

    public TvShowController(TvShowService tvShowService) {
        this.tvShowService = tvShowService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<TvShowDTO>> getTvShows() {
        return new ResponseEntity<>(tvShowService.listTvShows(), HttpStatus.OK);
    }
  
    @GetMapping("/detail")
    public ResponseEntity<TvShow> detail(@PathVariable Long Id) {
        return new ResponseEntity<>(tvShowService.getTvShowById(Id).get(), HttpStatus.OK);
    }

    @PostMapping(value = "/register")
    public void registerTvShow(@ModelAttribute TvShow tvShow ) {
        tvShowService.createTvShow(tvShow);
    }
}