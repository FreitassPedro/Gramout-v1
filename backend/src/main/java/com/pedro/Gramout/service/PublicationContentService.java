package com.pedro.Gramout.service;

import com.pedro.Gramout.repository.PublicationContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublicationContentService {

    @Autowired
    private PublicationContentRepository publicationContentRepository;

}
