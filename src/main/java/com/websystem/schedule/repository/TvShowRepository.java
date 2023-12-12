package com.websystem.schedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.websystem.schedule.model.TvShow;

public interface TvShowRepository extends JpaRepository<TvShow, Long> {

}
