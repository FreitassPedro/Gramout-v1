package com.pedro.Gramout.entity;

import com.pedro.Gramout.entity.enums.MediaType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@DiscriminatorValue("image")
public class Image extends Media {
    private MediaType mediaType = MediaType.IMAGE;
}
