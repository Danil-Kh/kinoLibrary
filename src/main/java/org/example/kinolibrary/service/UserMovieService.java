package org.example.kinolibrary.service;

import lombok.RequiredArgsConstructor;
import org.example.kinolibrary.model.Movie;
import org.example.kinolibrary.model.User;
import org.example.kinolibrary.model.UserMovie;
import org.example.kinolibrary.repository.UserMovieRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UserMovieService {
    private final UserMovieRepository userMovieRepository;

    public void saveUserMovie(Movie movie, User user) {
        UserMovie userMovie = new UserMovie();
        userMovie.setUser(user);
        userMovie.setMovie(movie);
        userMovieRepository.save(userMovie);
    }

}
