package com.smuxitsa.MainApplication.model;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="Transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer transactionId;

    private String outcomeCode;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "referenceNo", referencedColumnName = "referenceNo")
    private Accrual accrual;


    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public String getOutcomeCode() {
        return outcomeCode;
    }

    public void setOutcomeCode(String outcomeCode) {
        this.outcomeCode = outcomeCode;
    }
}