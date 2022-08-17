package com.micro.common;

import com.micro.module.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TransactionRes 
{    
    private Order order;
    private double amount;
    private String response;
}
