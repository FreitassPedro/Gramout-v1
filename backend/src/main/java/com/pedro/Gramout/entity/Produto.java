package com.pedro.Gramout.entity;

import com.pedro.Gramout.entity.enums.CategoriaPrato;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table()
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Double price;

    @Enumerated(EnumType.STRING)
    private CategoriaPrato categoriaPrato;

    @ManyToOne
    @JoinColumn(name = "restaurante_id")
    private Restaurante restaurante;;
}
