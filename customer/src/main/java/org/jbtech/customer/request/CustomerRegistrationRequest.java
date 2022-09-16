package org.jbtech.customer.request;

public record CustomerRegistrationRequest(
        String name,
        String email,
        String address
) {

}
