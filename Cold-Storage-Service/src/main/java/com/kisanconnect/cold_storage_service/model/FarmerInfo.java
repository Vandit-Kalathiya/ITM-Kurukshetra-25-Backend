package com.kisanconnect.cold_storage_service.model;

import jakarta.persistence.Lob;
import lombok.Data;

@Data
public class FarmerInfo {
    private String farmerName;
    private String farmerAddress;
    private String farmerContact;
    @Lob
    private byte[] farmerSignature;
}
