package com.pedro.Gramout.entity;

import com.pedro.Gramout.entity.enums.MediaType;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Table
@Entity
public class Daily extends Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    //Será possível adicionar uma imagem ou vídeo
    private MediaType mediaType;






}
