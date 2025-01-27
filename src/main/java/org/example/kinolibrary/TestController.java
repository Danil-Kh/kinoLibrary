package org.example.kinolibrary;

import lombok.RequiredArgsConstructor;
import org.example.kinolibrary.integration.omdbapi.ApiClient;
import org.example.kinolibrary.integration.omdbapi.AppConfig;
import org.example.kinolibrary.model.Movie;
import org.example.kinolibrary.model.Rating;
import org.example.kinolibrary.model.User;
import org.example.kinolibrary.repository.MovieRepository;
import org.example.kinolibrary.repository.RatingRepository;
import org.example.kinolibrary.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RequestMapping("/api/v1/urls")
@RestController
@RequiredArgsConstructor
public class TestController {
   private final ApiClient apiClient;
   private final UserService userService;
   private final MovieRepository movieRepository;
    @GetMapping("test")
    public String test(){
        Movie movie;
        movie = apiClient.getMovie("john wick");
        movie.getRatings().forEach(rating -> rating.setMovie(movie));

     movieRepository.save(movie);

        return "test";
    }

}
