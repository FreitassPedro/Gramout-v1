package com.pedro.Gramout.entity;

import com.pedro.Gramout.entity.enums.MediaType;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // This is the strategy that will be used to store the data in the database
@DiscriminatorColumn(name = "media_type") // This is the column that will be used to determine the type of the media
public  class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;

    @Enumerated(EnumType.STRING)
    @Column(name = "media_type", insertable = false, updatable = false)
    private MediaType mediaType;

}
