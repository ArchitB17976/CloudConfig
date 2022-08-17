package com.micro.module;

import javax.persistence.*;
import javax.transaction.Transactional;

import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
@Transactional
public class Order 
{
    @Id
    @SequenceGenerator(name = "order_seq", initialValue = 111000, allocationSize = 1)
    @GeneratedValue(generator = "order_seq")
    private long id;
    private String customerName;
    private double totalAmount;
}
