package com.pedro.Gramout.service;

import com.pedro.Gramout.repository.EventHappeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventHappeningService {
    @Autowired
    private EventHappeningRepository eventHappeningRepository;
}
