package org.example.kinolibrary.service;

import lombok.RequiredArgsConstructor;
import org.example.kinolibrary.model.Movie;
import org.example.kinolibrary.model.User;
import org.example.kinolibrary.model.UserMovie;
import org.example.kinolibrary.repository.MovieRepository;
import org.example.kinolibrary.repository.UserMovieRepository;
import org.example.kinolibrary.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UserMovieService {
    private final UserMovieRepository userMovieRepository;
    private final MovieRepository movieRepository;
    private final UserRepository userRepository;

    public void saveUserMovie(Movie movie, User user) {
        Movie getMovie = movieRepository.findMoviesByImdbId(movie.getImdbId());
        User getUser = userRepository.findByUsername(user.getUsername());
        if (userMovieRepository.testRepo(getUser.getUserId(), getMovie.getMovieId()) == null){
            UserMovie userMovie = new UserMovie();
            userMovie.setUser(user);
            userMovie.setMovie(movie);
            userMovieRepository.save(userMovie);
        }
    }

}
