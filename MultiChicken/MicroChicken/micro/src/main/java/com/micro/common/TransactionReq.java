package com.micro.common;

import com.micro.module.Order;

import lombok.Data;

@Data
public class TransactionReq 
{
    private Order order;
    private Pay payment;
}
