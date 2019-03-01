package com.scz.demo.bean.dto;

import java.util.Date;

public class BillDetailDto {

    public BillDetailDto(String id, String pId, String itemId, String itemName, Date itemDate) {
        setId(id);
        setItemId(itemId);
        setpId(pId);
        setItemName(itemName);
        setItemDate(itemDate);
    }

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String itemId;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    private String itemName;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    private String pId;

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    private Date itemDate;

    public Date getItemDate() {
        return itemDate;
    }

    public void setItemDate(Date itemDate) {
        this.itemDate = itemDate;
    }

}
