package com.smuxitsa.MainApplication.model;

import javax.persistence.*;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="Program")
public class Program {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer programId;

    private String programDescription;

    private String currencyName;

    private String programName;

    private String enrollmentLink;

    private String termsAndCondition;

    private String processingTime;

    @OneToMany(mappedBy = "program", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Accrual> accruals;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "partnerCode", nullable = false)
    private Partner partner;


    public Integer getProgramId() {
        return programId;
    }

    public void setProgramId(Integer programId) {
        this.programId = programId;
    }



    public String getProgramDescription() {
        return programDescription;
    }

    public void setProgramDescription(String programDescription) {
        this.programDescription = programDescription;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getEnrollmentLink() {
        return enrollmentLink;
    }

    public void setEnrollmentLink(String enrollmentLink) {
        this.enrollmentLink = enrollmentLink;
    }

    public String getTermsAndCondition() {
        return termsAndCondition;
    }

    public void setTermsAndCondition(String termsAndCondition) {
        this.termsAndCondition = termsAndCondition;
    }

    public String getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(String processingTime) {
        this.processingTime = processingTime;
    }

}
