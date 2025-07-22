package com.example.patterns.strategy;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PaymentProcessor {
    public Payment payment;

    public PaymentProcessor(Payment payment) {
        this.payment = payment;
    }

    public void pay() {
        payment.pay();
    }
}
