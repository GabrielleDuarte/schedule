package com.websystem.schedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.websystem.schedule.model.TvShow;

import java.util.List;


public interface TvShowRepository extends JpaRepository<TvShow, Long> {

    List<TvShow> findByName(String name);

}
