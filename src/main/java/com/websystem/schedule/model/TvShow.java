package com.websystem.schedule.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity(name="TvShow")
public class TvShow {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 250)
    private String name;

    @Column
    private LocalDateTime dateTime;

    @Column(nullable = true, length = 250)
    private String type;

    @Column(nullable = true, length = 250)
    private String recurrence;

    @Column(nullable = false, length = 600)
    private String description;

}
