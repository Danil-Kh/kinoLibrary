package org.example.kinolibrary.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Movies")
public class Movie {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "imdb_id")
    @JsonProperty("imdbID")
    @NonNull
    private String imdbId;

    @NonNull
    @JsonProperty("Title")
    private String title;

    @NonNull
    @JsonProperty("Year")
    private String year;

    @NonNull
    @JsonProperty("Rated")
    private String rated;

    @NonNull
    @JsonProperty("Released")
    private String released;

    @NonNull
    @JsonProperty("Runtime")
    private String runtime;

    @NonNull
    @JsonProperty("Genre")
    private String genre;

    @NonNull
    @JsonProperty("Director")
    private String director;

    @JsonProperty("Writer")
    private String writer;

    @JsonProperty("Actors")
    private String actors;

    @JsonProperty("Plot")
    private String plot;

    @JsonProperty("Language")
    private String language;

    @JsonProperty("Country")
    private String country;

    @JsonProperty("Awards")
    private String awards;

    @JsonProperty("Poster")
    private String poster;

    @JsonProperty("Ratings")
    private List<Rating> ratings;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Metascore")
    private String metascore;

    @JsonProperty("imdbRating")
    @Column(name = "imdb_rating")
    @NonNull
    private String imdbRating;

    @JsonProperty("imdbVotes")
    @Column(name = "imdb_votes")
    private int imdbVotes;

    @JsonProperty("boxOffice")
    @Column(name = "box_office")
    private String boxOffice;

}
