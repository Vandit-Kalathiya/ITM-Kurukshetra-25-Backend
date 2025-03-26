package com.kisanconnect.cold_storage_service.model;


import lombok.Data;

import java.util.List;

@Data
public class ContractRequest {
    private String id;
    private FarmerInfo farmerInfo;
    private BuyerInfo buyerInfo;
    private CropDetails cropDetails;
    private DeliveryTerms deliveryTerms;
    private PaymentTerms paymentTerms;
    private List<TermCondition> termsConditions;
    private String additionalNotes;
}
