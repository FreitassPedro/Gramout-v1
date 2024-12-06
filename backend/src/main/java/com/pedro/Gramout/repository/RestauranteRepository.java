package com.pedro.Gramout.repository;

import com.pedro.Gramout.entity.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestauranteRepository extends JpaRepository<Estabelecimento, Integer> {
}
