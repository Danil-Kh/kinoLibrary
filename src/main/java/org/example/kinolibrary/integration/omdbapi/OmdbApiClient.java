package org.example.kinolibrary.integration.omdbapi;



import org.springframework.web.reactive.function.client.WebClient;


public class OmdbApiClient {

    public static void main(String[] args) {
        ApiClient apiClient = new ApiClient(WebClient.builder());
        System.out.println("apiClient.getMovie(\"Matrix\") = " + apiClient.getMovie("Matrix"));

    }
}
