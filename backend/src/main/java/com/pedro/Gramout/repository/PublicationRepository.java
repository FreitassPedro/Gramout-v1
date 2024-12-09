package com.pedro.Gramout.repository;

import com.pedro.Gramout.entity.Publication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicationRepository extends JpaRepository<Publication, Long> {
}
