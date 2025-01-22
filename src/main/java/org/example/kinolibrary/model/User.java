package org.example.kinolibrary.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Entity
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private int id;

    @NonNull
    @NotBlank(message = "Username cannot be blank")
    private String username;

    @NonNull
    @NotBlank(message = "Password cannot be blank")
    private String password;

    @NonNull
    @Email
    @NotBlank(message = "Email cannot be blank")
    private String email;

}
