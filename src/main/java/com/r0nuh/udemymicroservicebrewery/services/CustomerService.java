package com.r0nuh.udemymicroservicebrewery.services;

import java.util.UUID;

import com.r0nuh.udemymicroservicebrewery.web.model.CustomerDTO;

public interface CustomerService {

    CustomerDTO getCustomerById(UUID customerId);
}
