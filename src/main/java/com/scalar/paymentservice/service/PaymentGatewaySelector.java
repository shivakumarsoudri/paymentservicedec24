package com.scalar.paymentservice.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentGatewaySelector {

    private RazorpayPaymentGateway razorpayPaymentGateway;
    private StripePaymentGateway stripePaymentGateway;

     public void PaymentGateway(RazorpayPaymentGateway razorpayPaymentGateway,StripePaymentGateway stripePaymentGateway)

     {
         this.razorpayPaymentGateway=razorpayPaymentGateway;
         this.stripePaymentGateway=stripePaymentGateway;
     }
public PaymentGateway getPaymentGateway(){


//         return stripePaymentGateway;
}

}
