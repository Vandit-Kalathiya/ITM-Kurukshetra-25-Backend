package com.kisanconnect.contract_farming.Repository;

import com.kisanconnect.contract_farming.Entity.Agreement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AgreementRepository extends JpaRepository<Agreement, String> {

    Optional<Agreement> findByTransactionHash(String transactionHash);
    Optional<Agreement> findByPdfHash(String pdfHash);

    Optional<Agreement> findByOrderId(String orderId);

    @Query("SELECT a FROM Agreement a WHERE a.farmerAddress = :address OR a.buyerAddress = :address")
    List<Agreement> findAgreementsByAddress(String address);
}
