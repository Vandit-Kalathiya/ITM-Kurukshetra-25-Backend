package com.kisanconnect.cold_storage_service.model;

import lombok.Data;

import java.util.List;

@Data
public class CropDetails {
    private String type;
    private String variety;
    private String quantity;
    private String pricePerUnit;
    private List<String> qualityStandards;
}
