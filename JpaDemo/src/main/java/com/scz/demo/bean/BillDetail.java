package com.scz.demo.bean;

import javax.persistence.*;
import java.util.Set;

@Table(name = "dw_billdetail")
@Entity
public class BillDetail {
    @Id
    @Column(name = "id")
    private String id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pid")
    private Bill bill;
    public Bill getBill() {
        return bill;
    }
    public void setBill(Bill bill) {
        this.bill = bill;
    }

    @OneToMany(fetch = FetchType.LAZY,cascade = {CascadeType.REMOVE},mappedBy = "detail")
    private Set<AuditResult> auditResults;
    public Set<AuditResult> getAuditResults() {
        return auditResults;
    }
    public void setAuditResults(Set<AuditResult> auditResults) {
        this.auditResults = auditResults;
    }

    @Column(name = "item_id")
    private String itmeId;

    @Column(name = "item_name")
    private String itemName;

    public String getId() {
        return id;
    }

    public String getItmeId() {
        return itmeId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setItmeId(String itmeId) {
        this.itmeId = itmeId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
