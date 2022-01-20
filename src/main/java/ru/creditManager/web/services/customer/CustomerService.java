package ru.creditManager.web.services.customer;

import ru.creditManager.web.dtos.CustomerDto;
import ru.creditManager.web.models.customer.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

    void addCustomer(CustomerDto customerDto);
}
