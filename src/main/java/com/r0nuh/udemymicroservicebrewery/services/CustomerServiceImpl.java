package com.r0nuh.udemymicroservicebrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.r0nuh.udemymicroservicebrewery.web.model.CustomerDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .name("Han Solo")
                .build();
    }

    @Override
    public CustomerDTO saveNewCustomer(CustomerDTO customer) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDTO customerDTO) {
        //todo implement method
        log.debug("Update customer...");
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        log.debug("Deleted a customer...");
    }
}
