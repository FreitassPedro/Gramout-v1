package com.pedro.Gramout.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table()
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String profilePicture;
    private String address;
    private String phone;

    private List<Cardapio> cardapioList;






}
