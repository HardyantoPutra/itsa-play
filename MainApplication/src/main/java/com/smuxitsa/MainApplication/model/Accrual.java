package com.smuxitsa.MainApplication.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="Accrual")
public class Accrual {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer referenceNo;

    private LocalDateTime transferDate;

    private String otherInfo;

    private Integer Amt;

    @ManyToOne (fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "membershipId", nullable = false)
    private Membership membership;

    @ManyToOne (fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "programId", nullable = false)
    private Program program;

    @OneToOne(mappedBy = "accrual")
    private Transaction transaction;

    public Integer getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(Integer referenceNo) {
        this.referenceNo = referenceNo;
    }

    public LocalDateTime getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(LocalDateTime transferDate) {
        this.transferDate = transferDate;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    public Integer getAmt() {
        return Amt;
    }

    public void setAmt(Integer amt) {
        Amt = amt;
    }
}