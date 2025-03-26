package com.kisanconnect.contract_farming.Repository;


import com.kisanconnect.contract_farming.Entity.AgreementDetails.AgreementDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgreementDetailsRepository extends JpaRepository<AgreementDetails, String> {
    // Basic CRUD operations are provided by JpaRepository
}
