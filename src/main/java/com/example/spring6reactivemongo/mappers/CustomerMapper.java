package com.example.spring6reactivemongo.mappers;

import com.example.spring6reactivemongo.domain.Customer;
import com.example.spring6reactivemongo.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerDTO customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}
