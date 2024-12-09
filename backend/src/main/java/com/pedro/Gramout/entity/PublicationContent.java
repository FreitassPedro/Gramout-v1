package com.pedro.Gramout.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table
public class PublicationContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "publicationContent")
    private Publication publication;

    private String text;
    private String imageUrl;
    private String videoUrl;

    private LocalDateTime createdAt = LocalDateTime.now();

    private Boolean isEdited = false;



}
