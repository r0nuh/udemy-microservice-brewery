package com.r0nuh.udemymicroservicebrewery.web.mappers;

import org.mapstruct.Mapper;

import com.r0nuh.udemymicroservicebrewery.domain.Customer;
import com.r0nuh.udemymicroservicebrewery.web.model.CustomerDTO;

@Mapper
public interface CustomerMapper {

    CustomerDTO customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}
