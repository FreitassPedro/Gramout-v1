package com.pedro.Gramout.entity;

import com.pedro.Gramout.entity.enums.MediaType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Video extends  Media{

   private final MediaType mediaType = MediaType.VIDEO;
}
