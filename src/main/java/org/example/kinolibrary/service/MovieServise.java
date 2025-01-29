package org.example.kinolibrary.service;

import lombok.RequiredArgsConstructor;
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
    public void saveMovie(Movie movie, User user) {
        movieRepository.save(movie);
        userMovieService.saveUserMovie(movie, user);


    }
}
