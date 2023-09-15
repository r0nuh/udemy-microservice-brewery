package com.r0nuh.udemymicroservicebrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.r0nuh.udemymicroservicebrewery.web.model.BeerDTO;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
    return BeerDTO.builder().id(UUID.randomUUID())
            .beerName("Galaxy Cat")
            .beerStyle("Pale Ale")
            .build();
    }
}
