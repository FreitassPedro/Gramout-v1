package com.pedro.Gramout.entity;

import com.pedro.Gramout.entity.enums.MediaType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@Table
public class Image extends Media {
    private MediaType mediaType = MediaType.IMAGE;

}
