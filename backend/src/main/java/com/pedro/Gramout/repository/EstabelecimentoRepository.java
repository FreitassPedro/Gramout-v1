package com.pedro.Gramout.repository;

import com.pedro.Gramout.entity.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Integer> {

}
