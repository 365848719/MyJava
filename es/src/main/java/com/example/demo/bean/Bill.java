package com.example.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "dw_bill")
@Entity
public class Bill {

    @Column(name = "hisId")
    private String hisId;

    @Column(name = "bill_date")
    private Date billDate;

    @Column(name = "hospital_id")
    private String hospitalId;

    @Column(name = "hospital_name")
    private String hospitalName;

    @Column(name = "table_par")
    private String tablePar;

    public String getHisId() {
        return hisId;
    }
    public void setHisId(String hisId) {
        this.hisId = hisId;
    }

    public Date getBillDate() {
        return billDate;
    }
    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getHospitalId() {
        return hospitalId;
    }
    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getTablePar() {
        return tablePar;
    }
    public void setTablePar(String tablePar) {
        this.tablePar = tablePar;
    }

}
