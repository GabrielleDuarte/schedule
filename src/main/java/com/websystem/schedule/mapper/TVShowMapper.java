package com.websystem.schedule.mapper;


import com.websystem.schedule.dto.TVShowDTO;
import com.websystem.schedule.model.TvShow;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
    public interface TVShowMapper {
        void updateTVShowFromDto(TVShowDTO dto, @MappingTarget TvShow entity);
}

