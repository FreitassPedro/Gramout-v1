package com.pedro.Gramout.repository;

import com.pedro.Gramout.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
