package org.example.kinolibrary.repository;

import org.example.kinolibrary.model.Movie;
import org.example.kinolibrary.model.User;
import org.example.kinolibrary.model.UserMovie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMovieRepository extends JpaRepository<UserMovie, Long> {
    UserMovie getUserMovieByUserAndMovie(User user, Movie movie);

    @Query("SELECT um FROM UserMovie um WHERE um.user.userId = :userId AND um.movie.movieId = :movieId")
    UserMovie testRepo(@Param("userId") int userId, @Param("movieId") int movieId);
}
