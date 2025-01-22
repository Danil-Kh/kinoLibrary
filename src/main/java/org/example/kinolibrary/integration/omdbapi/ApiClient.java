package org.example.kinolibrary.integration.omdbapi;


import org.example.kinolibrary.model.Movie;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ApiClient {
    private final WebClient webClient;
    @Value("${API.KEY}")
    private String apiKey;
    public ApiClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://www.omdbapi.com/?apikey=").build();
    }
    public Movie getMovie(String title) {
        return webClient
                .get()
                .retrieve()
                .bodyToMono(Movie.class)
                .block();
    }

}