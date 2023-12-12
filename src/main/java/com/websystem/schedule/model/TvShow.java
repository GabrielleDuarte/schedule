package com.websystem.schedule.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Optional;
import java.util.stream.Collectors;

@Data
@Entity(name="TvShow")
public class TvShow {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 250)
    private String name;

    private LocalDate date;

    @Column(nullable = true, length = 250)

    private String type;

    @Column(nullable = true, length = 250)
    private String recurrence;

    @Column(nullable = false, length = 600)
    private String description;

    public TvShow(Long id, String name, LocalDate date, String type, String recurrence, String description) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.type = type;
        this.recurrence = recurrence;
        this.description = description;
    }

    public static TvShow fromTvShow(Optional<TvShow> tvShowOp) {
        return new TvShow(
                tvShowOp.get().getId(),
                tvShowOp.get().getName(),
                tvShowOp.get().getType(),
                tvShowOp.get().getRecurrence(),
                tvShowOp.get().getDescription();
                );
    }
}
