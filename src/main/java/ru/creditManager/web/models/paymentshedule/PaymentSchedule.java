package ru.creditManager.web.models.paymentshedule;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "payment-schedule")
public class PaymentSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "date")
    Date date;

    @Column(name = "payment_sum")
    BigDecimal paymentSum;

    @Column(name = "principal_repayment_amount")
    BigDecimal principalRepaymentAmount;

    @Column(name = "interest_payment_amount")
    BigDecimal interestPaymentAmount;
}
