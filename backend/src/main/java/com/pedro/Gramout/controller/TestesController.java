package com.pedro.Gramout.controller;

import com.pedro.Gramout.entity.Estabelecimento;
import com.pedro.Gramout.entity.EventHappening;
import com.pedro.Gramout.entity.Publication;
import com.pedro.Gramout.entity.PublicationContent;
import com.pedro.Gramout.entity.enums.CategoriaEstabelecimento;
import com.pedro.Gramout.entity.enums.EventFrequency;
import com.pedro.Gramout.repository.EventHappeningRepository;
import com.pedro.Gramout.repository.PublicationContentRepository;
import com.pedro.Gramout.repository.PublicationRepository;
import com.pedro.Gramout.service.EstabelecimentoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @Autowired
    private EventHappeningRepository eventHappeningRepository;

    @GetMapping("/criar")
    public void create() {

        Estabelecimento estabelecimento = new Estabelecimento();
        estabelecimento.setName("Estabelecimento 1");
        estabelecimento.setAddress("Rua 1, 123");
        estabelecimento.setPhone("+55 99 1234567890");
        estabelecimento.setProfilePictureUrl("https://example.com/profile.jpg");
        estabelecimento.setAbout("Fundada em 2000, servimos comidas e bebidas deliciosas");
        estabelecimento.setCategory(CategoriaEstabelecimento.RESTAURANTE);

        estabelecimento.setFiltros(null);
        estabelecimentoService.save(estabelecimento);

        crairPostTeste();
        criarPostTeste2();
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

    public void criarPostTeste2() {
        Estabelecimento estabelecimento = new Estabelecimento();
                estabelecimento.setName("Estabelecimento 2");
                estabelecimento.setAbout("Bar novo na cidade, venha conhecer!");
                estabelecimento.setAddress("Rua 2, 123");
                estabelecimento.setPhone("+55 99 9876543210");
                estabelecimento.setProfilePictureUrl("https://example.com/profile2.jpg");
                estabelecimento.setCategory(CategoriaEstabelecimento.BAR);


        estabelecimentoService.save(estabelecimento);

        Publication publication = new Publication();
        publication.setEstabelecimento(estabelecimento);
        publicationRepository.save(publication);

        PublicationContent publicationContent = new PublicationContent();
         publicationContent.setText("Texto do post 2");
        publicationContent.setPublication(publication);

        publicationContentRepository.save(publicationContent);
        publication.setPublicationContent(publicationContent);
        publicationRepository.save(publication);
        estabelecimento.addPublication(publication);

        EventHappening eventHappening = new EventHappening();
        eventHappening.setEstabelecimento(estabelecimento);
        eventHappening.setTitle("Evento de inauguração");
        eventHappening.setDescription("Venha conhecer o novo bar da cidade");
        eventHappening.setStartDate(java.time.LocalDateTime.now());
        eventHappening.setEndDate(java.time.LocalDateTime.now().plusHours(3));
        eventHappening.setEventFrequency(EventFrequency.NOT_REPEAT);
        eventHappeningRepository.save(eventHappening);
    }
}
