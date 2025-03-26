package com.kisanconnect.cold_storage_service.model;

import lombok.Data;

@Data
public class DeliveryTerms {
    private String date;
    private String location;
    private String transportation;
    private String packaging;
}
