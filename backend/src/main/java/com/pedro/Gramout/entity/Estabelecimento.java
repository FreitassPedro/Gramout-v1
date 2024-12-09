package com.pedro.Gramout.entity;


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
    // Aprimorar o endereço p/ entidade especilizada no futuro
    private String address;
    private String phone;

    @OneToMany(mappedBy = "estabelecimento", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Produto> produtos = new ArrayList<>();

    @OneToMany(mappedBy = "estabelecimento", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Post> posts;

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }



    // No futuro, associar ao Conta

}
