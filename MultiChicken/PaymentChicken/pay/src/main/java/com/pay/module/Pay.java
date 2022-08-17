package com.pay.module;

import javax.persistence.*;
import javax.transaction.Transactional;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "payments")
@Entity
@Transactional

public class Pay
{
    @Id
    @SequenceGenerator(name = "pay_seq", initialValue = 111000, allocationSize = 1)
    @GeneratedValue(generator = "pay_seq")
    private long id;
    private String status;
    private long orderId;
    private double amount;
}