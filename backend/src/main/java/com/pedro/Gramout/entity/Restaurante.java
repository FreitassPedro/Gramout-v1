package com.pedro.Gramout.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter
@Setter
@Table()
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String profilePictureUrl;
    // Aprimorar o endereço p/ entidade especilizada no futuro
    private String address;
    private String phone;

    @OneToMany(mappedBy = "restaurante", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Produto> produtos = new ArrayList<>();

    @OneToMany(mappedBy = "restaurante", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Post> posts = new ArrayList<>();

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }


}
