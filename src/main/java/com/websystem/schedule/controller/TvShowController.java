package com.websystem.schedule.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.websystem.schedule.model.TvShow;
import com.websystem.schedule.service.TvShowService;

@RestController
@RequestMapping(value = "/tvshow")
public class TvShowController {
    private TvShowService tvShowService;

public TvShowController(TvShowService tvShowService) {
    this.tvShowService = tvShowService;
}
    @GetMapping("/detail")
    public ResponseEntity<TvShow> detail(@PathVariable Long Id) {
        return new ResponseEntity<>(tvShowService.getTvShowById(Id), HttpStatus.OK);
    }
}

