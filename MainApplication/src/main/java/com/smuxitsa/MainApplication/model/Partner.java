package com.smuxitsa.MainApplication.model;

import javax.persistence.*;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="Partner")
public class Partner {
    @Id
    private String partnerCode;

    private String partnerName;

    @OneToMany(mappedBy = "partner", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Program> programs;

    @OneToMany(mappedBy = "partner", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Membership> memberships;

    public String getPartnerCode() {
        return partnerCode;
    }

    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }





}