package com.ibm.bamoe.poc.service;

import com.ibm.bamoe.poc.Applicant;
import com.ibm.bamoe.poc.CreditCard;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CreditCardService {

    // Calculate credit limit based on income (simplified logic)
    public CreditCard generateCreditCardDetails(Applicant applicant) {

        double creditLimit = applicant.getAnnualIncome() * 0.3;
        return new CreditCard(applicant.getName(), creditLimit);
    }
}

