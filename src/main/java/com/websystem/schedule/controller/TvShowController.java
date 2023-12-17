package com.websystem.schedule.controller;

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

    @CrossOrigin()
    @GetMapping("/list")
    public List<TvShow> getTvShows() {
        return tvShowService.listTvShows();
    }

    @CrossOrigin()
    @GetMapping("/details/{id}")
    public ResponseEntity<TvShow> details(@PathVariable Long id) {
        return new ResponseEntity<>(tvShowService.getTvShowById(id).get(), HttpStatus.OK);
    }

    @CrossOrigin()
    @PostMapping(value = "/register")
    public void registerTvShow(@RequestBody TvShow tvShow ) {
        tvShowService.createTvShow(tvShow);
    }

    @CrossOrigin()
    @GetMapping("/searchbyname")
    public ResponseEntity<List<TvShow>> searchByName(@RequestParam String name) {
        return new ResponseEntity<>(tvShowService.searchByName(name), HttpStatus.OK);
    }

}