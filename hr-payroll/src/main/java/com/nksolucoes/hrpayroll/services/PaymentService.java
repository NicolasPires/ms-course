package com.nksolucoes.hrpayroll.services;

import com.nksolucoes.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long worderId, Integer days) {
        return new Payment("Bob", 200.0, days);
    }
}
