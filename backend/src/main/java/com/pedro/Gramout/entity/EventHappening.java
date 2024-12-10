package com.pedro.Gramout.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pedro.Gramout.entity.enums.EventFrequency;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table()
public class EventHappening {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "estabelecimento_id")
    @JsonIgnore
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
