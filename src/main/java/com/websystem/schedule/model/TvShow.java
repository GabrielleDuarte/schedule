package com.websystem.schedule.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity(name="TvShow")
public class TvShow {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = true, length = 250)
    private String name;

    @Column
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateTime;

    @Column(nullable = true, length = 250)
    private String type;

    @Column(nullable = true, length = 250)
    private String recurrence;

    @Column(nullable = true, length = 600)
    private String description;

}
