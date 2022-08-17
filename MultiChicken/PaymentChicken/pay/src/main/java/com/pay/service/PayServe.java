package com.pay.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pay.module.Pay;
import com.pay.repository.PayRepo;

@Service
public class PayServe 
{
    @Autowired
    private PayRepo rep;

    Random random = new Random();

    public Pay makePayment(Pay pay)
    {
        pay.setStatus(paymentProcess());
        return rep.save(pay);
    }

    public String paymentProcess() // simulating 3rd party involvement
    {
        return random.nextBoolean() ? "Completed" : "Incomplete";
    }
}
