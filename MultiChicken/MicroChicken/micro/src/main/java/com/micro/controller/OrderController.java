package com.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.micro.common.TransactionReq;
import com.micro.common.TransactionRes;
import com.micro.service.OrderServe;

@RestController
@RequestMapping("/orders")
public class OrderController 
{
    @Autowired
    private OrderServe serve;

    @PostMapping("/bookorder")
    public TransactionRes bookOrder(@RequestBody TransactionReq order)
    {
        return serve.saveOrder(order);
    }
}
