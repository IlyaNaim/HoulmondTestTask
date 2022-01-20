package ru.creditManager.web.services.customer.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.creditManager.web.dtos.CustomerDto;
import ru.creditManager.web.models.customer.Customer;
import ru.creditManager.web.repositories.CustomerRepository;
import ru.creditManager.web.services.customer.CustomerService;

import java.util.List;

@RequiredArgsConstructor
@Component
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public void addCustomer(CustomerDto customerDto) {
        if (customerDto.getEmail().length() != 0 &&
        customerDto.getFirstName().length() != 0 &&
        customerDto.getLastName().length() != 0 &&
        customerDto.getPatronymic().length() != 0 &&
        customerDto.getPassportNumber().length() != 0 &&
        customerDto.getTelephoneNumber().length() != 0){
            Customer customer = Customer.builder()
                    .firstName(customerDto.getFirstName())
                    .lastName(customerDto.getLastName())
                    .patronymic(customerDto.getPatronymic())
                    .email(customerDto.getEmail())
                    .telephoneNumber(customerDto.getTelephoneNumber())
                    .passportNumber(customerDto.getPassportNumber())
                    .build();
            customerRepository.save(customer);
        }
    }
}
