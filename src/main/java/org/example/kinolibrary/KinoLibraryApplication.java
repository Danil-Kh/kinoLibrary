package org.example.kinolibrary;

import org.example.kinolibrary.integration.omdbapi.OmdbApiClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "org.example.kinolibrary.repository")
public class KinoLibraryApplication {

    public static void main(String[] args) {

        SpringApplication.run(KinoLibraryApplication.class, args);

    }

}
