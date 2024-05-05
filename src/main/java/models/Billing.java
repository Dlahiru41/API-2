package models;

import java.math.BigDecimal;
import java.util.Date;

public class Billing {
    private int billingId; 
    private int patientIdentifier; 
    private BigDecimal billingAmount; 
    private Date billingInvoiceDate; 
    private boolean billingPaid; 

// Constructors, getters, and setters

    public Billing() {
    }

    public Billing(int billingId, int patientIdentifier, BigDecimal billingAmount, Date billingInvoiceDate, boolean billingPaid) {
        this.billingId = billingId;
        this.patientIdentifier = patientIdentifier;
        this.billingAmount = billingAmount;
        this.billingInvoiceDate = billingInvoiceDate;
        this.billingPaid = billingPaid;
    }

    public int getBillingId() { 
        return billingId;
    }

    public void setBillingId(int billingId) { 
        this.billingId = billingId;
    }

    public int getPatientIdentifier() { 
        return patientIdentifier;
    }

    public void setPatientIdentifier(int patientIdentifier) { 
        this.patientIdentifier = patientIdentifier;
    }

    public BigDecimal getBillingAmount() {
        return billingAmount;
    }

    public void setBillingAmount(BigDecimal billingAmount) { 
        this.billingAmount = billingAmount;
    }

    public Date getBillingInvoiceDate() {
        return billingInvoiceDate;
    }

    public void setBillingInvoiceDate(Date billingInvoiceDate) { 
        this.billingInvoiceDate = billingInvoiceDate;
    }

    public boolean isBillingPaid() { 
        return billingPaid;
    }

    public void setBillingPaid(boolean billingPaid) { 
        this.billingPaid = billingPaid;
    }

}
