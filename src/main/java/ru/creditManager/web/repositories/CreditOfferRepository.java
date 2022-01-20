package ru.creditManager.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.creditManager.web.models.creditoffer.CreditOffer;

public interface CreditOfferRepository extends JpaRepository<CreditOffer, Long> {
}
