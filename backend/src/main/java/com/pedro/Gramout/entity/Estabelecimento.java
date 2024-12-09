package com.pedro.Gramout.entity;


import com.pedro.Gramout.entity.enums.CategoriaEstabelecimento;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@Table(name = "estabelecimento")
public class Estabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String profilePictureUrl;
    private String about;
    private float rating;
    private String contact;

    @Enumerated(EnumType.STRING)
    private CategoriaEstabelecimento category;
    // Aprimorar o endereço p/ entidade especilizada no futuro
    private String address;
    private String phone;


    @OneToMany(mappedBy = "estabelecimento", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Produto> produtos = new ArrayList<>();

    @OneToMany(mappedBy = "estabelecimento", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Publication> publications = new ArrayList<>();

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public void addPublication(Publication publication) {
        if (publications == null) {
            publications = new ArrayList<>();
        }
        publications.add(publication);
    }

    // No futuro, associar ao Conta

}
