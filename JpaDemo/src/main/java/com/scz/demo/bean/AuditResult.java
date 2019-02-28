package com.scz.demo.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Table(name = "AD_AUDITRESULT")
@Entity
public class AuditResult {

    @Id
    @Column(name = "id")
    private String id;


    @Column(name = "claim_id")
    private String claimId;

    @Column(name = "detail_id")
    private String detailId;

    @Column(name = "rule_code")
    private String ruleCode;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getClaimId() {
        return claimId;
    }
    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }



    public String getRuleCode() {
        return ruleCode;
    }
    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
    }

    public String getDetailId() {
        return detailId;
    }
    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    /*
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "detail_id")
    private BillDetail detail;

    public BillDetail getDetail() {
        return detail;
    }
    public void setDetail(BillDetail detail) {
        this.detail = detail;
    }

    @JsonIgnore
    private Bill bill;
    public Bill getBill() {
        return bill;
    }
    public void setBill(Bill bill) {
        this.bill = bill;
    }
    */

}
