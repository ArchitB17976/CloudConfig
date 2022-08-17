package com.micro.common;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Pay
{
    private long id;
    private String status;
    private long orderId;
    private double amount;
}