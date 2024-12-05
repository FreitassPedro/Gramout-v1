package com.pedro.Gramout.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table()
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String senha;
}
