package com.pedro.Gramout.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.pedro.Gramout.entity.enums.CategoriaEstabelecimento;
import com.pedro.Gramout.entity.enums.FiltrosEstabelecimento;
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
    private float rating = 0;

    @OneToMany(mappedBy = "estabelecimento", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval = true)
    @JsonManagedReference
    private List<EventHappening> eventsHappening;

    @Enumerated(EnumType.STRING)
    private CategoriaEstabelecimento category;

    // Aprimorar o endereço p/ entidade especilizada no futuro
    private String address;
    private String phone;

    @ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}) // Adjust cascade as needed
    @JoinTable(name = "galeria",  // Use "galeria" as the join table name
            joinColumns = @JoinColumn(name = "estabelecimento_id"),
            inverseJoinColumns = @JoinColumn(name = "media_id"))
    private List<Media> galleryMedias = new ArrayList<>();  // Rename to be more descriptive


    // Produtos refere-se a um cardápio 
    @OneToMany(mappedBy = "estabelecimento", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Produto> produtos = new ArrayList<>();

    @OneToMany(mappedBy = "estabelecimento", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Publication> publications = new ArrayList<>();

    @ElementCollection
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "estabelecimento_filtros", joinColumns = @JoinColumn(name = "estabelecimento_id"))
    @Column(name = "filtros") // Nome da coluna na tabela estabelecimento_filtros
    private List<FiltrosEstabelecimento> filtros = new ArrayList<>();

    @OneToMany(mappedBy = "estabelecimento", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BusinessHours> businessHours = new ArrayList<>();

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
    private void updateRating() {
        // Achar forma eficiente de atualizar a média
    }


}
