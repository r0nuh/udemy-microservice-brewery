package com.r0nuh.udemymicroservicebrewery.services;

import java.util.UUID;

import com.r0nuh.udemymicroservicebrewery.web.model.BeerDTO;
public interface BeerService {
    BeerDTO getBeerById(UUID beerId);
}
