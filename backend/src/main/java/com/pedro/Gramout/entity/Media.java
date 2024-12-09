package com.pedro.Gramout.entity;

import com.pedro.Gramout.entity.enums.MediaType;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table
public abstract  class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;
    private MediaType mediaType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "content_id")
    private Content content;
}
