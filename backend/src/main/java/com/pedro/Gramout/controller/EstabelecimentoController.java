package com.pedro.Gramout.controller;

import com.pedro.Gramout.entity.Estabelecimento;
import com.pedro.Gramout.service.EstabelecimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estabelecimento")
public class EstabelecimentoController {

    @Autowired
    private EstabelecimentoService estabelecimentoService;

    @GetMapping("/criar")
    public void create() {

        Estabelecimento estabelecimento = new Estabelecimento();
        estabelecimento.setName("Estabelecimento 1");
        estabelecimento.setAddress("Rua 1, 123");
        estabelecimento.setPhone("1234567890");
        estabelecimento.setProfilePictureUrl("https://example.com/profile.jpg");
        estabelecimentoService.save(estabelecimento);

    }

    @GetMapping("/listar")
    public ResponseEntity<?> list() {
        return ResponseEntity.ok(estabelecimentoService.findAll());
    }
}
