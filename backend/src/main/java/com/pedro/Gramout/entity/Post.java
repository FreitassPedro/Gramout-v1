package com.pedro.Gramout.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table()
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String URL;
    private String description;


    // O autor se refere ao autor do post, mais para frente será implementado um sistema de login e @ do autor
    private String autor;


}
