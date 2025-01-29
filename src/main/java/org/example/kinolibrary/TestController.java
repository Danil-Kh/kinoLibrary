package org.example.kinolibrary;

import lombok.RequiredArgsConstructor;
import org.example.kinolibrary.integration.omdbapi.ApiClient;
import org.example.kinolibrary.integration.omdbapi.AppConfig;
import org.example.kinolibrary.model.Movie;
import org.example.kinolibrary.model.Rating;
import org.example.kinolibrary.model.User;
import org.example.kinolibrary.repository.MovieRepository;
import org.example.kinolibrary.repository.RatingRepository;
import org.example.kinolibrary.service.MovieServise;
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
   private final MovieServise movieRepository;
    @GetMapping("test")
    public String test(){
        Movie movie;
//        User user = new User();
//        user.setUsername("rerere");
//        user.setPassword("rerere");
//        user.setEmail("rerere@example.com");
//        userService.saveUser(user);
        User user2 = userService.getUserById(1);

        movie = apiClient.getMovie("The Wolf of Wall Street");
        movie.getRatings().forEach(rating -> rating.setMovie(movie));

     movieRepository.saveMovie(movie, user2);

        return "test";
    }

}
