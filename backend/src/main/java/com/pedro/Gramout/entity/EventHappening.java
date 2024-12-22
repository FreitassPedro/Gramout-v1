package com.pedro.Gramout.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.pedro.Gramout.entity.enums.EventFrequency;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


import java.time.LocalDateTime;

@Entity
@Data
@Table()
public class EventHappening {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "estabelecimento_id")
    @JsonBackReference
    private Estabelecimento estabelecimento;

    private String title;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private Integer interested;

   // Adicionar frequencia de repetição
    @Enumerated(EnumType.STRING)
    private EventFrequency eventFrequency;


}
