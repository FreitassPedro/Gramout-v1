package com.pedro.Gramout.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collections;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table
public class PublicationContent extends Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "publicationContent")
    @JsonIgnore
    private Publication publication;

    private String text;

    @OneToMany(mappedBy = "content", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Media> medias;

    private Boolean isEdited = false;

    public void setImages(List<Media> medias) {
        // Inicilizar imagens caso vazia ou nao existir
        if (medias == null || medias.isEmpty()) {
            throw new IllegalArgumentException("Images cannot be null or empty");
        }
        if (medias.size() >= 4) {
            throw new IllegalArgumentException("A publication can have at most 4 images");
        }
        this.medias = medias;
    }

    public List<Media> getMedias() {
        return medias == null ? Collections.emptyList() : medias;
    }
}
