package org.example.kinolibrary.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users_movies")
@Getter
@Setter
public class UserMovie {
    @Id()
    @Column(name = "user_movie_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "movies_id")
    private Movie movie;

    public String status;
}
