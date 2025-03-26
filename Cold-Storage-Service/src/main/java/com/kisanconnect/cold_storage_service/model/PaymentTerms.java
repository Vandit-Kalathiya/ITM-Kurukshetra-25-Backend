package com.kisanconnect.cold_storage_service.model;

import lombok.Data;

@Data
public class PaymentTerms {
    private String totalValue;
    private String method;
    private String advancePayment;
    private String balanceDue;
}
