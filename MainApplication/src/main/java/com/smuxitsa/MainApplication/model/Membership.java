package com.smuxitsa.MainApplication.model;

import javax.persistence.*;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="Membership")
public class Membership {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer membershipId;


    @ManyToOne (fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @OneToMany(mappedBy = "membership",fetch = FetchType.LAZY,
                cascade = CascadeType.ALL)
    private Set <Accrual> accruals;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "partnerCode", nullable = false)
    private Partner partner;

    public Integer getMembershipId() {
        return membershipId;
    }



    public void setMembershipId(Integer membershipId) {
        this.membershipId = membershipId;
    }


    @Override
    public String toString() {
        return String.format("Vessel [name=%s",
                this.membershipId);
    }





}