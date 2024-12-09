package com.pedro.Gramout.controller;

import com.pedro.Gramout.service.EstabelecimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estabelecimento")
public class EstabelecimentoController {

    @Autowired
    private EstabelecimentoService estabelecimentoService;

    @GetMapping("/listar")
    public ResponseEntity<?> list() {
        return ResponseEntity.ok(estabelecimentoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> listById(@PathVariable int id) {

        return ResponseEntity.ok(estabelecimentoService.findById(id));
    }
}
