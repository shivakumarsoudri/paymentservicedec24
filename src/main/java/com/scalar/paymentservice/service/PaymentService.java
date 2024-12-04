package com.scalar.paymentservice.service;


import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private PaymentGatewaySelector paymentGatewaySelector;
    public void PaymentGatewaySelector(PaymentGatewaySelector paymentGatewaySelector){
        this.paymentGatewaySelector=paymentGatewaySelector;
    }

    public void genereatePaymentLink(){

        //Logic to update  the DB when the payment starts

//        return paymentGatewaySelector.getPaymentGateway().generatePaymentLink();

    }



}
