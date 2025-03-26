package com.kisanconnect.contract_farming.Entity.AgreementDetails;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class TermCondition {

    private String tId;

    private String title;

    @Column(length = 1000)
    private String content;
}