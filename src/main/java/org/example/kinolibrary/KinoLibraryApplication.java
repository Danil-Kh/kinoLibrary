package org.example.kinolibrary;

import org.example.kinolibrary.integration.omdbapi.OmdbApiClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KinoLibraryApplication {

    public static void main(String[] args) {

        SpringApplication.run(KinoLibraryApplication.class, args);

    }

}
