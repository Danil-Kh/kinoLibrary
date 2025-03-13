package org.example.kinolibrary.controller;

import lombok.RequiredArgsConstructor;
import org.example.kinolibrary.exception.MovieException;
import org.example.kinolibrary.integration.omdbapi.ApiClient;
import org.example.kinolibrary.model.Movie;
import org.example.kinolibrary.model.User;
import org.example.kinolibrary.service.MovieServise;
import org.example.kinolibrary.service.UserService;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/api/v1/urls")
@RestController
@RequiredArgsConstructor
public class TestController {
   private final ApiClient apiClient;
   private final UserService userService;
   private final MovieServise movieServise;
    @GetMapping("test")
    public Movie test() throws MovieException {
        Movie movie;
//        User user = new User();
//        user.setUsername("rerere");
//        user.setPassword("rerere");
//        user.setEmail("rerere@example.com");
//        userService.saveUser(user);
        User user2 = userService.getUserById(2);

        movie = apiClient.getMovie("the lion king");

        System.out.println("movieRepository.saveMovie(movie, user2) = " + movieServise.saveMovie(movie.getTitle(), user2));

        return movie;
    }

}
