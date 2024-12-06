package com.pedro.Gramout.repository;

import com.pedro.Gramout.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
