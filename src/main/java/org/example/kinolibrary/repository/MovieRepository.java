package org.example.kinolibrary.repository;

import org.example.kinolibrary.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
    Movie findMoviesByImdbId(String imdbId);
}
