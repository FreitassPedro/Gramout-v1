package com.pedro.Gramout.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table
public class PostContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "postContent")
    private Post post;

    private String text;
    private String imageUrl;
    private String videoUrl;

    private LocalDateTime createdAt = LocalDateTime.now();

    private Boolean isEdited = false;



}
