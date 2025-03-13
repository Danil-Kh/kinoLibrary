package org.example.kinolibrary.service;

import lombok.RequiredArgsConstructor;
import org.example.kinolibrary.exception.ExceptionMessages;
import org.example.kinolibrary.exception.MovieException;
import org.example.kinolibrary.integration.omdbapi.ApiClient;
import org.example.kinolibrary.model.Movie;
import org.example.kinolibrary.model.User;
import org.example.kinolibrary.repository.MovieRepository;
import org.example.kinolibrary.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieServise {
    private final MovieRepository movieRepository;
    private final UserMovieService userMovieService;
    private final ApiClient apiClient;
    public Movie saveMovie(String title, User user) throws MovieException {
        Movie movie = apiClient.getMovie(title);
        if (movie.getResponse().equals("False")) {
            throw new MovieException(ExceptionMessages.MOVE_NOT_FOUND.getMessage());
        }
        if (movieRepository.findMoviesByImdbId(movie.getImdbId()) == null) {
            movie.getRatings().forEach(rating -> rating.setMovie(movie));
            movieRepository.save(movie);
        }

        userMovieService.saveUserMovie(movie, user);
        return movie;
    }
}
