package com.pedro.Gramout.repository;

import com.pedro.Gramout.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

    @Query("SELECT ROUND(AVG(r.rating), 1)  " +
            "FROM Review r " +
            "WHERE r.estabelecimentoId.id = :id")
    float findRatingByEstabalecimentoId(int id);
}
