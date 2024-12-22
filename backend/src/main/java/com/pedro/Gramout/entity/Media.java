package com.pedro.Gramout.entity;

import com.pedro.Gramout.entity.enums.MediaType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "media")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "media_type")
public abstract class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String url;

    public MediaType getMediaType() {
        return switch (this) {
            case Image image -> MediaType.IMAGE;
            case Video video -> MediaType.VIDEO;
            default -> null;
        };
    }
}