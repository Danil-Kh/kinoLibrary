package org.example.kinolibrary.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Movies")
public class Movie {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "imdb_id")
    @NonNull
    private String imdbId;
    @NonNull
    private String title;
    @NonNull
    private String year;
    @NonNull
    private String rated;
    @NonNull
    private String released;
    @NonNull
    private String runtime;
    @NonNull
    private String genre;
    @NonNull
    private String director;
    private String writer;
    private String actors;
    private String plot;
    private String language;
    private String country;
    private String awards;
    private String poster;
    private String type;
    @Column(name = "box_Office")
    private String boxOffice;

}
