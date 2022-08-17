package com.pay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pay.module.Pay;
import com.pay.service.PayServe;

@RestController
@RequestMapping("/paying")
public class PayControl 
{
    @Autowired
    private PayServe serve;

    @PostMapping("/payment")
    public Pay paying(@RequestBody Pay pay)
    {
        return serve.makePayment(pay);
    }
}
