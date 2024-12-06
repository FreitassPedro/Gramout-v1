package com.pedro.Gramout.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table()
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estabelecimento_id", referencedColumnName = "id")
    private Estabelecimento estabelecimento;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "post_content_id")
    private PostContent postContent;

}
