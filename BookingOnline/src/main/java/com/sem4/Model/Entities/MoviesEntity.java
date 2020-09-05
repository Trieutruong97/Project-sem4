package com.sem4.Model.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movies")
public class MoviesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "movie_name")
    private String movie_name;
    @Column(name = "movie_description")
    private String movie_description;
    @Column(name = "movie_genres")
    private String movie_genres;
    @Column(name = "movie_release")
    private Date movie_release;
    @Column(name = "movie_length")
    private Time movie_length;

}
