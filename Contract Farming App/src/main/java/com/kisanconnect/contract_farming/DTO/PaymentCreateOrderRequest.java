package com.kisanconnect.contract_farming.DTO;

import lombok.Data;

@Data
public class PaymentCreateOrderRequest {
    private String farmerAddress;
    private String buyerAddress;
    private String orderId;
    private Long amount;
}
