package org.example.kinolibrary.integration.omdbapi;



import io.github.cdimascio.dotenv.Dotenv;
import org.example.kinolibrary.model.Movie;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ApiClient {
    private final WebClient webClient;
    public ApiClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://www.omdbapi.com").build();
    }
    public Movie getMovie(String title) {
        Dotenv dotenv = Dotenv.load();
        String apiKey = dotenv.get("API_KEY");
        return webClient
                .get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("apikey", apiKey)
                        .queryParam("t", title)
                        .build())
                .retrieve()
                .bodyToMono(Movie.class)
                .block();

    }

}