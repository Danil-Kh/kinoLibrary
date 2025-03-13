package org.example.kinolibrary.controller;


import lombok.RequiredArgsConstructor;
import org.example.kinolibrary.exception.MovieException;
import org.example.kinolibrary.integration.omdbapi.ApiClient;
import org.example.kinolibrary.model.Movie;
import org.example.kinolibrary.model.User;
import org.example.kinolibrary.repository.MovieRepository;
import org.example.kinolibrary.service.MovieServise;
import org.example.kinolibrary.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/movie")
@RequiredArgsConstructor
public class MovieController {
    private final UserService userService;
    private final ApiClient apiClient;
    private final MovieServise movieServise;

    @PostMapping("/addMovie")
    public String addMovie(String title, User user) throws MovieException {
        User user2 = userService.getUserById(1);

        movieServise.saveMovie(title, user2);

            return "redirect:/";
    }
}
