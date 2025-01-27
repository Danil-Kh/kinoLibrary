package org.example.kinolibrary.integration.omdbapi;



import lombok.AllArgsConstructor;
import org.example.kinolibrary.model.Movie;
import org.example.kinolibrary.service.MovieServise;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;


@Component
@AllArgsConstructor
public class OmdbApiClient {
    private final MovieServise movieServise;
    public static void main(String[] args) {

        ApiClient apiClient = new ApiClient(WebClient.builder());
        Movie movie = apiClient.getMovie("Casino");
        System.out.println("movie = " + movie);

    }
}
