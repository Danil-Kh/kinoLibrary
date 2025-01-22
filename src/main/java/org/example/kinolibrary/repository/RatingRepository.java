package org.example.kinolibrary.repository;

import org.example.kinolibrary.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RatingRepository extends JpaRepository<Rating, Long> {
}
