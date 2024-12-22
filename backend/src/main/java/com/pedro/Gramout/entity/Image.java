package com.pedro.Gramout.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("IMAGE")
public class Image extends Media {

}