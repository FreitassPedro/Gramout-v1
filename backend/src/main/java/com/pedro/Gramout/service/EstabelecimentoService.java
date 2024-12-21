package com.pedro.Gramout.service;

import com.pedro.Gramout.entity.Estabelecimento;
import com.pedro.Gramout.repository.EstabelecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.SequencedCollection;

@Service
public class EstabelecimentoService {

    @Autowired
    private EstabelecimentoRepository estabelecimentoRepository;


    public void save(Estabelecimento estabelecimento) {
        estabelecimentoRepository.save(estabelecimento);
    }

    public SequencedCollection<Estabelecimento> findAll() {
        return estabelecimentoRepository.findAll();
    }

    public Estabelecimento findById(int id) {
        return estabelecimentoRepository.findById(id).orElse(null);
    }

    public void update(Estabelecimento estabelecimento) {
        estabelecimentoRepository.saveAndFlush(estabelecimento);
    }
}
