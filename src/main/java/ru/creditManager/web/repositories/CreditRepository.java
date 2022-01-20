package ru.creditManager.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.creditManager.web.models.credit.Credit;

public interface CreditRepository extends JpaRepository<Credit, Long> {
}
