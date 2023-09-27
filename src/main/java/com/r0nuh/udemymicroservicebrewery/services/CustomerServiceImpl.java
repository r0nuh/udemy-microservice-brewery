package com.r0nuh.udemymicroservicebrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.r0nuh.udemymicroservicebrewery.web.model.CustomerDTO;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .name("Han Solo")
                .build();
    }
}
