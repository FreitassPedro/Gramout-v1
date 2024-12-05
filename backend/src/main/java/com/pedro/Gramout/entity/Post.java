package com.pedro.Gramout.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table()
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String URL;
    private String description;
    // Adicionar foto do post
    private String photoUrl;

    private LocalDateTime date;

    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "restaurante_id")
    private Restaurante restaurante;


}
