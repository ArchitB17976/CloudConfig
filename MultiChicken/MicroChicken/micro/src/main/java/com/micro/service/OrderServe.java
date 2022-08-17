package com.micro.service;

import javax.transaction.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.micro.common.Pay;
import com.micro.common.TransactionReq;
import com.micro.common.TransactionRes;
import com.micro.module.Order;
import com.micro.repository.OrderRepo;

@Service
public class OrderServe 
{
    @Autowired
    private OrderRepo rep;

    @Autowired
    private RestTemplate rTemp;

    //write methods
    public Order saveOrder(Order order)
    {
        return rep.save(order);
    }

    public TransactionRes saveOrder(TransactionReq tReq)
    {
        String repose = "";
        Order order = rep.save(tReq.getOrder());
        Pay payment = tReq.getPayment();
        payment.setOrderId(order.getId());
        payment.setAmount(order.getTotalAmount());

        Pay pRes = rTemp.postForObject("http://PAYMENT-SERVICE/paying/payment", payment, Pay.class);
        repose = pRes.getStatus().equals("Completed") ? "Payment processed, order placed" : "Order still in cart";
        
        TransactionRes tRes = new TransactionRes();
        tRes.setOrder(order);
        tRes.setAmount(pRes.getAmount());
        tRes.setResponse(repose);

        return tRes;
    }
}
