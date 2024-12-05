package com.pedro.Gramout.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table()
public class Conta {

    private Long id;
    private String email;
    private String senha;
}
