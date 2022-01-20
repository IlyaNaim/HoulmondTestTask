package ru.creditManager.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.creditManager.web.models.customer.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
