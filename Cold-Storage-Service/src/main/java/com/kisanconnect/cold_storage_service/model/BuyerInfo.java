package com.kisanconnect.cold_storage_service.model;

import jakarta.persistence.Lob;
import lombok.Data;

@Data
public class BuyerInfo {
    private String buyerName;
    private String buyerAddress;
    private String buyerContact;
    @Lob
    private byte[] buyerSignature;
}
