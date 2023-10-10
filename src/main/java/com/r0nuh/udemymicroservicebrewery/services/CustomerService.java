package com.r0nuh.udemymicroservicebrewery.services;

import java.util.UUID;

import com.r0nuh.udemymicroservicebrewery.web.model.CustomerDTO;

public interface CustomerService {

    CustomerDTO getCustomerById(UUID customerId);

    CustomerDTO saveNewCustomer(CustomerDTO customer);

    void updateCustomer(UUID customerId, CustomerDTO customerDTO);

    void deleteCustomerById(UUID customerId);
}
