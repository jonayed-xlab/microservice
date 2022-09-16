package org.jbtech.customer.service;

import org.jbtech.customer.model.Customer;
import org.jbtech.customer.repository.CustomerRepository;
import org.jbtech.customer.request.CustomerRegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {

    public void registerCustomer(CustomerRegistrationRequest request){
        Customer customer = Customer.builder()
                .name(request.name())
                .email(request.email())
                .address(request.address())
                .build();
        // todo: check if email valid
        // todo: check if email are taken
        // todo: save db
        customerRepository.save(customer);
    }
}
