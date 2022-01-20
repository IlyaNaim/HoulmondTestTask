package ru.creditManager.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.creditManager.web.models.bank.Bank;

public interface BankRepository extends JpaRepository<Bank, Long> {
}
