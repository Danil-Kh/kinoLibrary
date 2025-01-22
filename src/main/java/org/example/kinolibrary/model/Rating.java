package org.example.kinolibrary.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NonNull;


@Data
@Table(name = "Ratings")
public class Rating {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "move_id")
    private int moveId;

    @NonNull
    @JsonProperty("Source")
    private String source;

    @NonNull
    @JsonProperty("Value")
    private String value;
}

