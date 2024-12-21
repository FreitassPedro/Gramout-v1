package com.pedro.Gramout.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "galeria")
public class Galeria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estabelecimento_id")
    @JsonIgnore
    private Estabelecimento estabelecimento;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Media> images;

    public void addImage(Media image) {
        if (images == null) {
            images = new ArrayList<>();
        }
        images.add(image);
    }
}