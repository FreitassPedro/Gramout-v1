package com.pedro.Gramout.controller;


import com.pedro.Gramout.service.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/post")
public class PublicationController {

    @Autowired
    private PublicationService publicationService;

}
