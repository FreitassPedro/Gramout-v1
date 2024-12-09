package com.pedro.Gramout.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table()
@EqualsAndHashCode(exclude = {"estabelecimento", "publicationContent"})
public class Publication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estabelecimento_id", referencedColumnName = "id")
    @JsonIgnore
    private Estabelecimento estabelecimento;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "publication_content_id")
    private PublicationContent publicationContent;

}
