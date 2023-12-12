package com.websystem.schedule.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import com.websystem.schedule.model.TvShow;
import com.websystem.schedule.repository.TvShowRepository;

@Service
public class TvShowServiceImpl implements TvShowService{
    
    private final TvShowRepository tvShowRepository;

    public TvShowServiceImpl(TvShowRepository tvShowRepository) {
        this.tvShowRepository = tvShowRepository;
    }

    @Override
    public Optional<TvShow> getTvShowById(Long Id) {
        return tvShowRepository.findById(Id)
        .map(DetalhesUsuario::fromUsuario)
        .orElseThrow(() -> new UsernameNotFoundException(message.get("erro.usuario.nao-autorizado")));;
    }

}
