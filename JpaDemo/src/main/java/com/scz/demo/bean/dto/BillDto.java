package com.scz.demo.bean.dto;

import java.util.Date;

public class BillDto {

    private String hisId;
    public String getHisId() {
        return hisId;
    }
    public void setHisId(String hisId) {
        this.hisId = hisId;
    }

    private String id;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    private Date billDate;
    public Date getBillDate() {
        return billDate;
    }
    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    private String hospitalId;
    public String getHospitalId() {
        return hospitalId;
    }
    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    private String hospitalName;
    public String getHospitalName() {
        return hospitalName;
    }
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    private String patientId;
    public String getPatientId() {
        return patientId;
    }
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    private String patientName;
    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    private float bmiNoPay;
    public float getBmiNoPay() {
        return bmiNoPay;
    }
    public void setBmiNoPay(float bmiNoPay) {
        this.bmiNoPay = bmiNoPay;
    }

    private String tablePar;
    public String getTablePar() {
        return tablePar;
    }
    public void setTablePar(String tablePar) {
        this.tablePar = tablePar;
    }

    private BillDetailDto Details;
    public BillDetailDto getDetails() {
        return Details;
    }
    public void setDetails(BillDetailDto details) {
        Details = details;
    }

}
