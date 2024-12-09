package com.pedro.Gramout.controller;

import com.pedro.Gramout.entity.Estabelecimento;
import com.pedro.Gramout.entity.Publication;
import com.pedro.Gramout.entity.PublicationContent;
import com.pedro.Gramout.repository.PublicationContentRepository;
import com.pedro.Gramout.repository.PublicationRepository;
import com.pedro.Gramout.service.EstabelecimentoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Controller
@RequestMapping("/teste")
public class TestesController {

    @Autowired
    private EstabelecimentoService estabelecimentoService;

    @Autowired
    private PublicationRepository publicationRepository;

    @Autowired
    private PublicationContentRepository publicationContentRepository;

    @GetMapping("/criar")
    public void create() {

        Estabelecimento estabelecimento = new Estabelecimento();
        estabelecimento.setName("Estabelecimento 1");
        estabelecimento.setAddress("Rua 1, 123");
        estabelecimento.setPhone("1234567890");
        estabelecimento.setProfilePictureUrl("https://example.com/profile.jpg");
        estabelecimentoService.save(estabelecimento);

        crairPostTeste();
    }

    public void crairPostTeste() {
        // Crie a entidade Publication
        Publication publication = new Publication();
        Estabelecimento estabelecimento = estabelecimentoService.findById(1);
        publication.setEstabelecimento(estabelecimento);

// Salve a entidade Publication
        publicationRepository.save(publication);

// Crie a entidade PublicationContent e associe à Publication
        PublicationContent publicationContent = new PublicationContent();
        publicationContent.setText("Texto do post");
        publicationContent.setPublication(publication);

// Salve a entidade PublicationContent
        publicationContentRepository.save(publicationContent);

// Atualize a entidade Publication com o PublicationContent salvo
        publication.setPublicationContent(publicationContent);
        publicationRepository.save(publication);

        estabelecimento.addPublication(publication);
    }
}
