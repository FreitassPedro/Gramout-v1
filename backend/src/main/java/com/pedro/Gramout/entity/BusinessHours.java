package com.pedro.Gramout.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pedro.Gramout.entity.enums.DaysOfWeek;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;

@Entity
@Table()
@Data
public class BusinessHours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estabelecimento_id", referencedColumnName = "id")
    @JsonIgnore
    private Estabelecimento estabelecimento;;

    @Enumerated(EnumType.STRING)
    private DaysOfWeek dayOfWeek;

    private LocalTime openingTime;
    private LocalTime closingTime;



}
