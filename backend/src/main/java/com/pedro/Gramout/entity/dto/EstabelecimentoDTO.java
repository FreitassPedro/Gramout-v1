package com.pedro.Gramout.entity.dto;

import com.pedro.Gramout.entity.enums.CategoriaEstabelecimento;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EstabelecimentoDTO {

    private String name;
    private String about;
    private float rating;
    private CategoriaEstabelecimento category;

    public EstabelecimentoDTO(String name, String about, float rating, CategoriaEstabelecimento category) {
        this.name = name;
        this.about = about;
        this.rating = rating;
        this.category = category;
    }
}
