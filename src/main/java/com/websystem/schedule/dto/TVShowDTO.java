package com.websystem.schedule.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TVShowDTO {

    private Long id;

    private String name;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateTime;

    private String type;

    private String recurrence;

    private String description;

    public TVShowDTO(Long id, String name, LocalDateTime dateTime, String type, String recurrence, String description) {
        this.id = id;
        this.name = name;
        this.dateTime = dateTime;
        this.type = type;
        this.recurrence = recurrence;
        this.description = description;
    }
}
