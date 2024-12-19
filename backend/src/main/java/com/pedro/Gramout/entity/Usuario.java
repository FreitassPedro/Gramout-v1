package com.pedro.Gramout.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table()
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String firstName;
    private String lastName;
    private String bio;
    private String profilePicture;

}
