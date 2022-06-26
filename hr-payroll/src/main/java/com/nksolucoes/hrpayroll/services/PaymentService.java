package com.nksolucoes.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nksolucoes.hrpayroll.entities.Payment;
import com.nksolucoes.hrpayroll.entities.Worker;
import com.nksolucoes.hrpayroll.feignClients.WorkerFeignClient;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId, int days) {

        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}