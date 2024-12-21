package com.pedro.Gramout.entity;

import com.pedro.Gramout.entity.enums.MediaType;
import jakarta.persistence.DiscriminatorValue;
import lombok.Data;


@DiscriminatorValue("video")
@Data
public class Video extends  Media{

   private final MediaType mediaType = MediaType.VIDEO;
}
