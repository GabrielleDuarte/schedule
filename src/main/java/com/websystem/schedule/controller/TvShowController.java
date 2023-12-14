package com.websystem.schedule.controller;


import com.websystem.schedule.model.TvShow;
import com.websystem.schedule.service.TvShowService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/tvshow")//localhots:8000/tvshow/detail/1
public class TvShowController {
    private TvShowService tvShowService;

    public TvShowController(TvShowService tvShowService) {
        this.tvShowService = tvShowService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<TvShow>> getTvShows() {
        return new ResponseEntity<>(tvShowService.listTvShows(), HttpStatus.OK);
    }

}