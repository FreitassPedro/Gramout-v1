package com.pedro.Gramout.controller;

import com.pedro.Gramout.entity.*;
import com.pedro.Gramout.entity.dto.EstabelecimentoDTO;
import com.pedro.Gramout.entity.enums.CategoriaEstabelecimento;
import com.pedro.Gramout.entity.enums.DaysOfWeek;
import com.pedro.Gramout.entity.enums.EventFrequency;
import com.pedro.Gramout.entity.enums.FiltrosEstabelecimento;
import com.pedro.Gramout.repository.*;
import com.pedro.Gramout.service.EstabelecimentoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.SequencedCollection;

@Slf4j
@Controller
@RequestMapping("/teste")
public class TestesController {

    @Autowired
    private EstabelecimentoService estabelecimentoService;

    @Autowired
    private EstabelecimentoRepository estabelecimentoRepository;

    @Autowired
    private PublicationRepository publicationRepository;

    @Autowired
    private PublicationContentRepository publicationContentRepository;

    @Autowired
    private EventHappeningRepository eventHappeningRepository;

    @Autowired
    private MediaRepository mediaRepository;

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private BusinessHoursRepository businessHoursRepository;

    @Autowired
    private ReviewMediaRepository reviewMediaRepository;

    @GetMapping("/criar")
    public ResponseEntity<List<Estabelecimento>> create() {

        Estabelecimento estabelecimento = new Estabelecimento();
        estabelecimento.setName("Estabelecimento 1");
        estabelecimento.setAddress("Rua 1, 123");
        estabelecimento.setPhone("+55 99 1234567890");
        estabelecimento.setProfilePictureUrl("https://example.com/profile.jpg");
        estabelecimento.setAbout("Fundada em 2000, servimos comidas e bebidas deliciosas");
        estabelecimento.setCategory(CategoriaEstabelecimento.RESTAURANTE);

        List<FiltrosEstabelecimento> filtros = List.of(FiltrosEstabelecimento.BRASILEIRA, FiltrosEstabelecimento.VEGANA);
        estabelecimento.setFiltros(filtros);
        estabelecimentoService.save(estabelecimento);

        criarPostPorTeste1();
        criarPostTeste2();
        criarEstabalecimento2();

        List<Estabelecimento>  estabelecimentos = estabelecimentoService.findAll();
        return ResponseEntity.ok(estabelecimentos);
    }

    private void criarEstabalecimento2() {
        Estabelecimento estabelecimento = new Estabelecimento();
        estabelecimento.setName("Cafeteria João");
        estabelecimento.setAddress("Rua das Flores, 11, Centro");
        estabelecimento.setPhone("+55 99 1234567890");
        estabelecimento.setProfilePictureUrl("https://example.com/profile.jpg");
        estabelecimento.setAbout("Cafeteria com café e bolos deliciosos");
        estabelecimento.setCategory(CategoriaEstabelecimento.CAFETERIA);

        estabelecimento.setFiltros(List.of(FiltrosEstabelecimento.MUSICA_AO_VIVO, FiltrosEstabelecimento.BRASILEIRA));
        List<BusinessHours> businessHours = createBusinessHoursAndSet();

        for (BusinessHours businessHour : businessHours) {
            businessHour.setEstabelecimento(estabelecimento);
        }
        estabelecimento.setBusinessHours(businessHours);
        estabelecimentoRepository.save(estabelecimento);
    }

    private List<BusinessHours> createBusinessHoursAndSet() {
        BusinessHours monday = new BusinessHours();
        monday.setDayOfWeek(DaysOfWeek.MONDAY);
        monday.setOpeningTime(java.time.LocalTime.of(8, 0));
        monday.setClosingTime(java.time.LocalTime.of(18, 0));

        BusinessHours tuesday = new BusinessHours();
        tuesday.setDayOfWeek(DaysOfWeek.TUESDAY);
        tuesday.setOpeningTime(java.time.LocalTime.of(8, 0));
        tuesday.setClosingTime(java.time.LocalTime.of(18, 0));

        BusinessHours sunday = new BusinessHours();
        sunday.setDayOfWeek(DaysOfWeek.SUNDAY);
        sunday.setOpeningTime(java.time.LocalTime.of(10, 0));
        sunday.setClosingTime(java.time.LocalTime.of(14, 0));

       return List.of(monday, tuesday, sunday);
    }

    @GetMapping("/businessHours")
    public void criarBusinessHoursList() {
        Estabelecimento estabelecimento = estabelecimentoService.findById(1);
        BusinessHours monday = new BusinessHours();
        monday.setDayOfWeek(DaysOfWeek.MONDAY);
        monday.setOpeningTime(java.time.LocalTime.of(8, 0));
        monday.setClosingTime(java.time.LocalTime.of(18, 0));
        monday.setEstabelecimento(estabelecimento);

        BusinessHours saturday= new BusinessHours();
        saturday.setDayOfWeek(DaysOfWeek.SATURDAY);
        saturday.setOpeningTime(java.time.LocalTime.of(10, 0));
        saturday.setClosingTime(java.time.LocalTime.of(14, 0));
        saturday.setEstabelecimento(estabelecimento);

        estabelecimento.getBusinessHours().add(monday);
        estabelecimento.getBusinessHours().add(saturday);

        estabelecimentoRepository.save(estabelecimento);
    }

    public void criarPostPorTeste1() {
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
        Estabelecimento estabelecimento = estabelecimentoService.findById(1);

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
        eventHappening.setEndDate(java.time.LocalDateTime.now().plusDays(3));
        eventHappening.setEventFrequency(EventFrequency.NOT_REPEAT);
        eventHappening.setInterested(0);
        eventHappeningRepository.save(eventHappening);
    }


    @GetMapping("/galeria")
    public void criarGaleria() {
        Estabelecimento estabelecimento = estabelecimentoService.findById(1);

        Image image1 = new Image();
        image1.setUrl("https://example.com/image1.jpg");

        estabelecimento.getGalleryMedias().add(image1);

        estabelecimentoRepository.save(estabelecimento);
    }

    @GetMapping("/mostrar")
    public ResponseEntity<?> mostrarEstabalecimento() {
        Estabelecimento estabelecimento = estabelecimentoService.findById(1);
        return ResponseEntity.ok(estabelecimento);
    }

    @GetMapping("/galeriaId1")
    public ResponseEntity<?> mostrarGaleria() {
        Estabelecimento estabelecimento = estabelecimentoService.findById(1);
        SequencedCollection<Media> galleryMedias = estabelecimento.getGalleryMedias();
        for (Media media : galleryMedias) {
            log.info("Media: {}", media.getMediaType());
        }
        return ResponseEntity.ok(galleryMedias);
    }

    @GetMapping("/avaliacao")
    public ResponseEntity<?> criarAvaliacao() {
        Estabelecimento estabelecimento = estabelecimentoService.findById(1);
        Review review1 = new Review();
        review1.setEstabelecimentoId(estabelecimento);
        review1.setRating(5);
        review1.setTitle("Excelente");
        review1.setDescription("Comida maravilhosa, atendimento excelente");

        criarUsuario1();
        Usuario usuario = usuarioRepository.findById(1).get();
        review1.setUserId(usuario);
        review1.setEstabelecimentoId(estabelecimento);

        Review review2 = new Review();
        review2.setEstabelecimentoId(estabelecimento);
        review2.setRating(4);
        review2.setTitle("Muito bom");
        review2.setDescription("Comida boa, atendimento bom");
        review2.setUserId(usuario);

        Review review3 = new Review();
        review3.setEstabelecimentoId(estabelecimento);
        review3.setRating(2);
        review3.setTitle("Ruim");
        review3.setDescription("Comida ruim, atendimento ruim");
        review3.setUserId(usuario);

        Image imgReview1 = new Image();
        imgReview1.setUrl("https://example.com/imageReview1.jpg");
        mediaRepository.save(imgReview1); // Save the Media entity first

        ReviewMedia reviewMedia1 = new ReviewMedia();
        reviewMedia1.setMedia(imgReview1);
        reviewMedia1.setReview(review1);

        review1.getReviewMedias().add(reviewMedia1);

        reviewRepository.save(review1);
        reviewRepository.save(review2);
        reviewRepository.save(review3);

        updateEstabalecimentoRating();
        return ResponseEntity.ok(review1);
    }

    private void updateEstabalecimentoRating() {
        Estabelecimento estabelecimento = estabelecimentoService.findById(1);

        float rating = reviewRepository.findRatingByEstabalecimentoId(1);
        estabelecimento.setRating(rating);
        estabelecimentoRepository.save(estabelecimento);
    }

    private Usuario criarUsuario1() {
        Usuario usuario = new Usuario();

        usuario.setUsername("JohnDoe1234");
        usuario.setFirstName("John");
        usuario.setLastName("Doe");
        usuario.setProfilePicture("https://example.com/profile.jpg");
        usuario.setBio("I'm a software developer");

        usuarioRepository.save(usuario);
        return usuario;
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<EstabelecimentoDTO> findByIdModelMapper(@PathVariable int id) {
        long inicio = System.currentTimeMillis();

        Estabelecimento estabelecimento = estabelecimentoService.findById(id);
        EstabelecimentoDTO estabelecimentoDTO = new EstabelecimentoDTO(
                estabelecimento.getName(),
                estabelecimento.getAbout(),
                estabelecimento.getRating(),
                estabelecimento.getCategory());

        long fim = System.currentTimeMillis();
        log.info("Tempo de execução: {} ms", fim - inicio);
        return ResponseEntity.ok(estabelecimentoDTO);
    }

}
