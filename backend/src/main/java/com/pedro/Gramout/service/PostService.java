package com.pedro.Gramout.service;

import com.pedro.Gramout.repository.PublicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PublicationRepository publicationRepository;

}
