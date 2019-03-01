package com.scz.demo.controller;

import com.scz.demo.bean.Bill;
import com.scz.demo.bean.dto.BillDto;
import com.scz.demo.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Bill2Controller {

    @Autowired
    BillService billService;

    @RequestMapping("bill2/getBillByHisid")
    public Bill getBillByHisid() {
        String hisId = "1001-00000334.1301042-1211232180-1";
        Bill bill = billService.getByHisId(hisId);
        return bill;
    }

    @RequestMapping("bill2/getbill")
    public List<Bill> getBills(String tableParBegin, String tableParEnd) {
        tableParBegin = "20130101";
        tableParEnd = "20130103";

        List<Bill> list = billService.getBills(tableParBegin, tableParEnd);

        return list;
    }

    @RequestMapping("bill2/getBillByHisid2")
    BillDto getByHisId2(String hisId){
         hisId = "1001-00000334.1301042-1211232180-1";
         return billService.getByHisId2(hisId);
    }

}
