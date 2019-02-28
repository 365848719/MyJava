package com.scz.demo.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javafx.beans.binding.SetBinding;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Table(name = "DW_BILL")
@Entity
public class Bill {

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY,cascade = {CascadeType.REMOVE},mappedBy = "bill")
    private Set<BillDetail> details;
    public Set<BillDetail> getDetails() {
        return details;
    }
    public void setDetails(Set<BillDetail> details) {
        this.details = details;
    }

    @Id
    @Column(name = "hisid")
    private String hisId;
    public String getHisId() {
        return hisId;
    }
    public void setHisId(String hisId) {
        this.hisId = hisId;
    }

    @Column(name = "id")
    private String id;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "billdate")
    private Date billDate;
    public Date getBillDate() {
        return billDate;
    }
    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    @Column(name = "hospital_id")
    private String hospitalId;
    public String getHospitalId() {
        return hospitalId;
    }
    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    @Column(name = "hospital_name")
    private String hospitalName;
    public String getHospitalName() {
        return hospitalName;
    }
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }


    @Column(name = "PATIENT_ID")
    private String patientId;
    public String getPatientId() {
        return patientId;
    }
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    @Column(name = "PATIENT_NAME")
    private String patientName;
    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /// <summary>
    /// 医保拒付金额（终审完成时更新）
    /// </summary>
    @Column(name = "BMI_NOPAY")
    private float bmiNoPay;
    public float getBmiNoPay() {
        return bmiNoPay;
    }
    public void setBmiNoPay(float bmiNoPay) {
        this.bmiNoPay = bmiNoPay;
    }

    @Column(name = "table_par")
    private String tablePar;
    public String getTablePar() {
        return tablePar;
    }
    public void setTablePar(String tablePar) {
        this.tablePar = tablePar;
    }


}
