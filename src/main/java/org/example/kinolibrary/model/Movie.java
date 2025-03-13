package org.example.kinolibrary.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Set;


@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Movies")
@Setter
@Getter
@ToString
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Integer movieId;

    @Column(name = "imdb_id")
    @JsonProperty("imdbID")
    private String imdbId;

    @JsonProperty("Response")
    private String response;

    @JsonProperty("Title")
    private String title;

    @JsonProperty("Year")
    private String year;

    @JsonProperty("Rated")
    private String rated;

    @JsonProperty("Released")
    private String released;

    @JsonProperty("Runtime")
    private String runtime;

    @JsonProperty("Genre")
    private String genre;

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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "movie", orphanRemoval = true)
    private List<Rating> ratings;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("imdbRating")
    @Column(name = "imdb_rating")
    private String imdbRating;

    @JsonProperty("imdbVotes")
    @Column(name = "imdb_votes")
    private String imdbVotes;

    @JsonProperty("Metascore")
    private String metascore;


    @JsonProperty("BoxOffice")
    @Column(name = "box_office")
    private String boxOffice;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<UserMovie> userMovies;

}
